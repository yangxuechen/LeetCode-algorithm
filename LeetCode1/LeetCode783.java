package leetCode2;

import java.util.ArrayDeque;

public class LeetCode783 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode root=getTree();
		int min=minDiffInBST(root);
		System.out.println(min);
	}
    public static int minDiffInBST(TreeNode root) {
        ArrayDeque<TreeNode> queue=new ArrayDeque<TreeNode>();  //队列结构用来遍历二叉树
        queue.addLast(root);
        int min=Integer.MAX_VALUE;              //最小差值
        while(!queue.isEmpty()) {
        	TreeNode node=queue.removeFirst();
        	int temp=findMin(node);
        	if(temp<min) {
        		min=temp;
        	}
        	if(node.left!=null) {
        		queue.addLast(node.left);
        	}
        	if(node.right!=null) {
        		queue.addLast(node.right);
        	}
        }
    	return min;
    }
    
    public static int findMin(TreeNode root) {
    	 ArrayDeque<TreeNode> queue=new ArrayDeque<TreeNode>();  //队列结构用来遍历二叉树
    	 if(root.left!=null) {
    		 queue.addLast(root.left);
    	 }
         if(root.right!=null) {
        	 queue.addLast(root.right);
         }
         int min=Integer.MAX_VALUE; //最小差值
         int value=root.val;
         while(!queue.isEmpty()) {
         	TreeNode node=queue.removeFirst();
         	int temp=Math.abs(node.val-value);
         	if(temp<min) {
         		min=temp;
         	}
         	if(node.left!=null) {
         		queue.addLast(node.left);
         	}
         	if(node.right!=null) {
         		queue.addLast(node.right);
         	}
         }
     	return min;
    }
    
    public static TreeNode getTree() {
    	TreeNode root=new TreeNode(90);
    	TreeNode node1=new TreeNode(69);
    	TreeNode node2=new TreeNode(49);
    	TreeNode node3=new TreeNode(89);
    	TreeNode node4=new TreeNode(52);
    	
    	root.left=node1;
    
    	
    	node1.left=node2;
    	node1.right=node3;
    	
    	node2.right=node4;
    	return root;
    }

}
