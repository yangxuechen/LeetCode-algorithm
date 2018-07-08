package leetCode2;

import java.util.Stack;

public class LeetCode682 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s[]= {"5","-2","4","C","D","9","+","+"};
      int sum=calPoints(s);
      System.out.println(sum);
	}
	
    public static int calPoints(String[] ops) {
        Stack<Integer> stack=new Stack<Integer>();
        for(String s:ops) {
        	if(s.equals("C")) {
        		stack.pop();   //删除上一轮得分
        	}else if(s.equals("+")) {
        		int one=stack.pop();
        		int two=stack.pop();
        		stack.push(two);
        		stack.push(one);
        		stack.push(one+two);   //本轮得分等于前两轮得分相加
        	}else if(s.equals("D")){
        		int one=stack.pop();
        		stack.push(one);
        		stack.push(2*one);      //本轮得分等于前一轮得分的两倍
        	}else {
        		int points=Integer.parseInt(s);   
        		stack.push(points);    //保存本轮得分
        	}
        }
     //   System.out.println(stack);
        
        //计算总分
        int sum=0;
        while(!stack.isEmpty()) {
        	sum+=stack.pop();
        }
    	return sum;
    }
    
}
