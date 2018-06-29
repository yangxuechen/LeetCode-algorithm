package leetCode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class LeetCode107 {

	public static void main(String[] args) {
		TreeNode root=getTree();
		List<List<Integer>> list=levelOrderTraversal(root);
		for(List<Integer> l:list) {
			for(Integer i:l) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}
	 public static List<List<Integer>> levelOrderTraversal(TreeNode root) {
	    	if(root==null) {
	    		return null;
	    	}
	    	List<List<Integer>> list=new ArrayList<List<Integer>>();
	    	List<Integer> l1=new ArrayList<Integer>();
	    	l1.add(root.getVal());
	    	list.add(l1);
	    	ArrayDeque<TreeNode> queue=new ArrayDeque<TreeNode>();
	    	queue.addLast(root);            //根结点加入队列
	    	while(queue.isEmpty()==false) {
	    		ArrayList<Integer> l=null;
	    		ArrayList<Integer> pl=new ArrayList<Integer>();
	    		TreeNode node=queue.removeFirst();
	    	//	System.out.println(node.getVal());
	    		if(node.getLeft()!=null) {
	    			queue.addLast(node.getLeft());
	    			pl.add(node.getLeft().getVal());
	    		}
	    		if(node.getRight()!=null) {
	    			queue.add(node.getRight());
	    			pl.add(node.getRight().getVal());
	    		}
	    		l=queueValueAddToList(queue);
	    //	printList(l);
	    	list.add(pl);
	    	list.add(l);
	    	}
	    	return list;
	    }
	 
	 public static ArrayList<Integer> queueValueAddToList(ArrayDeque<TreeNode> queue){
		 if(queue==null) {
			 return null;
		 }
		 ArrayList<Integer> list=new ArrayList<Integer>();
		 while(queue.isEmpty()==false) {
			 TreeNode node=queue.removeFirst();
			 if(node.getLeft()!=null) {
	    			list.add(node.getLeft().getVal());
	    		}
	    		if(node.getRight()!=null) {
	    			list.add(node.getRight().getVal());
	    		}
		 }
		 return list;
	 }
	 //打印链表
	 public static void printList(List<Integer> list) {
		 for(Integer i:list) {
			 System.out.print(i+" ");
		 }
		 System.out.println();
	 }
	 //打印队列
	 public static void printQueue(ArrayDeque<TreeNode> queue) {
		 ArrayDeque<TreeNode> q=queue;
		 while(q.isEmpty()==false) {
			 System.out.print(q.removeFirst().getVal()+" ");
		 }
		 System.out.println();
	 }
	 
	 /**
	  *                8
	  *             /    \
	  *    /      1       2
	  *         /  \     /  \
	  *        7    9   10   11
	  *       /
	  *      12 
	  * @return
	  */
	 
	 //构造一颗二叉树
	 public static TreeNode getTree() {
			TreeNode root=new TreeNode(8);
			TreeNode node1=new TreeNode(1);
			TreeNode node2=new TreeNode(2);
			TreeNode node3=new TreeNode(7);
			TreeNode node4=new TreeNode(9);
			
			TreeNode node5=new TreeNode(10);
			TreeNode node6=new TreeNode(11);
			TreeNode node7=new TreeNode(12);
			root.setLeft(node1);
			root.setRight(node2);
			node1.setLeft(node3);
			node1.setRight(node4);
			
			node2.setLeft(node5);
			node2.setRight(node6);
			node3.setLeft(node7);
			return root;
		}
}
