package LeetCode2;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;

public class LeetCode590 {
    public static void main(String[] args) {

        Node root=getTree();
        List<Integer> res=postorder2(root);
        System.out.println(res);
//        ArrayDeque<Integer> stack=new ArrayDeque<Integer>();
//        stack.push(1);
//        stack.push(2);
//        List<Integer> list=new LinkedList<>(stack);
//        System.out.println(list);
    }

    /**
     * 非递归后序遍历n叉树
     *
     * 该算法不能完全通过
     * @param root
     * @return
     */
    public static List<Integer> postorder2(Node root){
        List<Integer> res=new LinkedList<Integer>();
        ArrayDeque<Integer> resultStack=new ArrayDeque<Integer>();
        if(null==root){
            return res;
        }
        ArrayDeque<Node> queue=new ArrayDeque<Node>();
        queue.push(root);
        while(!queue.isEmpty()){
            Node node=queue.removeFirst();
            resultStack.push(node.val);
            if(null!=node.children&&node.children.size()>0){
                for(int i=node.children.size()-1;i>=0;i--){
                    queue.add(node.children.get(i));
                }
            }
        }
        return new LinkedList<>(resultStack);
    }
    /**
     * 递归后序遍历n叉树
     * @param root
     * @return
     */
    public static List<Integer> postorder(Node root) {
        List<Integer> res=new LinkedList<Integer>();
        postorderTraversal(res,root);
        return res;
    }

    public static void postorderTraversal(List<Integer> res,Node root){
        if(null==root){
            return ;
        }
        if(null!=root.children&&root.children.size()>0){
            postorderTraversal(res,root.children.get(0));
        }
        for(int i=1;i<root.children.size();i++){
            postorderTraversal(res,root.children.get(i));
        }
        res.add(root.val);
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

        n2.children=l2;

        return n1;
    }
}
