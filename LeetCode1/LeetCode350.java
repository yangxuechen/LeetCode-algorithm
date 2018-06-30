package leetCode;

import java.util.Arrays;
import java.util.HashMap;

public class LeetCode350 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1[]= {1,2,3,4,5,6,7,8,9};
		int nums2[]= {10};
      int a[]=intersect(nums1,nums2);
      for(int i:a) {
    	  System.out.println(i);
      }
	}
	 public static int[] intersect(int[] nums1, int[] nums2) {
	     HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
	     for(Integer i:nums1) {
	    	 if(map.containsKey(i)) {
	    		 map.put(i,map.get(i)+1);
	    	 }else {
	    		 map.put(i, 1);
	    	 }
	     }
	     int j=0;
	     for(Integer i:nums2) {
	    	 if(map.containsKey(i)) {
	    		 nums1[j++]=i;
	    		 map.put(i, map.get(i)-1);
	    		 if(map.get(i)==0) {
	    			 map.remove(i);
	    		 }
	    	 }
	     }
		 return Arrays.copyOfRange(nums1, 0, j);
	  }
}
