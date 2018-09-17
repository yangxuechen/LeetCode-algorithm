package LeetCode2;

import java.util.LinkedList;
import java.util.List;

public class LeetCode97 {
    public static void main(String[] args) {
        TreeNode root=getBinaryTree();
        List<Integer> res=inorderTraversal(root);
        System.out.println(res);
    }

    public static List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> res=new LinkedList<Integer>();
        inorder(res,root);
        return res;
    }

    public static void inorder(List<Integer> res,TreeNode root){
        if(root==null){
            return ;
        }

        if(root.left!=null){
            inorder(res,root.left);
        }
        res.add(root.val);
        if(root.right!=null){
            inorder(res,root.right);
        }
    }


    /**
     *      1
     *    /  \
     *   2    3
     *  / \
     * 4   5
     * @return
     */
    public static TreeNode getBinaryTree(){
        TreeNode root=new TreeNode(1);
        TreeNode n1=new TreeNode(2);
        TreeNode n2=new TreeNode(3);
        TreeNode n3=new TreeNode(4);
        TreeNode n4=new TreeNode(5);

        root.left=n1;
        root.right=n2;

        n1.left=n3;
        n1.right=n4;
        return root;
    }
}
