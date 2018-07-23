package leetCode2;

import java.util.HashMap;

public class LeetCode771 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=numJewelsInStones("HJK","KKJJHlllOOIJJ");
		System.out.println(n);
	}
   public static int numJewelsInStones(String J, String S) {
	   if(J==null||S==null||J.length()==0||S.length()==0) {
		   return 0;
	   }
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(char c:J.toCharArray()) {
        	map.put(c, 1);
        }
        int count=0;
        for(char c:S.toCharArray()) {
        	if(map.containsKey(c)) {
        		count++;
        	}
        }
	   return count;
    }
}
