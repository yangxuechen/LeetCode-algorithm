package leetCode;

/**
 * ����һ�����������һ��Ŀ��ֵ�����������ҵ�Ŀ��ֵ�������������������Ŀ��ֵ�������������У����������ᱻ��˳������λ�á�
 * @author yangxuechen
 *
 */
public class Demo8 {

	public static void main(String[] args) {
	
     int a[]= {0,2,3,4,8,9,10};
     int n=searchInsert(a,10);
     System.out.println(n);
	}
    public static int searchInsert(int[] nums, int target) {
    	if(nums==null||nums.length==0) {
    		return 0;
    	}
    	int i;
    	if(target<nums[0]) {
    		return 0;
    	}
    	if(target>nums[nums.length-1]) {
    		return nums.length;
    	}
    	for(i=0;i<nums.length;i++) {
    		if(target==nums[i]) {
    			return i;
    		}
    		if(target>nums[i]&&target<nums[i+1]) {
    			return i+1;
    		}
    	}
    	return 0;
    }
}
