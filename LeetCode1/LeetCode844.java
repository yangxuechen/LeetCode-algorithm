package leetCode2;

import java.util.ArrayDeque;

public class LeetCode844 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub"bxj##tw"
		//"bxj###tw"
        boolean b=backspaceCompare("bxj##tw","bxj###tw");
        if(b) {
        	System.out.println("true");
        }else {
        	System.out.println("false");
        }
	}
    public static boolean backspaceCompare(String S, String T) {
        ArrayDeque<Character> stack=new ArrayDeque<Character>();
        ArrayDeque<Character> stack2=new ArrayDeque<Character>();
        for(char c:S.toCharArray()) {
        	if(c=='#') {
        		if(!stack.isEmpty()) {
        			stack.pop();
        		}
        	}else {
        		stack.push(c);
        	}
        }
        for(char c:T.toCharArray()) {
        	if(c=='#') {
        		if(!stack2.isEmpty()) {
        			stack2.pop();
        		}
        	}else {
        		stack2.push(c);
        	}
        }
        while(!stack.isEmpty()&&!stack2.isEmpty()) {
        	if(stack.pop()!=stack2.pop()) {
        		return false;
        	}
        }
        if(stack.isEmpty()&&!stack2.isEmpty()) {
        	return false;
        }
        if(!stack.isEmpty()&&stack2.isEmpty()) {
        	return false;
        }
    	return true;
    }

}
