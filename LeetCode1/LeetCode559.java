package LeetCode2;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;

public class LeetCode559 {
    public static void main(String[] args) {

        Node root=getTree();

        int n=maxDepth(root);
        System.out.println("first: "+n);

        int m=maxDepth2(root);
        System.out.println("second: "+m);
    }
    public static int maxDepth(Node root) {
        if(null==root){
            return 0;
        }
        ArrayDeque<Node> queue=new ArrayDeque<Node>();
        queue.add(root);
        int count=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                Node node=queue.removeFirst();
                for(Node n:node.children){
                    queue.add(n);
                }
            }
            count++;
        }
        return count;
    }

    public static int maxDepth2(Node root){
        if(null==root){
            return 0;
        }
        int res=1;
        for(Node n:root.children){
            res=Math.max(maxDepth2(n)+1,res);
        }
        return res;
    }

    /**
     *     8
     *    / \
     *   1   2
     *  / \
     * 3   4
     * @return
     */
    public static Node getTree(){
        Node n1=new Node(8,new LinkedList<Node>());
        Node n2=new Node(1,new LinkedList<Node>());
        Node n3=new Node(2,new LinkedList<Node>());
        Node n4=new Node(3,new LinkedList<Node>());
        Node n5=new Node(4,new LinkedList<Node>());

        List<Node> l1=new LinkedList<Node>();
        l1.add(n2);
        l1.add(n3);

        List<Node> l2=new LinkedList<Node>();
        l2.add(n4);
        l2.add(n5);
        n1.children=l1;

        n4.children=l2;

        return n1;
    }
}
