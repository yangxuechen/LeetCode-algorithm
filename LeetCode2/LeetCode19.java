package LeetCode2;

public class LeetCode19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ListNode head=getList();
        traversingList(head);
        System.out.println();
        ListNode h2=removeNthFromEnd(head,2);
        traversingList(h2);
	}
   public static ListNode removeNthFromEnd(ListNode head, int n) {
	   ListNode temp=new ListNode(0);
	   temp.next=head;
       ListNode fastNode=temp;
       ListNode slowNode=temp;
       for(int i=1;i<=n+1;i++) {
    	   fastNode=fastNode.next;
       }
       while(fastNode!=null) {
    	   fastNode=fastNode.next;
    	   slowNode=slowNode.next;
       }
    	   slowNode.next=slowNode.next.next;
	   return temp.next;
    }
   
   public static void traversingList(ListNode head) {
	   while(head!=null) {
		   System.out.print(head.val+" ");
		   head=head.next;
	   }
   }
   
   public static ListNode getList() {
	   ListNode head=new ListNode(1);
	   ListNode n1=new ListNode(2);
	   ListNode n2=new ListNode(3);
	   ListNode n3=new ListNode(4);
	   ListNode n4=new ListNode(5);
	   
	   head.next=n1;
//	   n1.next=n2;
//	   n2.next=n3;
//	   n3.next=n4;
	   
	   return head;
   }
}
