package leetCode;

/**
 * 反转整数
 * @author yangxuechen
 *
 */
public class Demo4 {

	public static void main(String[] args) {
		String str="-123456789";
		int n=Integer.parseInt(str);
		System.out.println(n);
        reverse(n);
	}
    public static int reverse(int n) {
    	String str=Integer.toString(n);
//    	System.out.println(str);
    	int len=str.length();
    	String str2="";
    	char[] ch=str.toCharArray();
    	char ch2[]=new char[len];
    	System.out.println(ch);
    	int j;
    	for(int i=0;i<str.length();i++) {
    		j=len-1;
    		ch2[i]=ch[j];
    		j--;
    	}
    	System.out.println(ch2);
//    	for(int i=0,j=len-1;i<len;i++,j--) {
//    		
//    	}
    	
    	return 0;
    }
}
