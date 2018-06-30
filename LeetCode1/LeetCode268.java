package leetCode;

public class LeetCode268 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {0,1,2,9,8,7,6,5,4};
		int n=missingNumber(a);
		System.out.println(n);
	}
	public static int missingNumber(int[] nums) {
	
		int n=nums.length;
		int[] arr=new int[n+1];
		for(int i=0;i<n;i++) {
			arr[nums[i]]=1;
		}
		for(int i=0;i<n+1;i++) {
			if(arr[i]==0) {
				return i;
			}
		}
		return 0;
	}
}
