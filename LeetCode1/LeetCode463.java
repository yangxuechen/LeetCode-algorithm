package leetCode;

public class LeetCode463 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int [][]a= {{0,0,0,0,},{0,1,1,0},{0,1,1,0},{0,0,0,0}};
    int n=islandPerimeter(a);
    System.out.println(n);
	}
	public static int islandPerimeter(int[][] grid) {
	        int i,j;
	        int m=grid.length;//��
	        int n=grid[0].length;//��
	    //    System.out.println("�У�"+m+"�У�"+n);
	        int sum=0;
	        for(i=0;i<m;i++) {
	        	for(j=0;j<n;j++) {
	        		int s=0;
	        		//�ж��Ϸ�
	        		if(grid[i][j]==1) {
	        			if((i-1)<0) {
	        				s++;
	        			}else {
	        				if(grid[i-1][j]==0) {
	        					s++;
	        				}
	        			}
	        			
	        		//�ж��·�
	        		if(i+1>=m) {
	        			s++;
	        		}else {
	        			if(grid[i+1][j]==0) {
	        				s++;
	        			}
	        		}
	        		//�ж����
	        		if(j-1<0) {
	        			s++;
	        		}else {
	        			if(grid[i][j-1]==0) {
	        				s++;
	        			}
	        		}
	        		//�ж��ұ�
	        		if(j+1>=n) {
	        			s++;
	        		}else {
	        			if(grid[i][j+1]==0) {
	        				s++;
	        			}
	        		}
	        		}
	        		sum+=s;
	        	}
	        }
	    //   System.out.println(grid[0].length);
		return sum;
	}

}
