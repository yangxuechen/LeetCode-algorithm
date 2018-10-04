package LeetCode2;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;

public class LeetCode112 {
    public static void main(String[] args) {

        TreeNode root=getBST();
        boolean b=hasPathSum2(root,15);
        if(b){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    public static boolean hasPathSum2(TreeNode root,int sum){

        return hasSum(root,0,sum);
    }

    public static boolean hasSum(TreeNode root,int tmp,int sum){
        if(null==root){
            return false;
        }
        tmp+=root.val;
        if(tmp==sum&&root.left==null&&root.right==null){
            return true;
        }
        return hasSum(root.left,tmp,sum)||hasSum(root.right,tmp,sum);
    }
    public static boolean hasPathSum(TreeNode root, int sum) {
        if(null==root){
            return false;
        }
        List<Integer> list=new LinkedList<Integer>();//临时存储深度优先遍历结果
        List<Integer> res=new LinkedList<Integer>(); //存储所有根结点到叶子结点的路径和
         dfs(root,list,0,res);
         for(Integer i:res){
             if(i==sum){
                 return true;
             }
         }
         return false;
    }

    public static void dfs(TreeNode root, List<Integer> list,int tmp,List<Integer> res){
        if(null==root){
           return ;
        }

        list.add(root.val);
        tmp+=root.val;

        if(null==root.left&&null==root.right){
            res.add(tmp);
        }
        dfs(root.left,list,tmp,res);
        dfs(root.right,list,tmp,res);
        tmp-=list.get(list.size()-1);
        list.remove(list.size()-1);

    }

    /**
     *       8
     *     /  \
     *    4    55
     *   / \    \
     *  3   6    100
     * @return
     */
    public static TreeNode getBST(){
        TreeNode root=new TreeNode(8);

        TreeNode n1=new TreeNode(4);
        TreeNode n2=new TreeNode(55);
        TreeNode n3=new TreeNode(3);
        TreeNode n4=new TreeNode(6);
        TreeNode n5=new TreeNode(100);
        root.left=n1;
        root.right=n2;

        n2.right=n5;
        n1.left=n3;
        n1.right=n4;
        return root;
    }
}
