package leetCode;

import java.util.ArrayDeque;

public class LeetCode225 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      ArrayDeque<Integer> queue=new ArrayDeque<Integer>();
      
//      queue.addFirst(1);
//      queue.addFirst(2);
//      queue.addFirst(3);
//      
//      for(Integer i:queue) {
//    	  System.out.println(i);
//      }
		
		LeetCode225 lt=new LeetCode225();
		LeetCode225.MyStack stack=lt.new MyStack();
		
		stack.push(10);
		stack.push(9);
		stack.push(8);
		
		System.out.println("stack top:"+stack.top());
		
		stack.pop();
		System.out.println("stack top:"+stack.top());
		
		if(stack.empty()==false) {
			System.out.println("not empty");
		}
	}
	
	public class MyStack{
		private ArrayDeque<Integer> queue;
		public MyStack() {
			queue=new ArrayDeque<Integer>();
		}
		public   void push(int x) {
	        queue.addFirst(x);
	    }
		
	    public int pop() {
		    return queue.pollFirst();
		}
		public int top() {
			return queue.getFirst();
		}
		
		public boolean empty() {
			if(queue.isEmpty()) {
				return true;
			}
			return false;
		}
	}

}
