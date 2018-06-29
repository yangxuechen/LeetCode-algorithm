package leetCode;

import java.util.Stack;

/**
 * ����һ��ֻ���� '('��')'��'{'��'}'��'['��']' ���ַ������ж��ַ����Ƿ���Ч��

��Ч�ַ��������㣺

�����ű�������ͬ���͵������űպϡ�
�����ű�������ȷ��˳��պϡ�
ע����ַ����ɱ���Ϊ����Ч�ַ�����
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
	 * ƥ�亯��
	 * @param s
	 * @return
	 */
	public static boolean isValid(String s) {
		if(s==null||s.length()==0) {
			return true;
		}
	    boolean result=false;
		Stack stack=new Stack();

		stack.push(s.charAt(0)); //����һ���ַ���ջ
        for(int i=1;i<s.length();i++) {
        	char ch1=getChar(s.charAt(i));
        	if(!stack.isEmpty()) {
        		if(stack.peek().equals(ch1)){
        			stack.pop();  //�ַ�ƥ�䣬���ջ
        		}else {
        			stack.push(s.charAt(i));  //�ַ���ƥ�䣬�����ַ���ջ
        		}
        	}else {  //ջΪ�ս��ַ���ջ
        		stack.push(s.charAt(i));
        	}
        	
        }
		if(stack.isEmpty()) {
			result=true;
		}
		  return result;
	    }
	/**
	 * ���Ҷ�Ӧ���ŵ�ƥ������
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
