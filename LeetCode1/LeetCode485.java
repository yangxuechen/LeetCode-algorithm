package leetCode;

public class LeetCode485 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,1,0,1,1,1,0,1,1,1,1,0,1,1};
        int max=findMaxConsecutiveOnes(a);
        System.out.println(max);
	}
	public static int findMaxConsecutiveOnes(int[] nums) {
	        int max=0;
	        int count=0;
	        for(int i:nums) {
	        	if(i==1) {
	        		count++;
	        	}else if(i==0) {
	        		if(count>max) {
	        			max=count;
	        		}
	        		count=0;
	        	}
	        }
	      //  System.out.println("count:"+count);
	        if(count>max) {
	        	return count;
	        }
		return max;
	}
}
