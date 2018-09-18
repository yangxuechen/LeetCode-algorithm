package LeetCode2;

import java.util.LinkedList;
import java.util.List;

public class LeetCode98 {
    public static void main(String[] args) {

        TreeNode root=getBST();
        boolean b=isValidBST2(root);
        if(b){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

    public static boolean isValidBST2(TreeNode root){
        List<Integer> res=new LinkedList<Integer>();
        inorder(root,res);
        for(int i=0;i<res.size()-1;i++){
            if(res.get(i)>=res.get(i+1)){
                return false;
            }
        }
 //       System.out.println(res);
        return true;
    }

    public static void inorder(TreeNode root, List<Integer> tmp){
        if(root==null){
            return ;
        }
        if(root.left!=null){
            inorder(root.left,tmp);
        }
        tmp.add(root.val);
        if(root.right!=null){
            inorder(root.right,tmp);
        }
    }
//    public static boolean isValidBST(TreeNode root) {
//        if(root==null){
//            return true;
//        }
//        if(root.left!=null){
//            if(root.left.val>=root.val){
//                return false;
//            }else{
//                isValidBST(root.left);
//            }
//        }
//        if(root.right!=null){
//            if(root.right.val<=root.val){
//                return false;
//            }else{
//                isValidBST(root.right);
//            }
//        }
//        return true;
//    }

    /**
     *       8
     *     /  \
     *    4    55
     *   / \
     *  3   6
     * @return
     */
    public static TreeNode getBST(){
        TreeNode root=new TreeNode(8);

        TreeNode n1=new TreeNode(4);
        TreeNode n2=new TreeNode(55);
        TreeNode n3=new TreeNode(3);
        TreeNode n4=new TreeNode(6);

        root.left=n1;
        root.right=n2;

        n1.left=n3;
        n1.right=n4;
        return root;
    }
}
