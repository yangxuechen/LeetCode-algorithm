package leetCode;

/**
 *   ����һ���Ѱ����������� ���������飬�ҵ�������ʹ���������֮�͵���Ŀ������

����Ӧ�÷����������±�ֵ index1 �� index2������ index1 ����С�� index2��
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
	 * ͨ�����ֲ�������߲����ٶ�
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
