package leetCode2;

import java.util.HashSet;
import java.util.Set;

public class LeetCode849 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,0,0,0};
        int n=maxDistToClosest(a);
        System.out.println(n);
        
	}
    public static int maxDistToClosest(int[] seats) {
	    int max=0;  //最大距离
	    for(int i=0;i<seats.length;i++) {
	    	if(seats[i]==0) {
	    		int minD=getMinDistance(seats,i);
	    		int t=Math.abs(minD-i);
	    		if(t>max) {
	    			max=t;
	    		}
	    	}
	    }
    	return max;
	}
    
    public static int getMinDistance(int[] seats,int k) {
    	int leftIndex=k; //向左移动的指针
    	int rightIndex=k;
    	while(leftIndex>=0&&rightIndex<seats.length) {
    		if(seats[leftIndex]==1) {
    			return leftIndex;
    		}
    		if(seats[rightIndex]==1) {
    			return rightIndex;
    		}
    		leftIndex--;
    		rightIndex++;
    	}
    	while(leftIndex>=0) {
    		if(seats[leftIndex]==1) {
    			return leftIndex;
    		}
    		leftIndex--;
    	}
    	while(rightIndex<seats.length) {
    		if(seats[rightIndex]==1) {
    			return rightIndex;
    		}
    		rightIndex++;
    	}
    	return 0;
    }
}
