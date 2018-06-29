package leetCode;

public class LeetCode206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ListNode head=new ListNode(1);
       ListNode node1=new ListNode(2);
       ListNode node2=new ListNode(3);
       ListNode node3=new ListNode(4);
       ListNode node4=new ListNode(5);
       
       head.next=node1;
       node1.next=node2;
       node2.next=node3;
       node3.next=node4;
       
       ListNode newHead=reverseList(head);
       printList(newHead);
	}
	
	public static void printList(ListNode head) {
		while(head!=null) {
			System.out.println(head.val);
			head=head.next;
		}
	}
	public static ListNode reverseList(ListNode head) {
		if(head==null) {
			return null;
		}
		ListNode pre=head;//前一节点
		ListNode cur=head.next;//当前节点
		ListNode temp=head;
		
		while(cur!=null) {
			temp=cur.next;
			cur.next=pre;
			
			pre=cur;
			cur=temp;
		}
		head.next=null;
		return pre;
	}

}
