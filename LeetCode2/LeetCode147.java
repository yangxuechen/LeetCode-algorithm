package LeetCode2;

public class LeetCode147 {
    public static void main(String[] args) {

        ListNode head=getList();
        printList(head);

//        ListNode node=new ListNode(78);
//        insertList(head,node);
//        printList(head);

        ListNode h=insertionSortList(head);
        printList(h);
    }
    public static ListNode insertionSortList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode h=new ListNode(Integer.MIN_VALUE);
        h.next=head;
        ListNode p=head;
        while(p.next!=null){
            if(p.val<=p.next.val){
                p=p.next;
            }else{
                ListNode tmp=p.next;
                p.next=p.next.next;//取出结点
                tmp.next=null;
                insertList(h,tmp);//将取出的结点插入合适的位置
            }
            if(p.next==null) {
                break;
            }
        }
        return h.next;
    }

    /**
     * 将node结点按升序排序插入到List的适当位置
     * @param head
     * @param node
     */
    public static void insertList(ListNode head,ListNode node){
//        printList(head.next);
//        System.out.println(node.val);
        while(head.next!=null){
            if (head.val<=node.val&&head.next.val>=node.val){
                break;
            }
            head=head.next;
        }
        ListNode tmp=head.next;
        head.next=node;
        node.next=tmp;
    }

    public static ListNode getList(){
        ListNode n1=new ListNode(-2147483647);
        ListNode n2=new ListNode(-2147483648);
        ListNode n3=new ListNode(3);
        ListNode n4=new ListNode(4);
        ListNode n5=new ListNode(0);
        ListNode n6=new ListNode(99);
        n1.next=n2;
//        n2.next=n3;
//        n3.next=n4;
//        n4.next=n5;
//        n5.next=n6;
        return n1;
    }

    public static void printList(ListNode h){
        while(h!=null){
            System.out.print(h.val+" ");
            h=h.next;
        }
        System.out.println();
    }
}
