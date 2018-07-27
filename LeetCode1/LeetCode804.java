package leetCode2;

import java.util.HashSet;
import java.util.Set;

public class LeetCode804 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s[]= {"gin", "zen", "gig", "msg"};
		int n=uniqueMorseRepresentations(s);
		System.out.println(n);
	}
    public static int uniqueMorseRepresentations(String[] words) {
        String s[]= {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set=new HashSet<String>();
        for(String str:words) {
        	char c[]=str.toCharArray();
        	String tempS="";
        	for(char ch:c) {
        		tempS+=s[ch-'a'];
        	}
        //	System.out.println(tempS);
        	set.add(tempS);
        }
    	return set.size();
    }
}
