package LeetCode2;

import java.util.ArrayDeque;

public class LeetCode200 {
    public static void main(String[] args) {

        int a[][]={{1,0,1,1,1},
                   {1,0,1,0,1},
                   {1,1,1,0,1}};
        int n=numIslands(a);
        System.out.println(n);
    }
    public static int numIslands(int[][] grid) {
        if(null==grid||grid.length==0){
            return 0;
        }
        boolean[][] used=new boolean[grid.length][grid[0].length];
        ArrayDeque<Index> queue=new ArrayDeque<Index>();
        int count=0;//岛屿数
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1&&used[i][j]==false){
                    Index tmp=new Index(i,j);
                    count++;
                    queue.add(tmp);
                    while (!queue.isEmpty()){
                        Index index=queue.removeFirst();
                        if(index.x<grid.length-1){//判断右边是否是岛屿
                            if(grid[index.x+1][index.y]==1&&used[index.x+1][index.y]==false){
                                queue.add(new Index(index.x+1,index.y));
                                used[index.x+1][index.y]=true;
                            }
                        }
                        if(index.y<grid[0].length-1){//判断下边是否有岛屿
                            if(grid[index.x][index.y+1]==1&&used[index.x][index.y+1]==false){
                                queue.add(new Index(index.x,index.y+1));
                                used[index.x][index.y+1]=true;
                            }
                        }
                        if(index.y>0){//判断左边是否有岛屿
                            if(grid[index.x][index.y-1]==1&&used[index.x][index.y-1]==false){
                                queue.add(new Index(index.x,index.y-1));
                                used[index.x][index.y-1]=true;
                            }
                        }
                        if(index.x>0){//判断上边是否有岛屿
                            if(grid[index.x-1][index.y]==1&&used[index.x-1][index.y]==false){
                                queue.add(new Index(index.x-1,index.y));
                                used[index.x-1][index.y]=true;
                            }
                        }
                    }
                }
            }
        }
        return count;
    }

    public static class Index{
        int x;//行索引
        int y;//列索引

        public Index(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
