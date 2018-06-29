package leetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode107_2 {

	static List<List<Integer>> result;
	public static void main(String[] args) {
		TreeNode root=getTree();
        List<List<Integer>> l=levelOrder(root);
        
        for(List<Integer> i:l) {
        	for(Integer j:i) {
        		System.out.print(j+" ");
        	}
        	System.out.println();
        }
	}
	
	public static void dfs(int index,TreeNode root) {
		if(root==null) {
			return ;
		}
		if(result.size()<=index) {
			result.add(new ArrayList<Integer>());
		}
		result.get(index).add(root.getVal());
		dfs(index+1,root.getLeft());
		dfs(index+1,root.getRight());
	}
	public static List<List<Integer>> levelOrder(TreeNode root){
		result=new ArrayList<List<Integer>>();
		dfs(0,root);
		result=listBack(result);
		return result;
	}
	public static List<List<Integer>> listBack(List<List<Integer>> list){
		List<List<Integer>> l=new ArrayList<List<Integer>>();
		int n=list.size();
		int i,j;
		for(i=n-1,j=0;j<n;j++,i--) {
			l.add(j, list.get(i));
		}
		return l;
	}
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
