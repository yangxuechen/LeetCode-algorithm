package LeetCode2;

public class LeetCode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ListNode l1=new ListNode(9);
        ListNode n1=new ListNode(1);
        ListNode n2=new ListNode(1);
        
        l1.next=n1;
        n1.next=n2;
        
        ListNode l2=new ListNode(1);
        ListNode n3=new ListNode(1);
        ListNode n4=new ListNode(9);
        ListNode n5=new ListNode(9);
        
        l2.next=n3;
        n3.next=n4;
     //   n4.next=n5;
        
        ListNode l=addTwoNumbers(l1,l2);
        
        while(l!=null) {
        	System.out.print(l.val+" ");
        	l=l.next;
        }
	}
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	    ListNode l=new ListNode(0);
	    ListNode t=l;
	    int n=0; //��λ
	    int temp;//��������Ľ����ӵ�ֵ
	    while(l1!=null&&l2!=null) {
	    	 temp=l1.val+l2.val+n;
	    	 if(temp>=10) {
	    		 temp=temp-10;
	    		 n=1;
	    	 }else {
	    		 n=0;
	    	 }
	    	 ListNode node =new ListNode(temp);
	    	 l.next=node;
	    	 l=l.next;
	    	 l1=l1.next;
	    	 l2=l2.next;
	    }
	    if(l1==null&&l2==null&&n==1) {  //��������һ����������н�λ
	    	ListNode node =new ListNode(n);
	    	 l.next=node;
	    	 l=l.next;
	    }else {
	    	while(l1!=null) {      //l1��l2�� 
		    	temp=l1.val+n;
		    	if(temp>=10) {
		    		 temp=temp-10;
		    		 n=1;
		    	 }else {
		    		 n=0;
		    	 }
		    	ListNode node =new ListNode(temp);
		    	l.next=node;
		    	l=l.next;
		    	l1=l1.next;
		    }
		    while(l2!=null) {    //l2��l1��
		    	temp=l2.val+n;
		    	if(temp>=10) {
		    		 temp=temp-10;
		    		 n=1;
		    	 }else {
		    		 n=0;
		    	 }
		    	ListNode node =new ListNode(temp);
		    	l.next=node;
		    	l=l.next;
		    	l2=l2.next;
		    }
		    if(n==1) {  //�ж�����Ƿ�Ҫ��λ
		    	ListNode node =new ListNode(n);
		    	 l.next=node;
		    	 l=l.next;
		    }
	    }
	    
		return t.next;
	}
    
}
