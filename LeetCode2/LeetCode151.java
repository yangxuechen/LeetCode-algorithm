package LeetCode2;

import java.util.LinkedList;
import java.util.List;

public class LeetCode151 {
    public static void main(String[] args) {
        String str="hello   hao   are  you";

//        String s[]=spiltString(str);
//        for(String s1:s){
//            System.out.print(s1+" ");
//        }
        String s=reverseWords("");
        System.out.println(s);
    }
    public static String reverseWords(String s) {
        String res="";
        String str[]=spiltString(s);
        for(int i=str.length-1;i>0;i--){
            res+=str[i]+" ";
        }
        res+=str[0];
        return res;
    }
    /**
     * 将字符串拆分成字符串数组
     * @param str
     * @return
     */
    public static String[] spiltString(String str){
        List<String> list=new LinkedList<String>();
        str=str.trim();//去掉首尾空格
        char s[]=str.toCharArray();
        String tmpStr="";
        for(int i=0;i<s.length;i++){
            if(s[i]!=' '){
                tmpStr+=s[i];
            }else{
                list.add(tmpStr);
                tmpStr="";//重新赋空串值
                while (s[i]==' '){
                    i++;//直到s[i]不等于空格
                    if(i>=s.length){
                        break;
                    }
                }
                i--;//
            }
        }
        list.add(tmpStr);
        return list.toArray(new String[list.size()]);
    }

}
