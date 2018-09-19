package LeetCode2;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;

public class LeetCode103 {
    public static void main(String[] args) {
         TreeNode root=getBST();
         List<List<Integer>> res=zigzagLevelOrder(root);
         for(List<Integer> l:res){
             System.out.println(l);
         }
    }
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> res=new LinkedList<List<Integer>>();
        if(null==root){
            return res;
        }
        ArrayDeque<TreeNode> queue=new ArrayDeque<TreeNode>();
        queue.add(root);
        int count=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            ArrayDeque<Integer> stack=new ArrayDeque<Integer>();
            while(size>0){
                TreeNode node=queue.removeFirst();
                stack.push(node.val);
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
                size--;
            }
            if(count%2==0){
                List<Integer> tmp=reverseStack(stack);
                res.add(tmp);
            }else{
                List<Integer> tmp=new LinkedList<Integer>(stack);
                res.add(tmp);
            }
            count++;
        }
        return res;
    }

    /**
     * 反转stack
     * @param stack
     * @return
     */
    public static List<Integer> reverseStack(ArrayDeque<Integer> stack){
        List<Integer> res=new LinkedList<Integer>();
        Object[] a=  stack.toArray();
        for(int i=a.length-1;i>=0;i--){
            res.add((int)a[i]);
        }
        return res;
    }

    /**
     *       8
     *     /  \
     *    4    55
     *   /      \
     *  3        6
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
        n2.right=n4;
        return root;
    }
}
