package leetCode2;

public class LeetCode747 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,0};
		int n=dominantIndex(a);
		System.out.println(n);
	}
    public static int dominantIndex(int[] nums) {
    	if(nums.length==1) {
    		return 0;
    	}
        int max=Integer.MIN_VALUE;  //最大数
        int second=Integer.MIN_VALUE;//第二大的数
        int index=0;
        for(int i=0;i<nums.length;i++) {
        	if(nums[i]>max) {
        		max=nums[i];
        		index=i;
        	}
        }
        for(int i:nums) {
        	if(i>second&&i<max) {
        		second=i;
        	}
        }
        if(second*2<=max) {
        	return index;
        }
        
        System.out.println(max+" "+second);
        return -1;
    }
}
