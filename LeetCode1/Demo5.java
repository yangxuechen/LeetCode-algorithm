package leetCode;


public class Demo5 {

	
	public static void main(String args[]) {
	//	ListNode l1=new ListNode(0);
		
			ListNode l2=new ListNode(1);
			ListNode l1=new ListNode(2);
			ListNode node1=new ListNode(2);
			ListNode node2=new ListNode(2);
			ListNode node3=new ListNode(2);
			ListNode node4=new ListNode(2); 
			ListNode node5=new ListNode(2);
			
			
			l1.next=node1;
			node1.next=node5;
			
			l2.next=node2;
			node2.next=node3;
			node3.next=node4;
			ListNode list=mergeTwoLists(l1,l2);
			print(list);
	
		
	}
	
	public static void print(ListNode l) {
		while(l.next!=null) {
			System.out.println(l.val);
			l=l.next;
		}
	}
	
 public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	    ListNode head=new ListNode(0);
			 ListNode list=null;
		        head.next=list;
		        while(l1.next!=null&&l2.next!=null) {
		        	if(l1.val<l2.val) {
		        		ListNode node=new ListNode(l1.val);
		        		list.next=node;
		        		list=list.next;
		        		l1=l1.next;
		        	}else {
		        		ListNode node=new ListNode(l2.val);
		        		list.next=node;
		        		list=list.next;
		        		l2=l2.next;
		        	}
		        }
		        while(l1.next!=null) {
		        	ListNode node=new ListNode(l1.val);
		    		list.next=node;
		    		list=list.next;
		    		l1=l1.next;
		        }
		        while(l2.next!=null) {
		        	ListNode node=new ListNode(l2.val);
		    		list.next=node;
		    		list=list.next;
		    		l2=l2.next;
		        }
		        return head;
		
		
		
  }
}
