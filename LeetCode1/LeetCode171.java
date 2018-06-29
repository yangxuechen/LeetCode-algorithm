package leetCode;

public class LeetCode171 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ZY";
     int n=titleToNumber(s);
     System.out.println(n);
	}
    public static int titleToNumber(String s) {
    	if(s==null||s.length()==0) {
    		return 0;
    	}
        int value=0,sum=0,len;
        len=s.length();
        int b=1;
        for(int i=len-1;i>=0;i--) {
        	value=b*(s.charAt(i)-'A'+1);
        	sum+=value;
        	b=b*26;
        }
    	return sum;
    }
}
