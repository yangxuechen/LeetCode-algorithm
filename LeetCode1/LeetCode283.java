package leetCode;

public class LeetCode283 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]= {0,0,1,1,0};
     moveZeroes2(a);
     for(int i=0;i<a.length;i++) {
    	 System.out.print(a[i]+" ");
     }
	}
	/**
	 * function 1
	 * @param nums
	 */
	public static void moveZeroes(int[] nums) {
	    if(nums==null) {
	    	return ;
	    }
	    int count=0;
	    int cur=nums.length-1;
	    int last=cur;
	    while(cur>=0) {
	    	if(nums[cur]==0) {
	    		count=last-cur;
	    		for(int i=0;i<count;i++) {
	    			nums[i+cur]=nums[i+cur+1];
	    		}
	    		nums[last]=0;
	    		last--;
	    	}
	    	cur--;
	    }
    }
	
	/**
	 * function 2
	 * @param nums
	 */
	
	public static void moveZeroes2(int[] nums) {
		int slow=0,fast=0;
		int len=nums.length;
		while(fast<len) {
			if(nums[fast]!=0) {
				nums[slow]=nums[fast];
				slow++;
			}
			fast++;
		}
		for(int i=slow;i<len;i++) {
			nums[i]=0;
		}
	}
	
	
}
