package LeetCode2;

import java.util.ArrayDeque;

public class BSTIterator {

    private ArrayDeque<Integer> stack=new ArrayDeque<Integer>();//用来保存二叉搜索树的深度优先遍历结果结点值
    public BSTIterator(TreeNode root) {
        dfs(root,stack);//将深度优先遍历BST的结果存入stack
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if(!stack.isEmpty())
        return true;
        return false;
    }

    /** @return the next smallest number */
    public int next() {
        return stack.pop();
    }

    public void dfs(TreeNode root,ArrayDeque<Integer> stack){
        if(root==null){
            return ;
        }
        if(root.right!=null){
            dfs(root.right,stack);
        }
  //      System.out.println(root.val);
        stack.push(root.val);
        if(root.left!=null){
            dfs(root.left,stack);
        }
    }
}