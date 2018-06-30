package leetCode2;

import java.util.Arrays;
import java.util.HashMap;

public class LeetCode500 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str[]= { "Hello", "Alaska", "Dad", "Peace"};
      String s[]=findWords(str);
      for(String st:s) {
    	  System.out.print(st+" ");
      }
	}
	public static String[] findWords(String[] words) {
	    char ch1[]= {'q','w','e','r','t','y','u','i','o','p','Q','W','E','R','T','Y','U','I','O','P'};
	    char ch2[]= {'a','s','d','f','g','h','j','k','l','A','S','D','F','G','H','J','K','L'};
	    char ch3[]= {'z','x','c','v','b','n','m','Z','X','C','V','B','N','M'};
	    String s1="qwertyuiopQWERTYUIOP";
	    String s2="asdfghjklASDFGHJKL";
	    String s3="zxcvbnmZXCVBNM";
	    
	    //为每一行的字符分别构建哈希表
	    HashMap<Character,Integer> map1=new HashMap<Character,Integer>();
	    HashMap<Character,Integer> map2=new HashMap<Character,Integer>();
	    HashMap<Character,Integer> map3=new HashMap<Character,Integer>();
	    for(char c:s1.toCharArray()) {
	    	map1.put(c, 1);
	    }
	    for(char c:s2.toCharArray()) {
	    	map2.put(c, 1);
	    }
	    for(char c:s3.toCharArray()) {
	    	map3.put(c, 1);
	    }
	    int i=0;
	    for(String s:words) {
	    	if(isTrue(s,map1)||isTrue(s,map2)||isTrue(s,map3)) {
	    		words[i]=s;
	    		i++;
	    	}
	    }
		return Arrays.copyOfRange(words, 0, i);
		
	}
	
	//判断给定字符串是否由map表中的字符构成
	public static boolean isTrue(String s,HashMap<Character,Integer> map) {
		for(char c:s.toCharArray()) {
			if(!map.containsKey(c)) {
				return false;
			}
		}
		return true;
	}
}
