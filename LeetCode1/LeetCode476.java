package leetCode;

public class LeetCode476 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//    String s=toBinary(4);
//    System.out.println(s);
//    String s2=invertBinary(s);
//    System.out.println(s2);
//    
//    int n=invertDecimal("1111");
//    System.out.println(n);
    
//    char c='1';
//    int n=c-'0';
//    System.out.println(n);
		
		int n=findComplement(1);
		System.out.println(n);
	}
	public static  int findComplement(int num) {
	    String s1=toBinary(num);
	    String s2=invertBinary(s1);
	    int n=invertDecimal(s2);
	    return n;
	}
	
	//10进制转化成二进制
	public static String toBinary(int n) {
		String s="";
		while(n>0) {
			int temp=n%2;
			n/=2;
			s=temp+s;
		}
		return s;
	}
	
	//二进制取反
	public static String invertBinary(String s) {
		char ch[]=new char[s.length()];
		int i=0;
		for(char c:s.toCharArray()) {
			if(c=='0') {
				ch[i]='1';
			}else {
				ch[i]='0';
			}
			i++;
		}
		String s2=new String(ch);
		return s2;
	}
	
	//二进制转10进制
	public static int invertDecimal(String s) {
		int sum=0;
		int temp;
		int j=0;
		for(int i=s.length()-1;i>=0;i--) {
			 temp=(s.charAt(i)-'0');
			 sum+=Math.pow(2, j)*temp;
			 j++;
		}
		return sum;
	}
}
