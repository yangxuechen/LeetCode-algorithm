package leetCode2;

public class LeetCode572 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      TreeNode s=getTree();
      TreeNode t=getTree2();
      boolean b=isSubtree(s,t);
      if(b) {
    	  System.out.println(true);
      }else {
    	  System.out.println(false);
      }
	}
	 public static boolean isSubtree(TreeNode s, TreeNode t) {
	     if(s==null) {
	    	 return false;
	     }
	     if(isEqual(s,t)) {
	    	 return true;
	     }
	     
	     return isSubtree(s.left,t)||isSubtree(s.right,t);
	 }
	/**
	 * 判断两棵树是否相等
	 * @param s
	 * @param t
	 * @return
	 */
	public static boolean isEqual(TreeNode s,TreeNode t) {
		if(s==null&&t==null) {
			return true;
		}else if(s==null&&t!=null) {
			return false;
		}else if(s!=null&&t==null) {
			return false;
		}else {
			if(s.val!=t.val) {
				return false;
			}
		}
		
		return isEqual(s.left,t.left)&&isEqual(s.right,t.right);
	}
	 public static TreeNode getTree() {
	    	TreeNode root=new TreeNode(1);
	    	TreeNode node1=new TreeNode(4);
	    	TreeNode node2=new TreeNode(9);
	    	TreeNode node3=new TreeNode(5);
	    	TreeNode node4=new TreeNode(1);
	    	TreeNode node5=new TreeNode(6);
	    	root.left=node1;
	    	root.right=node2;
	    	
	    	node1.left=node3;
	    	node1.right=node4;
	    	
	    	node2.left=node5;
	    	return root;
	    }
	 
	 public static TreeNode getTree2() {
	    	TreeNode root=new TreeNode(4);
	    	TreeNode node1=new TreeNode(5);
	    	TreeNode node2=new TreeNode(1);
	    	TreeNode node3=new TreeNode(5);
	    	TreeNode node4=new TreeNode(1);
	    	TreeNode node5=new TreeNode(6);
	    	root.left=node1;
	    	root.right=node2;
	    	
    	    node1.left=node3;
//	    	node1.right=node4;
//	    	
//	    	node2.left=node5;
	    	return root;
	    }
}
