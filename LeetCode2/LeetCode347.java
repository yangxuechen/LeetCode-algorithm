package LeetCode2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LeetCode347 {
    public static void main(String[] args) {

        int a[]={1};
        List<Integer> res=topKFrequent(a,1);
        System.out.println(res);
    }
    public static List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> res=new LinkedList<Integer>();
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }

        for(int i=0;i<k;i++){
            int key=0;
            int max=Integer.MIN_VALUE;
            for(int j:map.keySet()){
                if(map.get(j)>max){
                    max=map.get(j);
                    key=j;
                }
            }
            map.remove(key);
            res.add(key);
        }
        return res;
    }
}
