package leetCode2;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Set;

public class LeetCode653 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       TreeNode root =getTree();
       boolean b=findTarget(root,8);
       if(b) {
    	   System.out.println("true");
       }else {
    	   System.out.println("false");
       }
	}
	
    public static boolean findTarget(TreeNode root,int k) {
    	if(null==root) {
    		return false;
    	}
    	ArrayDeque<TreeNode> stack=new ArrayDeque<TreeNode>();  //用来遍历二叉树的stack
    	Set<Integer> set=new HashSet<Integer>();                //用来存储target
    	stack.push(root);
    	while(!stack.isEmpty()) {
    		TreeNode node=stack.pop();
    	//	System.out.println(node.val);
    		if(set.contains(node.val)) {
    			return true;
    		}else {
    			set.add(k-node.val);
    		}
    		if(node.right!=null) {
    			stack.push(node.right);
    		}
    		if(node.left!=null) {
    			stack.push(node.left);
    		}
    		
    	}
    	return false;
    }
    
    /**
     * 构造一颗二叉树
     * @return
     */
    public static  TreeNode getTree() {
    	TreeNode root=new TreeNode(5);
    	TreeNode node1=new TreeNode(3);
    	TreeNode node2=new TreeNode(6);
    	TreeNode node3=new TreeNode(2);
    	TreeNode node4=new TreeNode(4);
    	TreeNode node5=new TreeNode(7);
    	root.left=node1;
    	root.right=node2;
    	
    	node1.left=node3;
    	node1.right=node4;
    	
    	node2.left=node5;
  //    	node3.left=node7;
//    	node4.right=node8;
    	return root;
    }

}
