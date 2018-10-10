package LeetCode2;

import java.util.LinkedList;
import java.util.List;

public class LeetCode228 {
    public static void main(String[] args) {
        int a[]={0,1,3,4,6,8,9,10,12};
        List<String> res=summaryRanges(a);
        System.out.println(res);
    }
    public static List<String> summaryRanges(int[] nums) {
        List<String> res=new LinkedList<String>();
        if(null==nums||nums.length==0){
            return res;
        }
        int startIndex=0;
        int endIndex=0;
        for(startIndex=0,endIndex=0;endIndex<nums.length-1;){
            if(nums[endIndex]==nums[endIndex+1]-1){
                endIndex++;
            }else{
                String tmp="";
                if(startIndex==endIndex){
                    tmp+=nums[startIndex];

                }else{
                    tmp+=nums[startIndex]+"->"+nums[endIndex];
                }
                res.add(tmp);
                startIndex=endIndex+1;
                endIndex++;
            }
        }
        String tmp="";
        if(startIndex==endIndex){
            tmp+=nums[startIndex];
        }else{
            tmp+=nums[startIndex]+"->"+nums[endIndex];
        }
        res.add(tmp);
        return res;
    }
}
