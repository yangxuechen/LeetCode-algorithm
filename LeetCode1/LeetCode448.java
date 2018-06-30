package leetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode448 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]= {1,1};
      List<Integer> list=findDisappearedNumbers(a);
      System.out.println(list);
	}
	public static List<Integer> findDisappearedNumbers(int[] nums) {
	    List<Integer> list=new ArrayList<Integer>();
	    int max=nums.length;
	    int a[]=new int[max];
	    for(int i:nums) {
	    	a[i-1]=1;
	    }
	    for(int j=0;j<max;j++) {
	    	if(a[j]==0) {
	    		list.add(j+1);
	    	}
	    }
		return list;
	}
}
