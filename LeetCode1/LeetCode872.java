package leetCode2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class LeetCode872 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TreeNode h=getTree();
        TreeNode h2=getTree2();
        boolean b=leafSimilar(h,h2);
        if(b) {
        	System.out.println("true");
        }else {
        	System.out.println("false");
        }
//        List<Integer> l=getLeaf(h);
//        for(int i:l) {
//        	System.out.println(i);
//        }
	}
	
	public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
	    List<Integer> l1=getLeaf(root1);
	    List<Integer> l2=getLeaf(root2);
	    for(int i:l1) {
	    	System.out.print(i+" ");
	    }
	    System.out.println();
	    for(int i:l2) {
	    	System.out.print(i+" ");
	    }
	    if(l1.equals(l2)) {
	    	return true;
	    }
		return false;
	}
    public static List<Integer> getLeaf(TreeNode root){
    	List<Integer> list=new ArrayList<Integer>();  //存储叶子结点值
    	ArrayDeque<TreeNode> stack=new ArrayDeque<TreeNode>();
    	stack.push(root);
    	while(!stack.isEmpty()) {
    		TreeNode node=stack.pop();
    		if(node.left!=null) {
    			stack.push(node.left);
    		}
    		if(node.right!=null) {
    			stack.push(node.right);
    		}
    		if(node.left==null&&node.right==null) {
    			list.add(node.val);
    		}
    	}
    	return list;
    }
    
    public static TreeNode getTree() {
    	TreeNode head=new TreeNode(3);
    	TreeNode n1=new TreeNode(5);
    	TreeNode n2=new TreeNode(1);
    	TreeNode n3=new TreeNode(6);
    	TreeNode n4=new TreeNode(2);
    	TreeNode n5=new TreeNode(9);
    	TreeNode n6=new TreeNode(8);
    	TreeNode n7=new TreeNode(7);
    	TreeNode n8=new TreeNode(4);
    	
    	head.left=n1;
    	head.right=n2;
    	n1.left=n3;
    	n1.right=n4;
    	n2.left=n5;
    	n2.right=n6;
    	
    	n4.left=n7;
    	n4.right=n8;
    	
    	return head;
    }
    public static TreeNode getTree2() {
    	TreeNode head=new TreeNode(3);
    	TreeNode n1=new TreeNode(5);
    	TreeNode n2=new TreeNode(1);
    	TreeNode n3=new TreeNode(6);
    	TreeNode n4=new TreeNode(7);
    	TreeNode n5=new TreeNode(4);
    	TreeNode n6=new TreeNode(2);
    	TreeNode n7=new TreeNode(9);
    	TreeNode n8=new TreeNode(8);
    	
    	head.left=n1;
    	head.right=n2;
    	n1.left=n3;
    	n1.right=n4;
    	n2.left=n5;
    	n2.right=n6;
    	
    	n6.left=n7;
    	n6.right=n8;
    	
    	return head;
    }
    
}
