package leetCode;
/**
 * 计算二叉树的最大深度
 * @author yangxuechen
 *
 */
public class LeetCode104 {

	public static void main(String[] args) {
		
     TreeNode t=getTree();
     int len=maxDepth(t);
     System.out.println(len);
	}
	 public static int maxDepth(TreeNode root) {
	  if(root==null) {
		  return 0;
	  }
	  int leftLength=maxDepth(root.getLeft())+1;
	  int rightLength=maxDepth(root.getRight())+1;
	  return leftLength>rightLength?leftLength:rightLength;
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
}
