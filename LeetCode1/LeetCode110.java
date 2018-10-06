package LeetCode2;

import java.util.ArrayDeque;

public class LeetCode110 {

    public static void main(String[] args) {

        TreeNode root=getTree();
//        int n=dfs(root);
//        System.out.println(n);
//        int n=getTreeHeight(root);
//        System.out.println(n);
          boolean b=isBalanced(root);
          if(b){
              System.out.println("true");
          }else{
              System.out.println("false");
          }
    }
    public static boolean isBalanced(TreeNode root) {
        if(null==root){
            return true;
        }
        ArrayDeque<TreeNode> queue=new ArrayDeque<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node=queue.removeFirst();
            int leftChirdHeight=getTreeHeight(node.left);
            int rightChirdHeight=getTreeHeight(node.right);
        //    System.out.println("leftH: "+leftChirdHeight+" rightH: "+rightChirdHeight);
            if(Math.abs(leftChirdHeight-rightChirdHeight)>1){
                return false;
            }
            if(null!=node.left){
                queue.add(node.left);
            }
            if(null!=node.right){
                queue.add(node.right);
            }
        }
        return true;
    }

    /**
     * 非递归求二叉树深度
     * @param root
     * @return
     */
    public static int getTreeHeight(TreeNode root){
        if(null==root){
            return 0;
        }
        ArrayDeque<TreeNode> queue=new ArrayDeque<TreeNode>();
        int height=0;
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode node=queue.removeFirst();
                if(null!=node.left){
                    queue.add(node.left);
                }
                if(null!=node.right){
                    queue.add(node.right);
                }
            }
            height++;
        }
        return height;
    }

    /**
     * 递归求二叉树深度
     * @param root
     * @return
     */
    public static int dfs(TreeNode root){
        if(null==root){
            return 0;
        }
       // System.out.println(root.val);
        int leftLength=dfs(root.left)+1;
        int rightLength=dfs(root.right)+1;

        return leftLength>rightLength?leftLength:rightLength;
    }

    /**
     *     8
     *    / \
     *   1   9
     *    \
     *     2
     * @return
     */
    public static TreeNode getTree(){
        TreeNode n1=new TreeNode(8);
        TreeNode n2=new TreeNode(1);
        TreeNode n3=new TreeNode(9);
        TreeNode n4=new TreeNode(2);

        n1.left=n2;
        n1.right=n3;

        n2.right=n4;

        return n1;
    }
}
