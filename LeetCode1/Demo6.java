package leetCode;


/**
 * 给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。

不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。

元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
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
