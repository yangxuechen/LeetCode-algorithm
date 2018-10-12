package LeetCode2;

import java.util.LinkedList;
import java.util.List;

public class LeetCode230 {
    private static int cnt;
    private static int num;

    public static void main(String[] args) {

        TreeNode root=getTree();
//        List<Integer> res=new LinkedList<Integer>();
//
//        dfs(root,res);
//        System.out.println(res);
        int n=kthSmallest2(root,1);
        System.out.println(n);
    }
    public static int kthSmallest2(TreeNode root, int k){

        cnt = k;
        helper(root);
        return num;
    }
    private static void helper(TreeNode root){
        if(root.left != null)
            helper(root.left);
        cnt--;
        if(cnt == 0){
            num = root.val;
            return;
        }
        if(root.right != null)
            helper(root.right);
    }
    public static int kthSmallest(TreeNode root, int k) {
        List<Integer> res=new LinkedList<Integer>();
        dfs(root,res);

        return res.get(k-1);
    }

    public static void dfs(TreeNode root, List<Integer> res){

        if(null==root){
            return ;
        }
        dfs(root.left,res);
  //      System.out.println("node:"+root.val);
        res.add(root.val);
        dfs(root.right,res);
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
