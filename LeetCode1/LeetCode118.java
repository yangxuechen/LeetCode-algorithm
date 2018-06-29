package leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Ñî»ÔÈý½Ç
 * @author yangxuechen
 *
 */
public class LeetCode118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<List<Integer>> list=generate(5);
     for(List<Integer> i:list) {
     	for(Integer j:i) {
     		System.out.print(j+" ");
     	}
     	System.out.println();
     }
	}
	 public static List<List<Integer>> generate(int n) {
		 if(n<0) {
			 return null;
		 }
		 List<List<Integer>> list=new ArrayList<>();
	     if(n>=1) {
	    	 List<Integer> date=new ArrayList<Integer>();
	    	 date.add(1);
	    	 list.add(date);
	     }
	     if(n>=2) {
	    	 List<Integer> date=new ArrayList<Integer>();
	    	 date.add(1);
	    	 date.add(1);
	    	 list.add(date);
	     }
	     if(n>=3) {
	    	 for(int i=3;i<=n;i++) {
	    		 List<Integer> date=new ArrayList<Integer>();
	    		 List<Integer> prev=list.get(i-2);
	    		 date.add(1);
	    		 for(int j=2;j<=i-1;j++) {
	    			 date.add(prev.get(j-1)+prev.get(j-2));
	    		 }
	    		 date.add(1);
	    		 list.add(date);
	    	 }
	     }
	        return list;
	    }
}
