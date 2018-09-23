package LeetCode2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LeetCode884 {
    public static void main(String[] args) {

        String A="abcd def abcd xyz";
        String B="ijk def ijk";
        String[] str=uncommonFromSentences(A,B);
        for(String s:str){
            System.out.print(s+" ");
        }
    }
    public static String[] uncommonFromSentences(String A, String B) {
        List<String> res=new LinkedList<String>();
        Map<String,Integer> mapA=new HashMap<String,Integer>();
        Map<String,Integer> mapB=new HashMap<String,Integer>();
        String[] strA=A.split(" ");
        String[] strB=B.split(" ");
        for(String s:strA){
            if(mapA.containsKey(s)){
                mapA.put(s,mapA.get(s)+1);
            }else{
                mapA.put(s,1);
            }
        }
        for(String s:strB){
            if(mapB.containsKey(s)){
                mapB.put(s,mapB.get(s)+1);
            }else{
                mapB.put(s,1);
            }
        }
        for(String s:strA){
            if(!mapB.containsKey(s)&&mapA.get(s)==1){
                res.add(s);
            }
        }
        for(String s:strB){
            if(!mapA.containsKey(s)&&mapB.get(s)==1){
                res.add(s);
            }
        }
    //    System.out.println(res);
        int n=res.size();
        String str[]=new String[n];
        for(int i=0;i<n;i++){
            str[i]=res.get(i);
        }
        return str;
    }
}
