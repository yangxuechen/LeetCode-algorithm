package leetCode2;

import java.util.Arrays;
import java.util.HashMap;

public class LeetCode506 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,6,9,100,99,2,3};
		String s[]=findRelativeRanks(a);
		for(String str:s) {
			System.out.print(str+" ");
		}
	}
    public static String[] findRelativeRanks(int[] nums) {
        int nums2[]=new int[nums.length];
        for(int j=0;j<nums.length;j++) {
        	nums2[j]=nums[j];
        }
        Arrays.sort(nums2);  //得到升序排序的数组
//        for(int i:nums2) {
//        	System.out.print(i+" ");
//        }
//        System.out.println();
//        for(int i:nums) {
//        	System.out.print(i+" ");
//        }
//        System.out.println();
        //以分数作为key,排名作为value构建哈希表
        int i=1;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int j=nums2.length-1;j>=0;j--) {
        	map.put(nums2[j], i);
        	i++;
        }
//        System.out.println(map);
        
        String s[]=new String[nums.length];
        for(int j=0;j<nums.length;j++) {
        	int temp=map.get(nums[j]);  //得到相应分数的排名
        	if(temp==1) {
        		s[j]="Gold Medal";
        	}else if(temp==2) {
        		s[j]="Silver Medal";
        	}else if(temp==3) {
        		s[j]="Bronze Medal";
        	}else {
        		s[j]=""+temp;
        	}
        }
    	return s;
    }
    
    

}
