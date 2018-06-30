package leetCode2;

import java.util.HashMap;
import java.util.Map.Entry;

public class LeetCode594 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]= {1,2,2,2,5,6,33,3,3,7,8};
      int n=findLHS(a);
      System.out.println("max:"+n);
	}
    public static int findLHS(int[] nums) {
    	int max=0;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i:nums) {
        	if(map.containsKey(i)) {
        		map.put(i, map.get(i)+1);
        	}else {
        		map.put(i, 1);
        	}
        }
//        for(Entry<Integer,Integer> entry:map.entrySet()) {
//        	int key=entry.getKey();
//        	int value=entry.getValue();
//        //	System.out.println(key+" "+value);
//        	if(map.containsKey(key+1)) {
//        		int value2=map.get(key+1);
//        		if(value+value2>max) {
//        			max=value+value2;
//        		}
//        	}
//        }
        for(Integer i:map.keySet()) {
        	int value=map.get(i);
        	if(map.containsKey(i+1)) {
        		int value2=map.get(i+1);
        		if(value+value2>max) {
        			max=value+value2;
        		}
        	}
        }
      //  System.out.println(map);
    	return max;
    }

}
