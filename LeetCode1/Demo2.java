package leetCode;

import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

有效字符串需满足：

左括号必须用相同类型的右括号闭合。
左括号必须以正确的顺序闭合。
注意空字符串可被认为是有效字符串。
 * @author yangxuechen
 *
 */
public class Demo2 {

	public static void main(String[] args) {
		
    if(isValid("([()])")) {
    	System.out.println("true");
    }else {
    	System.out.println("false");
    }
	}
	/**
	 * 匹配函数
	 * @param s
	 * @return
	 */
	public static boolean isValid(String s) {
		if(s==null||s.length()==0) {
			return true;
		}
	    boolean result=false;
		Stack stack=new Stack();

		stack.push(s.charAt(0)); //将第一个字符入栈
        for(int i=1;i<s.length();i++) {
        	char ch1=getChar(s.charAt(i));
        	if(!stack.isEmpty()) {
        		if(stack.peek().equals(ch1)){
        			stack.pop();  //字符匹配，则出栈
        		}else {
        			stack.push(s.charAt(i));  //字符不匹配，将该字符入栈
        		}
        	}else {  //栈为空将字符入栈
        		stack.push(s.charAt(i));
        	}
        	
        }
		if(stack.isEmpty()) {
			result=true;
		}
		  return result;
	    }
	/**
	 * 查找对应括号的匹配括号
	 * @param ch
	 * @return
	 */
    public static char getChar(char ch) {
    	switch(ch){
    	   case '[':
    		   return ']';
    	   case ']':
    		   return '[';
    	   case '(':
    		   return ')';
    	   case ')':
    		   return '(';
    	   case '{':
    		   return '}';
    	   case '}':
    		   return '{';
    		   default:
    			   return ' ';
    	}
    }
}
