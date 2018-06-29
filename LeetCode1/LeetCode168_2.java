package leetCode;

public class LeetCode168_2 {

	public static void main(String[] args) {
		String str=convertToTitle(7010);
		System.out.println(str);

	}
	  public static String convertToTitle(int n) {
		  String temp="";
		  while(n>0) {
			  char s=(char) ((n-1)%26+'A');
			  temp=s+temp;
			  n=(n-1)/26;
		  }
		  return temp;
	  }
}
