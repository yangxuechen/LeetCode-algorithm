package leetCode2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode811 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]= {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
		List<String> list=subdomainVisits(s);
		for(Object s1:list) {
			System.out.println(s1);
		}
	}
	 public static List<String> subdomainVisits(String[] cpdomains) {
	        Map<String,Integer> map=new HashMap<String,Integer>();  //存储字符串及出现次数
	        for(String s:cpdomains) {
	        	String str[]=s.split(" ");  //将s字符串以空格分成两个字符串  str[0](访问次数) str[1](域名)
	        	int n=Integer.parseInt(str[0]);
	        	List<String> list=getNewStrings(str[1]);  //得到各级域名
	        	for(String s1:list) {    //将各级域名及次数保存
	        		if(map.containsKey(s1)) {
	        			map.put(s1, map.get(s1)+n);
	        		}else {
	        			map.put(s1, n);
	        		}
	        	}
	        }
	        List<String> l=new ArrayList<String>();
	        for(String s:map.keySet()) {  //将map中存储的域名信息转化为字符串形式保存在List
	        	String tempS=map.get(s)+" "+s;
	        	l.add(tempS);
	        }
	        return l;
	    }
	/**
	 * 返回域名中的每一级域名
	 * @param s  "top.yangxuechen.www"
	 * @return   "top.yangxuechen.www" "yangxuechen.www" "www"
	 */
	public static List<String> getNewStrings(String s) {
		String str="";
		List<String> list=new ArrayList<String>();
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)=='.') {
				list.add(str);
			}
		    str=s.charAt(i)+str;
		}
		list.add(s);
		
		return list;
	}
}
