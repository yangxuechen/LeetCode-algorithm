package leetCode2;

import java.util.ArrayList;
import java.util.List;

public class LeetCode830 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<List<Integer>> list=largeGroupPositions("abcdddeeeeaabbbcd");
        for(List l:list) {
        	System.out.println(l);
        }
	}
	public static List<List<Integer>> largeGroupPositions(String S) {
	        List<List<Integer>> list=new ArrayList<List<Integer>>();
	        int startIndex=0;
	        int endIndex=0;
	        char c[]=S.toCharArray();
	        for(startIndex=0,endIndex=0;endIndex<c.length-1;) {
	        	if(c[endIndex]==c[endIndex+1]) {
	        		endIndex++;
	        	}else {
	        		if(endIndex-startIndex>=2) {
	        			List<Integer> l=new ArrayList<Integer>();
	        			l.add(startIndex);
		        		l.add(endIndex);
		        		list.add(l);
	        		}
	        		
	        		startIndex=endIndex+1;
	        		endIndex=endIndex+1;;
	        	}
	        }
	        if(endIndex-startIndex>=2) {
    			List<Integer> l=new ArrayList<Integer>();
    			l.add(startIndex);
        		l.add(endIndex);
        		list.add(l);
    		}
//	        for(int i=0;i<c.length-1;i++) {
//	        	endIndex++;
//	        	if(c[i]!=c[i+1]) {
//	        		if(endIndex-startIndex>=3) {
//	        			List<Integer> l=new ArrayList<Integer>();
//		        		l.add(startIndex);
//		        		l.add(endIndex);
//		        		list.add(l);
//	        		}
//	                startIndex=i+1;
//	                endIndex=i+1;
//	        	}
//	        }
	        return list;
	}

}
