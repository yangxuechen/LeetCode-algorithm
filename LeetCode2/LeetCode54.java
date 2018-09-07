package LeetCode2;

import java.util.LinkedList;
import java.util.List;

public class LeetCode54 {
    public static void main(String[] args){

        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> res=spiralOrder(a);
        System.out.print(res);
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res=new LinkedList<Integer>();
        if(matrix.length==0){
            return res;
        }
        int startCol=0;
        int startRow=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;

        while(true){
            //top
            for (int j=startCol;j<=endCol;j++){
                res.add(matrix[startRow][j]);
            }
            startRow++;
            if(startRow>endRow) break;

            //right
            for (int i=startRow;i<=endRow;i++){
                res.add(matrix[i][endCol]);
            }
            endCol--;
            if(startCol>endCol) break;

            //down
            for (int j=endCol;j>=startCol;j--){
                res.add(matrix[endRow][j]);
            }
            endRow--;
            if(startRow>endRow) break;

            //left
            for (int i=endRow;i>=startRow;i--){
                res.add(matrix[i][startCol]);
            }
            startCol++;
            if(startCol>endCol) {
                break;
            }
        }
        return res;
    }
}
