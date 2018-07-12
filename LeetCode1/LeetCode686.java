package leetCode2;

public class LeetCode686 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A="abcd";
		String B="cdabcdab";
       int n=repeatedStringMatch(A,B);
       System.out.println(n);
	}
	 public static int repeatedStringMatch(String A, String B) {
	     String tempS=A;
	     int count=1;
		 while(A.length()<B.length()){
			 A+=tempS;
			 count++;
		 }
		 if(A.indexOf(B)>=0) {
			 return count;
		 }
		 A=A+tempS;
		 if(A.indexOf(B)>=0) {
			 return count+1;
		 }
		 return -1;
	 }
}
