package leetCode2;

import java.util.HashMap;

public class LeetCode575 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]= {1,1,2,2,3,3,4,5,6,7};
    int n=distributeCandies(a);
    System.out.println(n);
	}
	 public static int distributeCandies(int[] candies) {
	    HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
	    int n=candies.length/2;//sister应分得的candies
	    for(int i:candies) {
	    	map.put(i, 1);
	    }
	    int d=map.size();//candies的种类数
	   if(d>n) {
		   return n;
	   }else {
		   return d;
	   }
	 }
}
