package leetCode;

/**
 * ����һ����СΪ n �����飬�ҵ����е�������������ָ�������г��ִ������� n/2��Ԫ�ء�

   ����Լ��������Ƿǿյģ����Ҹ������������Ǵ���������
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
