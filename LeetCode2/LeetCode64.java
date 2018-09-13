package LeetCode2;

public class LeetCode64 {
    public static void main(String[] args) {

        int a[][]={{1,3,1},{1,5,1},{4,2,1}};
        int n=minPathSum(a);
        System.out.println(n);
    }

    public static int minPathSum(int[][] grid) {
        if(grid.length==0){
            return 0;
        }
        if(grid[0].length==0){
            return 0;
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(i==0&&j!=0){
                    grid[i][j]+=grid[i][j-1];
                }else if(i!=0&&j==0){
                    grid[i][j]+=grid[i-1][j];
                }else if(i!=0&&j!=0){
                    grid[i][j]+=Math.min(grid[i-1][j],grid[i][j-1]);
                }
            }
        }
        return grid[grid.length-1][grid[0].length-1];
    }
}
