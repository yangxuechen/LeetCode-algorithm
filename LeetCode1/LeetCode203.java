package leetCode;

public class LeetCode203 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ListNode head=new ListNode(2);
    ListNode node1=new ListNode(2);
    ListNode node2=new ListNode(2);
    ListNode node3=new ListNode(2);
    ListNode node4=new ListNode(2);
    ListNode node5=new ListNode(2);
    
    head.next=node1;
    node1.next=node2;
    node2.next=node3;
    node3.next=node4;
    node4.next=node5;
    printList(head);
    ListNode h=removeElements(head,2);
    System.out.println("*************");
    printList(h);
	}
	/**
	 * 
	 * @param head
	 * @param val
	 * @return
	 */
	 public static ListNode removeElements(ListNode head, int val) {
	       ListNode h=head,temp; 
	       ListNode pre=head;
	       head=head.next;
		   while(head!=null) {
			   if(head.val==val) {
				   pre.next=head.next;
			   }
			   else {
				   pre=pre.next;
			   }
			   head=head.next;
			 //  pre=pre.next;
		   }
		   if(h.val==val) {
			   h=h.next;
		   }
	       return h;
	    }
	 
	 public static void printList(ListNode head) {
		 while(head!=null) {
			 System.out.println(head.val);
			 head=head.next;
		 }
	 }
}
