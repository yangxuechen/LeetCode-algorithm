package leetCode2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class LeetCode637 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   TreeNode root =getTree();
           List<Double> list=averageOfLevels(root);
           System.out.println(list);
	}
	public static List<Double> averageOfLevels(TreeNode root) {
	        List<Double> list= new ArrayList<Double>();
	        if(root==null) {
	        	return list;
	        }
	        ArrayDeque<TreeNode> queue=new ArrayDeque<TreeNode>();
	        queue.addLast(root);
	        while(queue.isEmpty()==false) {
	        	int size=queue.size();
	        	long sum=0;
	        	for(int i=0;i<size;i++) {
	        		TreeNode node=queue.removeFirst();
	        		sum+=node.val;
	        		if(node.left!=null) {
	        			queue.addLast(node.left);
	        		}
	        		if(node.right!=null) {
	        			queue.addLast(node.right);
	        		}
	        	}
	        	double ave=(double)sum/size;
	        	list.add(ave);
	        }
	        return list;
	}
	
	public static TreeNode getTree() {
		TreeNode root =new TreeNode(3);
		TreeNode node1=new TreeNode(9);
		TreeNode node2=new TreeNode(20);
		TreeNode node3=new TreeNode(15);
		TreeNode node4=new TreeNode(7);
		
		root.left=node1;
		root.right=node2;
		
		node2.left=node3;
		node2.right=node4;
		return root;
		
	}

}
