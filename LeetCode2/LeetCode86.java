package LeetCode2;

public class LeetCode86 {
    public static void main(String[] args) {

        ListNode head=getList();
        printList(head);
        ListNode h=partition(head,5);
        printList(h);
    }
    public static ListNode partition(ListNode head, int x) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode h=new ListNode(Integer.MIN_VALUE);
        h.next=head;
        ListNode res=h;
        ListNode pre;//目标结点（pre的值<x&&pre.next.val>=x）
        while(h.next!=null){  //寻找目标结点pre
            if(h.val<x&&h.next.val>=x){
                break;
            }
            h=h.next;
        }
        int n=h.val;//用来判断链表头结点是否改变
 //       System.out.println(h.val);
        pre=h;

        //继续遍历链表，将结点值<x的结点放到pre结点之后，更新pre结点位置(pre=pre.next)
        while (h.next!=null){
            if(h.next.val<x){
                ListNode t=h.next;
                h.next=h.next.next;
                ListNode tmp=pre.next;
                pre.next=t;
                t.next=tmp;
                pre=pre.next;
   //            printList(head);
            }else{
                if(h.next==null){
                    break;
                }
                h=h.next;
            }

        }

        if(n==Integer.MIN_VALUE){//头结点改变的情况
            return res.next;
        }
        return head;//头结点不变的情况
    }

    public static ListNode getList(){
        ListNode n1=new ListNode(2);
        ListNode n2=new ListNode(1);
        ListNode n3=new ListNode(3);
        ListNode n4=new ListNode(2);
        ListNode n5=new ListNode(5);
        ListNode n6=new ListNode(2);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        return n1;
    }

    public static void printList(ListNode h){
        while (h!=null){
            System.out.print(h.val+" ");
            h=h.next;
        }
        System.out.println();
    }
}
