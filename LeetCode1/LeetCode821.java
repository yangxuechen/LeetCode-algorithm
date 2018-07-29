package leetCode2;

import java.util.ArrayList;
import java.util.List;

public class LeetCode821 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]=shortestToChar("loveleetcode",'e');
     for(int i:a) {
    	 System.out.print(i+" ");
     }
	}
	public static int[] shortestToChar(String S, char C) {
	    List<Integer> list=new ArrayList<Integer>();//存储S的C的出现索引
	    for(int i=0;i<S.length();i++) {
	    	if(S.charAt(i)==C) {
	    		list.add(i);
	    	}
	    }
	    int result[]=new int[S.length()];
	    for(int i=0;i<S.length();i++) {
	    	if(S.charAt(i)==C) {
	    		result[i]=0;
	    	}else {
	    		int min=Integer.MAX_VALUE;//找到当前字符距相同目标字符的最短距离
	    		for(int t:list) {
	    			int temp=Math.abs(t-i);
	    			if(temp<min) {
	    				min=temp;
	    			}
	    		}
	    		result[i]=min;
	    	}
	    }
		return result;
	}
}
