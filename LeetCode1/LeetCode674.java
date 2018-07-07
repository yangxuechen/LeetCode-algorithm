package leetCode2;

public class LeetCode674 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= new int[0];
		int n=findLengthOfLCIS(a);
		System.out.println(n);
	}
	
    public static int findLengthOfLCIS(int[] nums) {
    	if(null==nums||nums.length==0) {
    		return 0;
    	}
        int max=1;   //最长递增子序列数量
        int tempCount=1;//临时存放每一段递增子序列数量
        for(int i=0;i<nums.length-1;i++) {
        	if(nums[i]<nums[i+1]) {
        		tempCount++;
        		if(tempCount>max) {
        			max=tempCount;
        		}
        	}else {
        		tempCount=1;  //重新计数
        	}
        }
    	return max;
    }

}
