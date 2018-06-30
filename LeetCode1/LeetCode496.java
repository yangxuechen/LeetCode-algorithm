package leetCode2;

public class LeetCode496 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums1= {1,3,5,2,4};
		int nums2[]= {6,5,4,3,2,1,7};
		int a[]=nextGreaterElement(nums1,nums2);
		for(int i:a) {
			System.out.print(i+" ");
		}
	}
	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
	
		int a[]=new int[nums1.length];
		for(int i=0;i<nums1.length;i++) {
			for(int j=0;j<nums2.length;j++) {
				if(nums1[i]==nums2[j]) {
					if(j==nums2.length-1) {
						a[i]=-1;
						break;
					}else {
						int s;
						for( s=j;s<nums2.length;s++) {
							if(nums1[i]<nums2[s]) {
								a[i]=nums2[s];
								break;
							}
						}
						if(a[i]==0) {
							a[i]=-1;
						}
					}
				}
			}
		}
		return a;
	}
}
