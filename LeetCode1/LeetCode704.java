package leetCode2;

public class LeetCode704 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {5};
		int n=search(a,5);
		System.out.println(n);
	}
	public static int search(int[] nums, int target) {
	
		int left=0;
		int right=nums.length-1;
		int middle=0;
		while(left<=right) {
			if(nums[left]==target) {
				return left;
			}
			if(nums[right]==target) {
				return right;
			}
			 middle=(left+right)/2;
			if(nums[middle]==target) {
				return middle;
			}else if(nums[middle]>target) {
				left++;
				right=middle;
			}else if(nums[middle]<target) {
				left=middle;
				right--;
			}
			//System.out.println(left+" "+right);
		}
		return middle;
	}
}
