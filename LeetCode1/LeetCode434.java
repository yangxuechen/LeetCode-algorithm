package leetCode;

public class LeetCode434 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n=countSegments("hgjjjk  ²Í ");
     System.out.println(n);
	}
	public static int countSegments(String s) {
		if(s.length()==0||s==null) {
			return 0;
		}
	    int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				if(i<s.length()-1) {
					if(s.charAt(i+1)!=' ') {
						count++;
					}
				}
			}
		}
		if(s.charAt(0)==' ') {
			count--;
		}
//		if(s.charAt(s.length()-1)==' ') {
//			count++;
//		}
		return count+1;
	}
}
