package leetCode;

public class LeetCode461 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s=toBit(1);
     System.out.println(s);
     String s2=toBit(4);
     System.out.println(s2);
     int n=hammingDistance(1,4);
     System.out.println(n);
	}
    public static int hammingDistance(int x, int y) {
        String s1=toBit(x);
        String s2=toBit(y);
        int len1=s1.length();
        int len2=s2.length();
        int count=0;
        len1--;
        len2--;
        while(len1>=0&&len2>=0) {
        	if(s1.charAt(len1)!=s2.charAt(len2)) {
        		count++;
        	}
        	len1--;
        	len2--;
        }
        while(len1>=0) {
        	if(s1.charAt(len1)=='1') {
        		count++;
        	}
        	len1--;
        }
        while(len2>=0) {
        	if(s2.charAt(len2)=='1') {
        		count++;
        	}
        	len2--;
        }
    	return count;
    }
    
    public static String toBit(int n) {
    	if(n==0) {
    		return "0";
    	}
    	String s="";
    	while(n>0) {
    		int temp=n%2;
    		s=temp+s;
    		n/=2;
    	}
    	return s;
    }
}
