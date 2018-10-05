package LeetCode2;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;

public class LeetCode429 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res=new LinkedList<List<Integer>>();
        if(null==root){
            return res;
        }
        ArrayDeque<Node> queue=new ArrayDeque<Node>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> tmp=new LinkedList<Integer>();
            for(int i=0;i<size;i++){
                Node node=queue.removeFirst();
                tmp.add(node.val);
                for(Node n:node.children){
                    queue.addLast(n);
                }
            }
            res.add(tmp);
        }
        return res;
    }
}
