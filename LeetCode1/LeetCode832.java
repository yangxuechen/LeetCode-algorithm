package leetCode2;

public class LeetCode832 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int A[][]= {{1,1,0},{1,0,1},{0,0,0}};
        int a[][]=flipAndInvertImage(A);
        for(int i=0;i<a.length;i++) {
	    	for(int j=0;j<a[i].length;j++) {
	            System.out.print(a[i][j]);
	    	}
	    	System.out.println();
	    }
        
	}
	public static int[][] flipAndInvertImage(int[][] A) {
		//水平翻转
	    for(int i=0;i<A.length;i++) {
	    	int startIndex=0;
	    	int endIndex=A[i].length-1;
	    	while(startIndex<endIndex) {
	    		int temp=A[i][endIndex];
	    		A[i][endIndex]=A[i][startIndex];
	    		A[i][startIndex]=temp;
	    		startIndex++;
	    		endIndex--;
	    	}
	    }
	    //反转图像
	    for(int i=0;i<A.length;i++) {
	    	for(int j=0;j<A[i].length;j++) {
	    		if(A[i][j]==0) {
	    			A[i][j]=1;
	    		}else {
	    			A[i][j]=0;
	    		}
	    	}
	    }
		return A;
	}
}
