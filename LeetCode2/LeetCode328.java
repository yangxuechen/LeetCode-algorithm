package LeetCode2;

public class LeetCode328 {
    public static void main(String[] args) {

        ListNode h=getList();
        printList(h);

       ListNode head= oddEvenList(h);
       printList(head);
    }
    public static ListNode oddEvenList(ListNode head) {
        if(head==null){
            return head;
        }else if(head.next==null){
            return head;
        }else if(head.next.next==null){
            return head;
        }
       ListNode p=head;
       ListNode q=new ListNode(0);
       ListNode h2=q;
       ListNode pre=head;  //用来保存p的前驱结点

       while (null!=p){
           ListNode tmp=p.next;
          if(p.next==null){
              break;
          }
           p.next=p.next.next;
           pre=p;
           p=p.next;
           q.next=tmp;
           q=q.next;
       }
       q.next=null;

       if(p==null){
           pre.next=h2.next;
       }else{
           p.next=h2.next;
       }

        return head;
    }

    public static ListNode getList(){
        ListNode n1=new ListNode(1);
        ListNode n2=new ListNode(2);
        ListNode n3=new ListNode(3);
        ListNode n4=new ListNode(4);
        ListNode n5=new ListNode(5);

  //      n1.next=n2;
 //       n2.next=n3;
  //      n3.next=n4;
 //       n4.next=n5;

        return n1;

    }

    public static void printList(ListNode head){
        while(head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }
        System.out.println();
    }
}
