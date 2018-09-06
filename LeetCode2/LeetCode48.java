package LeetCode2;

public class LeetCode48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
        rotate(a);
        for(int i=0;i<a.length;i++) {
        	for(int j=0;j<a[0].length;j++) {
        		System.out.print(a[i][j]);
        	}
        	System.out.println();
        }
	}
	
	public static void rotate(int[][] matrix) {
        for(int i=0, temp=0, n=matrix.length-1; i<=n/2; i++) {
            for(int j=i; j<n-i; j++) {
                temp = matrix[j][n-i];
                matrix[j][n-i] = matrix[i][j];
                matrix[i][j] = matrix[n-j][i];
                matrix[n-j][i] = matrix[n-i][n-j];
                matrix[n-i][n-j] = temp;
            }
        }
    }


}
