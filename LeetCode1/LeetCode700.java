package LeetCode2;

public class LeetCode700 {
    public static void main(String[] args) {

        TreeNode root=getTree();
        dfs(root);

        TreeNode t=searchBST(root,2);
        dfs(t);
    }
    public static TreeNode searchBST(TreeNode root, int val) {
        if(null==root){
            return null;
        }
        if(root.val>val){
            return searchBST(root.left,val);
        }else if(root.val<val){
            return searchBST(root.right,val);
        }else {
            return root;
        }
    }

    /**
     *     8
     *    / \
     *   5   9
     *  /
     *  2
     * @return
     */
    public static TreeNode getTree(){
        TreeNode n1=new TreeNode(8);
        TreeNode n2=new TreeNode(5);
        TreeNode n3=new TreeNode(9);
        TreeNode n4=new TreeNode(2);

        n1.left=n2;
        n1.right=n3;

        n2.left=n4;

        return n1;
    }

    public static void dfs(TreeNode root){
        if(null==root){
            return;
        }
        System.out.println(root.val);
        dfs(root.left);
        dfs(root.right);
    }
}
