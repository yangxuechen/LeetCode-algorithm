package leetCode2;

import java.util.Arrays;

public class LeetCode561 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,8,2,9};
     int n=arrayPairSum(a);
	}
	public static int arrayPairSum(int[] nums) {
	    int sum=0;
		Arrays.sort(nums);//�����鰴��������
		
		//���������ڵ���СԪ�����
		for(int i=0;i<nums.length;i+=2) {
	//		System.out.println(nums[i]);
			sum+=nums[i];
		}
	//	System.out.println("sum:"+sum);
		return sum;
	}
}
