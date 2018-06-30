package leetCode2;

import java.util.ArrayList;
import java.util.List;

public class LeetCode492 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<ArrayList<Integer>> list=findFactor(1);
     System.out.println(list);
     
     int a[]=constructRectangle(1);
     for(int i:a) {
    	 System.out.print(i+" ");
     }
		
//		int n=(int) Math.sqrt(10);
//		System.out.println(n);
	}
	public static int[] constructRectangle(int area) {
		List<ArrayList<Integer>> list=findFactor(1);
		int a[]=new int[2];
		int len=list.size()-1;
		a[0]=list.get(len).get(0);
		a[1]=list.get(len).get(1);
		return a;
	}
	
	public static List<ArrayList<Integer>> findFactor(int n){
		List<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
		for(int i=1;i<=Math.sqrt(n);i++) {
			int temp=n%i;
			if(temp==0) {
				ArrayList<Integer> l=new ArrayList<Integer>();
				l.add(n/i);
				l.add(i);
				list.add(l);
			}
		}
		return list;
	}
}
