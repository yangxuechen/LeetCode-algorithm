package leetCode;


/**
 * ����һ������ nums ��һ��ֵ val������Ҫԭ���Ƴ�������ֵ���� val ��Ԫ�أ������Ƴ���������³��ȡ�

��Ҫʹ�ö��������ռ䣬�������ԭ���޸��������鲢��ʹ�� O(1) ����ռ����������ɡ�

Ԫ�ص�˳����Ըı䡣�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�
 * @author yangxuechen
 *
 */
public class Demo6 {

	public static void main(String[] args) {
		int a[]= {5,5,5,5,5,5,9,5,1};
		int n=removeElement(a,5);
		//System.out.println("len="+a.length);
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
			
		}

	}
	public static int  removeElement(int[] nums,int val) {
		if(nums==null||nums.length==0) {
			return 0;
		}
		int count=nums.length;
		int i,j;
		for(i=0,j=nums.length-1;i<j;) {
			while(nums[j]==val) {
				if(i==j)
					break;
				j--;
			}
			if(nums[i]==val) {
				int temp=nums[i];
				nums[i]=nums[j];
				nums[j]=temp;
				i++;
			}else {
				i++;
			}
				
			}
		for(i=0;i<nums.length;i++) {
			if(nums[i]==val) {
				count--;
			}
		}
		return count;
	}

}
