package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LeetCode202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      int n=recount(1024);
//      System.out.println(n);
		//isHappy(108);
		boolean result=happy(11);
		if(result==true) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
	public static boolean happy(int n) {
		if(n<=0) {
			return false;
		}
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		return isHappy(n,map);
	}
	public static boolean isHappy(int n,Map<Integer,Integer> map) {
		if(map.get(n)!=null) {
			return false;
		}
		map.put(n, 1);
		while(n!=0) {
			n=recount(n);
			if(n==1) {
				return true;
			}else {
				return isHappy(n,map);
			}
			
		}
	//	System.out.println(n);
		return false;
	}
	
	public static int recount(int n) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		int temp=0,sum=0;
		while(n>0) {
			temp=n%10;
			list.add(temp);
			n/=10;
		}
		for(Integer i:list) {
			temp=i*i;
			sum+=temp;
		//	System.out.println(i);
		}
		return sum;
	}

}
