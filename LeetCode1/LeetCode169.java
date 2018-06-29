package leetCode;

/**
 * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 n/2的元素。

   你可以假设数组是非空的，并且给定的数组总是存在众数。
 * @author yangxuechen
 *
 */
public class LeetCode169 {

	public static void main(String[] args) {
		int a[]= {5,6,9,6,6,6,7,6,6,6,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		int n=majorityElement(a);
		System.out.println(n);
	}
    public static int majorityElement(int[] nums) {
        int i,j;
        for(i=0;i<nums.length;i++) {
        	for(j=0;j<nums.length-i-1;j++) {
        		if(nums[j]>nums[j+1]) {
        			int temp=nums[j];
        			nums[j]=nums[j+1];
        			nums[j+1]=temp;
        		}
        	}
        }
        for(i=0;i<nums.length;i++) {
        	System.out.print(nums[i]+" ");
        }
    	return nums[nums.length/2];
    }
}
