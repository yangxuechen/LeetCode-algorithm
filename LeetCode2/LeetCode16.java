package LeetCode2;

import java.util.Arrays;

public class LeetCode16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {-1,5,6,7,8,9,1,1,1,-9};
        int n=threeSumClosest1(a,-9);
        System.out.println(n);
	}
	
	//function 2
    public static int threeSumClosest(int[] nums, int target) {
    	Arrays.sort(nums);  //数组排序
	    int min=Integer.MAX_VALUE;
	    int l,m,r;  //分别指向左边，中间，右边
	    int result=0,reserve;
	    for(l=0;l<nums.length-2;l++) {
	    	m=l+1;
	    	r=nums.length-1;
	     reserve=target-nums[l];
	    	while(m<r) {
	    		if(Math.abs(reserve-nums[m]-nums[r])<min){
                    result=nums[l]+nums[r]+nums[m];
                    min=Math.abs(reserve-nums[m]-nums[r]);
                }
                if(nums[m]+nums[r]<reserve){
                        m++;
                } else{
                    r--;
                }
	    	}
	    }
    	return result;
	}
    
    //function 1  时间复杂度=O(n^3)
    public static int threeSumClosest1(int[] nums, int target) {
    	int min=Integer.MAX_VALUE;
    	int result=0;
    	for(int i=0;i<nums.length-2;i++) {
    		for(int j=i+1;j<nums.length-1;j++) {
    			for(int k=j+1;k<nums.length;k++) {
    				int temp=nums[i]+nums[j]+nums[k];
    				if(Math.abs(target-temp)<min) {
    					min=Math.abs(target-temp);
    					result=temp;
    				}
    			}
    		}
    	}
    	return result;
    }
    
}
