package leetCode2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LeetCode819 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="Bob hit a ball, the hit BALL flew far after it was hit.";
       String b[]= {"hit"};
       String str=mostCommonWord(s,b);
       
       System.out.println(str);
	}
    public static String mostCommonWord(String paragraph, String[] banned) {
    	Set<String> set=new HashSet<String>();  //将banned字符串数组中的字符串保存在set集合
    	for(String s:banned) {
    		set.add(s);
    	}
    	char c[]=paragraph.toCharArray();
    	char tempC[]=new char[c.length];
    	int j=0;
    	for(int i=0;i<c.length;i++) {
    		if(c[i]==','||c[i]=='.'||c[i]=='?'||c[i]=='!'||c[i]==';'||c[i]=='\'') {
    			continue;
    		}else {
    			tempC[j]=c[i];
    			j++;
    		}
    	}
    	HashMap<String,Integer> map=new HashMap<String,Integer>();
    	String newStr=new String(tempC,0,j); //获得去除标点符号的字符串
        String s[]=newStr.toLowerCase().trim().split(" ");
        for(String str:s) {
        	if(!set.contains(str)) {
        		if(map.containsKey(str)) {
        			map.put(str, map.get(str)+1);
        		}else {
        			map.put(str, 1);
        		}
        	}
        //	System.out.println(str);
        }
        
        String result=null;
        int max=0;
        for(String str:map.keySet()) {
        //	System.out.println(str+" "+map.get(str));
        	if(map.get(str)>max) {
        		result=str;
        		max=map.get(str);
        	}
        }
    	return result;
    }
}
