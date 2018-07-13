package leetCode2;

public class LeetCode693 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s=toBinary(10);
        System.out.println(s);
        boolean b=hasAlternatingBits(10);
        if(b) {
        	System.out.println("true");
        }else {
        	System.out.println("false");
        }
	}
	
    public static boolean hasAlternatingBits(int n) {
        String s=toBinary(n);
        for(int i=0;i<s.length()-1;i++) {
        	if(s.charAt(i)==s.charAt(i+1)) {
        		return false;
        	}
        }
    	return true;
    }
    public static String toBinary(int n) {
    	String s="";
    	while(n>0) {
    		int temp=n%2;
    		s=temp+s;
    		n/=2;
    	}
    	return s;
    }
    
}
