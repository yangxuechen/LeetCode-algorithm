package leetCode2;

import java.util.HashSet;
import java.util.Set;

public class LeetCode859 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        boolean b=buddyStrings("abab","abab");
        if(b) {
        	System.out.println("true");
        }else {
        	System.out.println("false");
        }
	}
	public static boolean buddyStrings(String A, String B) {
	    if(A.length()==0||B.length()==0) {
	    	return false;
	    }
	    if(A.length()!=B.length()) {
	    	return false;
	    }
	    if(A.equals(B)) {
	    	Set<Character> set=new HashSet<Character>();
	    	for(int i=0;i<A.length();i++) {
	    		set.add(A.charAt(i));
	    	}
	    	if(set.size()==A.length()) {
	    		return false;
	    	}
	    	return true;
	    }
	    int count=0;
	    Set<Character> set1=new HashSet<Character>();
	    Set<Character> set2=new HashSet<Character>();
	    for(int i=0;i<A.length();i++) {
	    	if(A.charAt(i)!=B.charAt(i)) {
	           set1.add(A.charAt(i));
	           set2.add(B.charAt(i));
	           count++;
	    	}
	    	if(count>2) {
	    		return false;
	    	}
	    }
	    if(count==2&&set1.equals(set2)) {
	       return true;
	    }
		return false;
	}

}
