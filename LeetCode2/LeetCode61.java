package LeetCode2;

public class LeetCode61 {
    public static void main(String[] args) {

        ListNode h=getList();

        ListNode head=rotateRight(h,2);

       while(head!=null){
           System.out.println(head.val);
           head=head.next;
       }
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return null;
        }
        int count=1; //；链表长度
        ListNode pre=head;

        //使pre指向链表的尾结点
        while(pre.next!=null){
            pre=pre.next;
            count++;
        }

        //形成循环链表
        pre.next=head;

        //计算出从pre指向的结点位置向前走几步才能到达新链表的尾结点，以及尾结点的next结点作为新结点的头结点
        int n=count-k%count;

        for(int i=0;i<n;i++){
            pre=pre.next;
        }
        ListNode tmp=new ListNode(0);
        tmp.next=pre.next;

        pre.next=null;

        return tmp.next;
    }

    public static ListNode getList(){
        ListNode h=new ListNode(1);
        ListNode n1=new ListNode(2);
        ListNode n2=new ListNode(3);
        ListNode n3=new ListNode(4);
        ListNode n4=new ListNode(5);

        h.next=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;

        return h;
    }
}
