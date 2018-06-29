package leetCode;

/**
 * 删除有序链表中重复的元素
 * @author yangxuechen
 *
 */
public class LeetCode83 {

	public static void main(String[] args) {
	ListNode h=new ListNode(1);
	ListNode a=new ListNode(1);
	ListNode b=new ListNode(1);
	ListNode c=new ListNode(2);
	h.next=a;
	a.next=b;
	b.next=c;
	
	printList(h);
	System.out.println("*********");
	ListNode p=deleteDuplicates(h);
	printList(p);
	}
	 public static ListNode deleteDuplicates(ListNode head) {
		 if(head==null) {
			 return null;
		 }
	        ListNode h=head;
	        ListNode p=new ListNode(0);
	        while(h.next!=null) {
	        	p=h.next;
	        	while(h.val==p.val) {
	        		h.next=p.next;
	        		p=p.next;
	        		if(p==null) {
		        		break;
		        	
	        	}
	        }
	        	h=h.next;
	        	if(h==null) {
	        		break;
	        	}
	        }
	        return head;
	    }
    public static void printList(ListNode head) {
    	ListNode h=head;
    	while(h!=null) {
    		System.out.println(h.val);
    		h=h.next;
    	}
    }
}
