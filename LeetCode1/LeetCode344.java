package leetCode;

public class LeetCode344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		String s=reverseString("asdf");
		System.out.println(s);
	}
	public static String reverseString(String s) {
	    if(s==null) {
	    	return null;
	    }
	    int len=s.length();
		char[] ch=new char[len];
		int i,j;
		for(i=0,j=len-1;i<len;i++,j--) {
			ch[i]=s.charAt(j);
		}
		String str=new String(ch);
		return str;
	}
}
