package leetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LeetCode136 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[] a= {1,1,2,2,3,3,5};
   int n=singleNumber(a);
   System.out.println(n);
	}
    public static int singleNumber(int[] nums) {
     Map map=new HashMap();
     for(int i=0;i<nums.length;i++) {
    	 if(map.get(nums[i])==null) {
    		 map.put(nums[i], 1);
    	 }else {
    		 map.remove(nums[i]);
    	 }
     }
    Set<Object> s=map.keySet();
    Object[] a=s.toArray();
    int n=(Integer) a[0];
    	return n;
    }
}
