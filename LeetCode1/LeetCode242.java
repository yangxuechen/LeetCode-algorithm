package leetCode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode242 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     boolean b=isAnagram2("qwertyuiop","poiuytrewq");
	    if(b) {
	    	System.out.println("true");
	    }else {
	    	System.out.println("false");
	    }
	}
	
	/**
	 * function 1
	 * @param s
	 * @param t
	 * @return
	 */
	public static  boolean isAnagram(String s, String t) {
		if(s==null||t==null) {
			return false;
		}
	     Map<Character,Integer> map1=charAddToMap(s);
	     Map<Character,Integer> map2=charAddToMap(t);
	    boolean b= map1.equals(map2);
	    if(b)
		return true;
	    return false;
	}
	public static Map<Character,Integer> charAddToMap(String s) {
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			if(map.get(s.charAt(i))!=null) {
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}else {
				map.put(s.charAt(i), 1);
			}
		}
		return map;
	}
	
	/**
	 * ¸Ä½øµÄfunction
	 * @param s
	 * @param t
	 * @return
	 */
	public static boolean isAnagram2(String s,String t) {
		if(s==null&&t==null) {
			return true;
		}
		if((s==null&&t!=null)||(s!=null&&t==null)) {
			return false;
		}
		if(s.length()!=t.length()) {
			return false;
		}
		int arr[]=new int[256];
		
		char sCharArr[]=s.toCharArray();
		char tCharArr[]=t.toCharArray();
		for(char sc:sCharArr) {
			arr[sc]+=1;
		}
		for(char ct:tCharArr){
			arr[ct]-=1;
		}
		
		for(int i=0;i<256;i++) {
			if(arr[i]!=0) {
				return false;
			}
		}
		return true;
	}
}
