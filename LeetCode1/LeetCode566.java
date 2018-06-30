package leetCode2;

public class LeetCode566 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[][]= {{1,2},{3,4}};
     int b[][]=matrixReshape(a,1,4);
     for(int i=0;i<b.length;i++) {
    	 for(int j=0;j<b[0].length;j++) {
    		 System.out.print(b[i][j]+" ");
    	 }
    	 System.out.println();
     }
	}
	/**
	 * function 1
	 * @param nums
	 * @param r
	 * @param c
	 * @return
	 */
	
	/*
	 public static int[][] matrixReshape(int[][] nums, int r, int c) {
	     int m=nums.length; //行
	     int n=nums[0].length;//列
	     if(r*c>m*n) {
	    	 return nums;
	     }
	     int a[]=new int[m*n];
	     int b[][]=new int[r][c];
	     int k=0;
	     for(int i=0;i<m;i++) {
	    	 for(int j=0;j<n;j++) {
	    		 a[k]=nums[i][j];
	    		 k++;
	    	 }
	     }
	     k=0;
	     for(int i=0;i<r;i++) {
	    	 for(int j=0;j<c;j++) {
	    		 b[i][j]=a[k];
	    		 k++;
	    	 }
	     }
		 return b;
	 }
	 */
	public static int[][] matrixReshape(int[][] nums, int r, int c) {
		int m=nums.length; //行
	     int n=nums[0].length;//列
	     int n1=n;
	     if(r*c!=m*n) {
	    	 return nums;
	     }
	     int b[][]=new int[r][c];
	     m=0;n=0;
	     for(int i=0;i<r;i++) {
	    	 for(int j=0;j<c;j++) {
	    		 b[i][j]=nums[m][n];
	    		 if(++n>=n1) {
	    			 n=0;
	    			 m++;
	    		 }
	    	 }
	     }
	     return b;
	}
	 
}
