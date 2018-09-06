package LeetCode2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LeetCode49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String[] strs= {"asd","dsa","sda","fgf","jhg"};
         
         List<List<String>> res=groupAnagrams(strs);
         for(List<String> l:res) {
        	 System.out.println(l);
         }
	}
    public static List<List<String>> groupAnagrams(String[] strs) {
	   if(strs.length==0||strs==null) {
		   return new ArrayList();
	   }
	    Map<String,List> map=new HashMap<String,List>();
	    for(String s:strs) {
       	 char[] c=s.toCharArray();
       	 Arrays.sort(c);
       	 String key=String.valueOf(c);
       	 if(!map.containsKey(key)) {
       		 map.put(key, new ArrayList());
       	 }
       	 map.get(key).add(s);
        }
    	return new ArrayList(map.values());
	}
}
