package LeetCode2;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;

public class LeetCode589 {
    public static void main(String[] args) {

        Node root=getTree();
        List<Integer> res=preorder2(root);
        System.out.println(res);
    }

    /**
     * 非递归的方法遍历
     * 辅助数据结构 stack
     * @param root
     * @return
     */
    public static List<Integer> preorder2(Node root){
        List<Integer> res=new LinkedList<Integer>();
        if(null==root){
            return res;
        }
        ArrayDeque<Node> stack=new ArrayDeque<Node>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node node=stack.pop();
            res.add(node.val);
            if(null!=node.children&&node.children.size()>0){
                for(int i=node.children.size()-1;i>=0;i--){
                    stack.push(node.children.get(i));
                }
            }
        }
        return res;
    }
    /**
     * 采用递归的方法遍历
     * @param root
     * @return
     */
    public static List<Integer> preorder(Node root) {
        List<Integer> res=new LinkedList<Integer>();
        if(null==root){
            return res;
        }
        preOrderTarversal(res,root);
        return res;
    }

    /**
     * 前序遍历n叉树
     * @param res
     * @param node
     */
    public static void preOrderTarversal(List<Integer> res,Node node){
        if(null==node){
            return ;
        }
        res.add(node.val);
        if(null!=node.children&&node.children.size()>0)
        preOrderTarversal(res,node.children.get(0));
        for(int i=1;i<node.children.size();i++){
            preOrderTarversal(res,node.children.get(i));
        }
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
