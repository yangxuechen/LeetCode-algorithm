package LeetCode2;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;

public class LeetCode199 {
    public static void main(String[] args) {

        TreeNode root=getBST();
        List<Integer> res=rightSideView(root);
        System.out.println(res);
    }
    public static List<Integer> rightSideView(TreeNode root) {
        List<List<Integer>> res=bfs(root);
        List<Integer> list=new LinkedList<Integer>();
        for(List<Integer> l:res){
            list.add(l.get(l.size()-1));
        }
        return list;
    }

    /**
     * 返回广度优先遍历每一层的结果
     * @param root
     * @return
     */
    public static List<List<Integer>> bfs(TreeNode root){
        List<List<Integer>> res=new LinkedList<List<Integer>>();
        if(null==root){
            return res;
        }
        ArrayDeque<TreeNode> queue=new ArrayDeque<TreeNode>();
        queue.addLast(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> tmp=new LinkedList<Integer>();
            for(int i=0;i<size;i++){
                TreeNode node=queue.removeFirst();
                tmp.add(node.val);
                if(null!=node.left){
                    queue.addLast(node.left);
                }
                if(null!=node.right){
                    queue.addLast(node.right);
                }
            }
            res.add(tmp);
        }
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
