package LeetCode2;

public class LeetCode34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {1};
        int b[]=searchRange(a,2);
        
	}
	public static int[] searchRange(int[] nums, int target) {
	
		int l=0,m,r=nums.length-1;
		int a[]=new int[2];
		a[0]=-1;
		a[1]=-1;
		int flag1=0,flag2=0;
		while(l<=r) {
			if(nums[l]==target&&flag1==0) {
				a[0]=l;
				flag1++;
			}
			if(nums[r]==target&&flag2==0) {
				a[1]=r;
				flag2++;
			}
			if(flag1>0&&flag2>0) {
				break;
			}
			m=(l+r)/2;
			if(nums[m]>target) {
				r=--m;
			}else if(nums[m]<target){
				l=++m;
			}else {
				if(flag1==0) {
					l++;
				}
				if(flag2==0) {
					r--;
				}
			}
		}
		System.out.println(a[0]+" "+a[1]);
		return a;
	}
} 

