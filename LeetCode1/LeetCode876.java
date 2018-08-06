package leetCode2;

public class LeetCode876 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ListNode h=getList();
        ListNode m=middleNode(h);
        System.out.println(m.val);
	}
	public static ListNode getList() {
		ListNode head=new ListNode(1);
		ListNode n1=new ListNode(2);
		ListNode n2=new ListNode(3);
		ListNode n3=new ListNode(4);
	//	ListNode n4=new ListNode(5);
		head.next=n1;
		n1.next=n2;
		n2.next=n3;
	//	n3.next=n4;
		return head;
	}
    public static ListNode middleNode(ListNode head) {
    	ListNode oneStep=head;
    	ListNode twoStep=head;
    	while(twoStep.next!=null) {
    		oneStep=oneStep.next;
    		twoStep=twoStep.next;
    		if(twoStep.next==null) {
    			return oneStep;
    		}else {
    			twoStep=twoStep.next;
    		}
    	}
    	return oneStep;
    }
}
