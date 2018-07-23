package leetCode2;

import java.util.HashSet;
import java.util.Set;

public class LeetCode766 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//     int a[][]= {{1,2,3,4},
//    		     {5,1,2,3},
//    		     {9,5,1,2}};
     int a[][]= {{1,2},
    		     {1,2}};
     boolean b=isToeplitzMatrix(a);
     if(b) {
    	 System.out.println("true");
     }else {
    	 System.out.println("false");
     }
	}
   public static boolean isToeplitzMatrix(int[][] matrix) {
        Set<Integer> set=new HashSet<Integer>();
        int m=matrix.length;   //行
        int n=matrix[0].length;//列
        
        for(int i=0;i<m;i++) {
        	set.clear();
        	for(int s=i,t=0;s<m&&t<n;s++,t++) {
        //		System.out.print(matrix[s][t]+" ");
        		set.add(matrix[s][t]);
        		if(set.size()>1) {
        			return false;
        		}
        	}
        //	System.out.println();
        }
        
        for(int i=0;i<n;i++) {
        	set.clear();
        	for(int s=0,t=i;s<m&&t<n;s++,t++) {
        //		System.out.print(matrix[s][t]+" ");
        		set.add(matrix[s][t]);
        		if(set.size()>1) {
        			return false;
        		}
        	}
       // 	System.out.println();
        }
	   return true;
    }
}
