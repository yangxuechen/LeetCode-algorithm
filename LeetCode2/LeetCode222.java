package LeetCode2;

import java.util.ArrayDeque;

public class LeetCode222 {
    public static void main(String[] args) {

        TreeNode root=getTree();
        int n=countNodes(root);
        System.out.println(n);
    }



    /**
     * 判断一棵树是否是满二叉树
     * 二叉树的最左边的叶子结点的深度如果等于最右边的叶子结点的深度，是满二叉树
     * 是的话返回满二叉树的结点数
     * 否的话再判断该结点的左子树以及右子树是否是满二叉树
     * @param root
     * @return
     */
    public static int countNodes(TreeNode root){
        if(null==root){
            return 0;
        }
        int leftDepth=1;//最左边的叶子结点深度
        int rightDepth=1;//最右边的叶子结点的深度
        TreeNode tmp=root;
        while (null!=tmp.left){
            leftDepth++;
            tmp=tmp.left;
        }
        tmp=root;
        while (null!=tmp.right){
            rightDepth++;
            tmp=tmp.right;
        }
        if(leftDepth==rightDepth){  //是满二叉树
            //满二叉树结点数  n=2^h-1  [n]结点数 [h]满二叉树深度
            return (int) (Math.pow(2,leftDepth)-1);
        }
        return countNodes(root.left)+countNodes(root.right)+1;
    }
    /**
     * 广度优先遍历二叉树，计算结点数
     * 运行超时
     * @param root
     * @return
     */
    public static int countNodes2(TreeNode root) {
        int count=0;
        if(null==root){
            return count;
        }
        ArrayDeque<TreeNode> queue=new ArrayDeque<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node=queue.removeFirst();
            count++;
            if(null!=node.left){
                queue.add(node.left);
            }
            if(null!=node.right){
                queue.add(node.right);
            }
        }
        return count;
    }

    /**
     *     8
     *    / \
     *   1   9
     *  /
     *  2
     * @return
     */
    public static TreeNode getTree(){
        TreeNode n1=new TreeNode(8);
        TreeNode n2=new TreeNode(1);
        TreeNode n3=new TreeNode(9);
        TreeNode n4=new TreeNode(2);

        n1.left=n2;
        n1.right=n3;

        n2.left=n4;

        return n1;
    }
}
