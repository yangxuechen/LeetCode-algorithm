package leetCode;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class LeetCode387 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n=firstUniqChar("loveleetCode");
     System.out.println(n);
	}
	
	/**
	 * 找重复的第一个char字符
	 * @param s
	 * @return
	 */
    public static int firstNotUniqChar(String s) {
    	int[] record=new int[26];
    	for(int i=0;i<s.length();i++) {
    		if(record[s.charAt(i)-'a']>=1) {
    			return i;
    		}else {
    			record[s.charAt(i)-'a']++;
    		}
    	}
        return -1;
    }
    
    /**
     * 找不重复的第一个字符
     * @param s
     * @return
     */
    public static int firstUniqChar(String s) {
    	LinkedHashMap<Character,Integer> map=new LinkedHashMap<Character,Integer>();
    	for(char c:s.toCharArray()) {
    		if(map.containsKey(c)) {
    			map.put(c, map.get(c)+1);
    		}else {
    			map.put(c, 1);
    		}
    	}
    	System.out.println(map);
    	
    	//遍历map
    	Iterator entries=map.entrySet().iterator();
    	while(entries.hasNext()) {
    		Map.Entry entry=(Entry) entries.next();
    		Character character=(Character) entry.getKey();
    		Integer integer=(Integer) entry.getValue();
    	//	System.out.println(character+" "+integer);
    		if(integer==1) {
    			return s.indexOf(character);
    		}
    	}
    	return -1;
    }
}
