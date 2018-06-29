package leetCode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode217 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]= {1,2,3,4,5,6,9,8,34};
    boolean result=containsDuplicate(a);
    if(result==true) {
    	System.out.println("至少出现两次");
    }else {
    	System.out.println("false");
    }
	}
	public static boolean containsDuplicate(int[] nums) {
		if(nums==null||nums.length==0) {
			return false;
		}
	 
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		
		for(Integer i:nums) {
			if(map.get(i)==null) {
				map.put(i, 1);
			}else {
				return true;
			}
		}
		return false;
    }
}
