package leetCode;

public class LeetCode100 {

	private static ListNode head;
	public static void main(String[] args) {
		TreeNode root=getTree();
		preordertraversalBinaryTree(root);
        System.out.println("********************");
        
        TreeNode root1=getTree();
		preordertraversalBinaryTree(root1);
		System.out.println("********************");
//		boolean result=isSameTree(root,root1);
//		if(result) {
//			System.out.println("true");
//		}else {
//			System.out.println("false");
//		}
		ListNode h=treeValue(root);
		
		printList(h);
	}
	 
	//打印链表
	public static void printList(ListNode head) {
		ListNode h=head;
		while(h!=null) {
			System.out.print(h.val);
			h=h.next;
		}
	}
    
	//中序遍历二叉树
	public static void preordertraversalBinaryTree(TreeNode root) {
		if(root!=null) {
			preordertraversalBinaryTree(root.getLeft());
			System.out.println(root.getVal());
			preordertraversalBinaryTree(root.getRight());
		}
	}
	//将二叉树转换成链表
	public static ListNode treeValue(TreeNode root) {
		if(root!=null) {
			preordertraversalBinaryTree(root.getLeft());
			addValueToList(root.getVal(),head);
			preordertraversalBinaryTree(root.getRight());
		}
		return head;
	}
	public static void addValueToList(int value,ListNode head) {
		ListNode node=new ListNode(value);
		if(head==null) {
			head=node;
		}else {
			node.next=head.next;
			head.next=node;
		}
	}
	//构造一棵树
	public static TreeNode getTree() {
		TreeNode root=new TreeNode(8);
		TreeNode node1=new TreeNode(1);
		TreeNode node2=new TreeNode(2);
		TreeNode node3=new TreeNode(7);
		TreeNode node4=new TreeNode(9);
		root.setLeft(node1);
		root.setRight(node2);
		node1.setLeft(node3);
		node1.setRight(node4);
		return root;
	}
	
	//判断两颗二叉树是否相等
    public static boolean isSameTree(TreeNode p, TreeNode q) {
    	if(p==null&&q!=null) {
    		return false;
    	}
    	if(p!=null&&q==null) {
    		return false;
    	}
        if(p!=null&&q!=null) {
        	isSameTree(p.getLeft(),q.getLeft());
        	if(p.getVal()!=q.getVal()) {
        		return false;
        	}
        	isSameTree(p.getRight(),q.getRight());
        }
        return true;
    }
}
