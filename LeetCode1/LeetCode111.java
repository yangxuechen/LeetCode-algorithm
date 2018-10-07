package LeetCode2;

import java.util.ArrayDeque;

public class LeetCode111 {
    public static void main(String[] args) {

        TreeNode root=getTree();
        int n=minDepth(root);
        System.out.println(n);
    }
    public static int minDepth(TreeNode root) {
        if(null==root){
            return 0;
        }
        ArrayDeque<TreeNode> queue=new ArrayDeque<TreeNode>();
        queue.add(root);
        int min=0;
        while(!queue.isEmpty()){
            int size=queue.size();
           int flag=0;
            for(int i=0;i<size;i++){
                TreeNode node=queue.removeFirst();
                if(null==node.left&&null==node.right){//找到叶子结点
                    flag=1;
                }
                if(null!=node.left){
                    queue.add(node.left);
                }
                if(null!=node.right){
                    queue.add(node.right);
                }
            }
            min++;
            if(flag!=0){
                break;
            }
        }
        return min;
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
