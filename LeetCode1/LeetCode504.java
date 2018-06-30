package leetCode2;

public class LeetCode504 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s=convertToBase7(-7);
     System.out.println(s);
	}
	public static String convertToBase7(int num) {
		if(num==0) {
			return "0";
		}
		int flag=0;
	    if(num<0) {
	    	num=Math.abs(num);
	    	flag=1;
	    }
		String s="";
		while(num>0) {
			int temp=num%7;
			num/=7;
			s=temp+s;
		}
		if(flag==1) {
			s="-"+s;
		}
		return s;
	}
}
