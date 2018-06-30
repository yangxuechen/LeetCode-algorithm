package leetCode;

import java.util.HashMap;

public class LeetCode383 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     boolean result=canConstruct2("aabsss","aabsss");
     if(result) {
    	 System.out.println("true");
     }else {
    	 System.out.println("false");
     }
	}
	/**
	 * function 1
	 * @param ransomNote
	 * @param magazine
	 * @return
	 */
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<magazine.length();i++) {
        	if(map.containsKey(magazine.charAt(i))) {
        		map.put(magazine.charAt(i), map.get(magazine.charAt(i))+1);
        	}else {
        		map.put(magazine.charAt(i), 1);
        	}
        }
       // System.out.println(map);
        for(int i=0;i<ransomNote.length();i++) {
        	if(map.containsKey(ransomNote.charAt(i))) {
        		map.put(ransomNote.charAt(i), map.get(ransomNote.charAt(i))-1);
        		if(map.get(ransomNote.charAt(i))==0) {
        			map.remove(ransomNote.charAt(i));
        		}
        	}else {
        		return false;
        	}
        }
    //    System.out.println(map);
    	return true;
    }
    
    public static boolean canConstruct2(String ransomNote,String magazine) {
    	int record[]=new int[26];
    	for(char c:magazine.toCharArray()) {
    		record[c-'a']++;
    	}
    	for(char c:ransomNote.toCharArray()) {
    		record[c-'a']--;
    		if(record[c-'a']<0) {
    			return false;
    		}
    	}
    	return true;
    }

}
