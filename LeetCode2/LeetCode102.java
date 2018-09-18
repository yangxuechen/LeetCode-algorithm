package LeetCode2;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;

public class LeetCode102 {
    public static void main(String[] args) {

        TreeNode root=getBST();
        List<List<Integer>> res=levelOrder(root);
        for(List<Integer> l:res){
            System.out.println(l);
        }
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new LinkedList<List<Integer>>();
        if(root==null){
            return  res;
        }
        ArrayDeque<TreeNode> queue=new ArrayDeque<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> list=new LinkedList<Integer>();
            while(size>0){
                TreeNode tmp=queue.removeFirst();
                list.add(tmp.val);
                if(tmp.left!=null){
                    queue.addLast(tmp.left);
                }
                if(tmp.right!=null){
                    queue.add(tmp.right);
                }
                size--;
            }
            res.add(list);
        }
     //   System.out.println(list);
        return res;
    }

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
