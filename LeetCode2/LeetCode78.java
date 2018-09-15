package LeetCode2;

import java.util.LinkedList;
import java.util.List;

public class LeetCode78 {
    public static void main(String[] args) {
        int a[]={1,2,3,4};
     List<List<Integer>> res=subsets(a);
     for(List<Integer> l:res){
         System.out.println(l);
     }
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new LinkedList<List<Integer>>();
        boolean used[]=new boolean[nums.length];
        List<Integer> tmp=new LinkedList<Integer>();
        dfs(res,tmp,used,nums,0);
        res.add(new LinkedList<>());
        return res;
    }

    public static void dfs(List<List<Integer>> res,List<Integer> tmp,boolean[] used,int[] nums,int index){
        if (index==nums.length){
            return;
        }
        for(int i=index;i<nums.length;i++){
            if(used[i]!=true){
                tmp.add(nums[i]);
                used[i]=true;
                res.add(new LinkedList<>(tmp));
                dfs(res,tmp,used,nums,i+1);
                used[i]=false;
                tmp.remove(tmp.size()-1);
            }
        }
    }
}
