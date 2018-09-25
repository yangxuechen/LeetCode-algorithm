package LeetCode2;

import java.util.List;

public class LeetCode143 {
    public static void main(String[] args) {

        ListNode head=getList();
        printList(head);
 //      ListNode h=splitList(head);
//       printList(head);
//       printList(h);
        reorderList(head);
        printList(head);
    }
    public static void reorderList(ListNode head) {
        if(head==null||head.next==null){
            return ;
        }
        ListNode h=splitList(head);
        while(head!=null){
            ListNode tmp=head.next;
            head.next=h;
            if(h==null){
                break;
            }
            ListNode tmp2=h.next;
            h.next=tmp;
            h=tmp2;
            head=tmp;
        }
    }

    /**
     * 返回反转后的head链表的后半部分
     * @param head
     * @return
     */
    public static ListNode splitList(ListNode head){
        ListNode h=head;
        ListNode pre=new ListNode(0);
        pre.next=head;
        while(h!=null){
            h=h.next;
            if(h!=null){
                h=h.next;
            }
            pre=pre.next;
        }
        h=pre.next;//中间结点
        pre.next=null;//第一条链表的尾结点指向null

        //将第二条链表反转
        pre=h;
        h=h.next;
        pre.next=null;
//        System.out.println(pre.val+" "+h.val);
        while(h!=null){
            ListNode tmp=h.next;
            h.next=pre;
            pre=h;
            h=tmp;
        }
  //      System.out.println(pre.val);
        return pre;
    }

    /**
     * 获得链表
     * @return
     */
    public static ListNode getList(){
        ListNode n1=new ListNode(1);
        ListNode n2=new ListNode(2);
        ListNode n3=new ListNode(3);
        ListNode n4=new ListNode(4);
        ListNode n5=new ListNode(5);
        ListNode n6=new ListNode(6);
        ListNode n7=new ListNode(7);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
       n4.next=n5;
        n5.next=n6;
        n6.next=n7;

        return n1;
    }

    /**
     * 打印链表
     * @param h
     */
    public static void printList(ListNode h){
        while(null!=h){
            System.out.print(h.val+" ");
            h=h.next;
        }
        System.out.println();
    }
}
