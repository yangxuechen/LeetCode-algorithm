package LeetCode2;

import java.util.List;
import java.util.LinkedList;

public class LeetCode73 {
    public static void main(String[] args) {

        int a[][]={};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        setZeroes(a);
        System.out.println("*********************");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void setZeroes(int[][] matrix) {

        List<List<Integer>> list=new LinkedList<List<Integer>>();//用来存储数组中元素值==0的索引

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    List<Integer> tmp=new LinkedList<Integer>();
                    tmp.add(i);
                    tmp.add(j);
                    list.add(tmp);
                }
            }
        }

        //将索引处的行列元素都赋0
        for(List<Integer> l:list){
            for(int i=0;i<matrix.length;i++){
                matrix[i][l.get(1)]=0;
            }
            for(int j=0;j<matrix[0].length;j++){
                matrix[l.get(0)][j]=0;
            }
        }
    }
}
