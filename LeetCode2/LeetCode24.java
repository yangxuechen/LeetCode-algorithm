package LeetCode2;

public class LeetCode24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ListNode h=getList();
        traversingList(h);
        ListNode head=swapPairs(h);
        
        System.out.println();
        traversingList(head);
        
	}
	public static ListNode swapPairs(ListNode head) {
		if(head==null) {
			return null;
		}
		if(head.next==null) {
			return head;
		}
	    ListNode A=new ListNode(0);
	    A.next=head;
	    
	    ListNode p=head;
	    ListNode q=head.next;
	    
	    ListNode t1=A; //用来保存p的前驱结点
	    ListNode t2=q.next;//用来保存q的后继结点
	    
	    while(q!=null) {
	    	ListNode p1=p;
	    	ListNode q1=q;
	    	
	    	t1.next=q1;
	    	q1.next=p1;
	    	p1.next=t2;
            
	    	p=t2;
	    	if(p!=null) {
	    		q=p.next;
	    	}else {
	    		break;
	    	}
	    	
	    	if(q==null) {
	    		break;
	    	}
	    	t2=q.next;
	    	t1=t1.next.next;
	    	
	    }
		return A.next;
	}
	
	public static ListNode getList() {
		ListNode h=new ListNode(1);
		ListNode n1=new ListNode(2);
		ListNode n2=new ListNode(3);
		ListNode n3=new ListNode(4);
		ListNode n4=new ListNode(5);
		
//		h.next=n1;
//		n1.next=n2;
//		n2.next=n3;
//		n3.next=n4;
		
		return h;
	}
	
	public static void traversingList(ListNode head) {
		   while(head!=null) {
			   System.out.print(head.val+" ");
			   head=head.next;
		   }
	   }

}
