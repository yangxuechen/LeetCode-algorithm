package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LeetCode349 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1= {1,1,2,3,4};
		int[] nums2= {27,7,1,4,8,9};
      int[] a=intersection2(nums1,nums2);
      for(int i:a) {
    	  System.out.println(i);
      }
	}
	
	/**
	 * function 1 时间复杂度较高
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	 public static int[] intersection(int[] nums1, int[] nums2) {
		 Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		 int[] arr3=new int[0];
	       for(int i=0;i<nums1.length;i++) {
	    	   for(int j=0;j<nums2.length;j++) {
	    		   if(nums1[i]==nums2[j]) {
	    			  if(!map.containsKey(nums1[i])) {
	    				  map.put(nums1[i], 1);
	    			  }
	    		   }
	    	   }
	       }
	       if(map.isEmpty()) {
	    	   return arr3;
	       }
	       Set<Integer> a=map.keySet();
	   //    System.out.println(a);
	       Object[] arr=a.toArray();
	       int[] arr2=new int[arr.length];
	       for(int i=0;i<arr.length;i++) {
	    	   arr2[i]=(int) arr[i];
	       }
		 return arr2;
	 }
	 
	 /**
	  * function 2
	  * @param nums1
	  * @param nums2
	  * @return
	  */
	 public static int[] intersection2(int[] nums1,int[] nums2) {
		 HashSet<Integer> set=new HashSet<Integer>();
		 for(int i:nums1) {
			 set.add(i);
		 }
		 int i=0;
		 for(int n:nums2) {
			 if(set.contains(n)) {
				 nums2[i++]=n;
			 }
		 }
		 return Arrays.copyOfRange(nums2, 0, i);
	 }
}
