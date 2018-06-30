package leetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode234 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ListNode head=getList();
     
     boolean result=isPalindrome(head);
     if(result) {
    	 System.out.println("true");
     }else {
    	 System.out.println("false");
     }
	}
	public static ListNode getList() {
		ListNode head=new ListNode(-12911);
		ListNode node1=new ListNode(-12911);
		ListNode node2=new ListNode(3);
		ListNode node3=new ListNode(2);
		ListNode node4=new ListNode(1);
		
		head.next=node1;
//		node1.next=node2;
//		node2.next=node3;
//		node3.next=node4;
		return head;
	}
   public static boolean isPalindrome(ListNode head) {
        
	   List<Integer> list=new ArrayList<Integer>();
	   while(head!=null) {
		   list.add(new Integer(head.val));
		   head=head.next;
	   }
	   int i,j,len=list.size();
	   for(i=0,j=len-1;i<len/2;i++,j--) {
		   if(list.get(i)!=list.get(j)) {
			   return false;
		   }
	   }
	   return true;
    }

}
