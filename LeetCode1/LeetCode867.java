package leetCode2;

public class LeetCode867 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int A[][]= {{1,2,3},{4,5,6},{7,8,9}};
        int B[][]=transpose(A);
        for(int i=0;i<B.length;i++) {
        	for(int j=0;j<B[0].length;j++) {
        		System.out.print(B[i][j]+" ");
        	}
        	System.out.println();
        }
	}
    public static int[][] transpose(int[][] A) {
        int row=A.length; //行
        int col=A[0].length; //列
        int B[][]=new int[col][row];
        for(int i=0;i<col;i++) {
        	for(int j=0;j<row;j++) {
        		B[i][j]=A[j][i];
        	}
        }
    	return B;
    }

}
