package LeetCode2;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;

public class LeetCode144 {
    public static void main(String[] args) {

        TreeNode root=getBinaryTree();

        List<Integer> res=new LinkedList<Integer>();
        preorderTraversal2(root,res);
        System.out.println(res);
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res=new LinkedList<Integer>();
        preorderTraversal(root,res);
        return res;
    }

    /**
     * 采用递归的方式前序遍历
     * @param root
     * @param res
     */
    public static void preorderTraversal(TreeNode root,List<Integer> res){
        if(root==null){
            return ;
        }
        res.add(root.val);
        if(root.left!=null){
            preorderTraversal(root.left,res);
        }
        if(root.right!=null){
            preorderTraversal(root.right,res);
        }
    }

    /**
     * 非递归实现
     * @param root
     * @param res
     */
    public static void preorderTraversal2(TreeNode root,List<Integer> res){
        if(root==null){
            return ;
        }
        ArrayDeque<TreeNode> stack=new ArrayDeque<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node=stack.pop();
            res.add(node.val);
            if(node.right!=null){
                stack.push(node.right);
            }
            if(node.left!=null){
                stack.push(node.left);
            }
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
