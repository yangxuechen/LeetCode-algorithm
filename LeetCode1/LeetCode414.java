package leetCode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode414 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]= {1,-2147483648,-2147483648};
     int n=thirdMax(a);
     System.out.println(n);
	}
    public static int thirdMax(int[] nums) {
    	int max=-2147483648,second=-2147483648,third=-2147483648;
    	int flag=0;
        for(int i:nums) {
        	if(i>max) {
        		max=i;
        	}
        }
        
        for(int i:nums) {
        	if(i>=second&&i<max) {
        		second=i;
        	}
        }
        for(int i:nums) {
        	if(i>=third&&i<second) {
        		third=i;
        		flag=1;
        	}
        }
      //  System.out.println("max:"+max+"second:"+second+"third:"+third);
        if(flag==1) {
        	return third;
        }
    	return max;
    }

}
