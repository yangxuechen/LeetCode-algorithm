package LeetCode2;

import java.util.*;

public class LeetCode38 {
    public static void main(String[] args) {
      String s= countAndSay(4);
        System.out.println(s);
    }
    public static String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String s="1";
        for(int i=0;i<n-1;i++){
            s=splitString(s);
       //     System.out.println(s);
        }
        return s;
    }
    /**
     * 将s字符串分割成相同字符串的数组后重组成新的字符串
     * @param s
     * @return
     */
    public static String splitString(String s){
       String res=new String();
        char ch[]=s.toCharArray();
        char c=ch[0];
        int count=1;
        for(int i=0;i<ch.length-1;i++){
            if(ch[i]==ch[i+1]){
                count++;
            }else{
                String tmp="";
                tmp+=count;
                tmp+=c;
               res+=tmp;
                count=1;
                c=ch[i+1];
            }
        }
        String tmp="";
        tmp+=count;
        tmp+=c;
       res+=tmp;
     //   System.out.println(res);
        return res;
    }
}
