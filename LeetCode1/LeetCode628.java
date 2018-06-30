package leetCode2;

import java.util.Arrays;

public class LeetCode628 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]= {-9,-10,1,2,3,4};
      int c=maximumProduct(a);
      System.out.println(c);
	}
	
    public static int maximumProduct(int[] nums) {
        int a=0;
        int b=0;
        Arrays.sort(nums);
        a=(nums[0]*nums[1]*nums[nums.length-1]);
        b=(nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3]);
        return a>b?a:b;
    	
    }
 
}
