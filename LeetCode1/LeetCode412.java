package leetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode412 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<String> list=fizzBuzz(15);
      System.out.println(list);
	}
	public static List<String> fizzBuzz(int n) {
	    List<String> list=new ArrayList<String>();    
		for(int i=1;i<=n;i++) {
			String s=judgment(i);
			list.add(s);
		}
		return list;
    }
	public static String judgment(int n) {
		if(n%3==0&&n%5!=0) {
			return "Fizz";
		}else if(n%3!=0&&n%5==0) {
			return "Buzz";
		}else if(n%3==0&&n%5==0) {
			return "FizzBuzz";
		}else {
			return ""+n;
		}
	}
}

















