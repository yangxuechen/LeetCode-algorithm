package leetCode2;

public class LeetCode724 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int a[]= {8};
		int n=pivotIndex(a);
		System.out.println(n);
	}
    public static int pivotIndex(int[] nums) {
        for(int i=0;i<nums.length;i++) {
        	boolean b=isPivoIndex(nums,i);
        	if(b) {
        		return i;
        	}
        }
    	return -1;
    }
    
    public static boolean isPivoIndex(int[] nums,int k) {
    	int sum=0;
    	for(int i=0;i<k;i++) {
    		sum+=nums[i];
    	}
    	for(int i=k+1;i<nums.length;i++) {
    		sum-=nums[i];
    	}
    	if(sum==0) {
    		return true;
    	}
    	return false;
    }
}
