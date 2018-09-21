package LeetCode2;

import java.util.LinkedList;
import java.util.List;

public class LeetCode129 {
    public static void main(String[] args) {

        TreeNode root=getBST();
//        List<Integer> res=new LinkedList<Integer>();
//        String tmp="";
//        dfs(root,res,tmp);
//        System.out.println(res);
        int n=sumNumbers(root);
        System.out.println(n);
    }

    public static int sumNumbers(TreeNode root) {
        List<Integer> res=new LinkedList<Integer>();//保存根结点到叶子结点的路径值
        String tmp="";//临时存储根结点到叶子结点的路径值
        dfs(root,res,tmp);//深度优先遍历二叉树
        int sum=0;//所有路径和
        for(Integer i:res){
            sum+=i;
        }
        return sum;
    }

    public static void dfs(TreeNode root, List<Integer> res,String tmp){
        if(root==null){
            return ;
        }
        if(root.left==null&&root.right==null){  //叶子结点
            tmp+=root.val;
            int n=Integer.parseInt(tmp);
            res.add(n);
            return ;
        }
        tmp+=root.val;
        dfs(root.left,res,tmp);
        tmp.substring(0,tmp.length()-1);
        dfs(root.right,res,tmp);
        tmp.substring(0,tmp.length()-1);
    }

    /**
     *       4
     *     /  \
     *    9    5
     *   / \
     *  1   0
     * @return
     */
    public static TreeNode getBST(){
        TreeNode root=new TreeNode(4);

        TreeNode n1=new TreeNode(9);
        TreeNode n2=new TreeNode(5);
        TreeNode n3=new TreeNode(1);
        TreeNode n4=new TreeNode(0);

        root.left=n1;
        root.right=n2;

        n1.left=n3;
        n1.right=n4;
        return root;
    }
}
