package LeetCode2;

public class LeetCode59 {
    public static void main(String[] args) {

        int a[][]=generateMatrix(2);
        for(int i=0;i<a.length;i++){
            for (int j=0;j<a[0].length;j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] generateMatrix(int n) {

        int res[][]=new int[n][n];

        int startCol=0;
        int startRow=0;
        int endRow=res.length-1;
        int endCol=res[0].length-1;
        for(int count=1;count<=n*n;){

            //top
            for (int j=startCol;j<=endCol;j++){
               res[startRow][j]=count;
               count++;
            }
            startRow++;

            //right
            for (int i=startRow;i<=endRow;i++){
               res[i][endCol]=count;
               count++;
            }
            endCol--;

            //down
            for (int j=endCol;j>=startCol;j--){
                res[endRow][j]=count;
                count++;
            }
            endRow--;

            //left
            for (int i=endRow;i>=startRow;i--){
                res[i][startCol]=count;
                count++;
            }
            startCol++;
        }
        return res;
    }
}
