package leetCode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode290 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str1="aaabb";
      String str2="ni ni ni hao hao";
      boolean b=wordPattern(null,str2);
      if(b) {
    	  System.out.println("true");
      }else {
    	  System.out.println("false");
      }
	}
    public static boolean wordPattern(String pattern, String str) {
    	if(pattern==null||str==null) {
    		return false;
    	}
        String[] words=str.split(" ");
        if(words.length!=pattern.length()) {
        	return false;
        }
        Map<Character,String> map=new HashMap<Character,String>();
        for(int i=0;i<pattern.length();i++) {
        	if(map.containsKey(pattern.charAt(i))) {
        		if(!map.get(pattern.charAt(i)).equals(words[i])) {
        			return false;
        		}
        	}else {
        		if(map.containsValue(words[i])) {
        			return false;
        		}
        		map.put(pattern.charAt(i), words[i]);
        	}
        }
    	return true;
    }
}
