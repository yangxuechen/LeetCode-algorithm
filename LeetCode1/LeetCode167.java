package leetCode;

/**
 *   给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。

函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
 * @author yangxuechen
 *
 */
public class LeetCode167 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,100,200};
		int[] b=twoSum(a,202);
		for(int i:b) {
			System.out.println(i);
		}

	}
	/**
	 * 通过二分查找来提高查找速度
	 * @param numbers
	 * @param target
	 * @return
	 */
    public static int[] twoSum(int[] numbers, int target) {
        int[] result=new int[2];
    	int len=numbers.length;
    	int left=0;
    	int right=len-1;
    	while(left<right) {
    		int value=numbers[left]+numbers[right];
    		if(value==target) {
    			result[0]=left+1;
    			result[1]=right+1;
    			break;
    		}else if(value>target) {
    			right--;
    		}else {
    			left++;
    		}
    	}
        return result;
    }
}
