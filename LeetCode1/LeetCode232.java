package leetCode;

import java.util.ArrayDeque;

public class LeetCode232 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LeetCode232 lt=new LeetCode232();
		LeetCode232.MyQueue queue=lt.new MyQueue();
		boolean result=queue.empty();
		if(result==true) {
			System.out.println(" queue is empty");
		}else {
			System.out.println(" queue is not empty");
		}
		queue.push(1);
		queue.push(2);
		queue.push(3);
		
		
	    System.out.println("first:"+queue.pop());
	    System.out.println("first:"+queue.pop());
	//    System.out.println("first:"+queue.pop());
	    boolean result2=queue.empty();
	   	    if(result2==true) {
			System.out.println(" queue is empty");
		}else {
			System.out.println(" queue is not empty");
		}
	}
	
	public class MyQueue{
		private ArrayDeque<Integer> stack1;//»Î’ª
		private ArrayDeque<Integer> stack2;//≥ˆ’ª
		
		public MyQueue() {
			stack1=new ArrayDeque<Integer>();
			stack2=new ArrayDeque<Integer>();
		}
		
		public void push(int x) {
			stack1.push(x);
		}
		
		public int pop() {
			if(stack2.isEmpty()) {
				while(stack1.isEmpty()==false) {
					stack2.push(stack1.pop());
				}
			}
			return stack2.pop();
		}
		
		public int peek() {
			if(stack2.isEmpty()) {
				while(stack1.isEmpty()==false) {
					stack2.push(stack1.pop());
				}
			}
			return stack2.peek();
		}
		public boolean empty() {
			if(stack1.isEmpty()==true&&stack2.isEmpty()==true) {
				return true;
			}
			return false;
		}
	}

}
