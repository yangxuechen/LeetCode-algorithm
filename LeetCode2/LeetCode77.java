package LeetCode2;


import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LeetCode77 {
    public static void main(String[] args) {

        List<List<Integer>> res=combine(4,2);
        for(List<Integer> list:res){
            System.out.println(list);
        }
    }
    public static List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> res=new LinkedList<List<Integer>>();
        List<Integer> tmp=new LinkedList<Integer>();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=i+1;
        }
        boolean used[]=new boolean[n];
        dfs(res,tmp,nums,used,k,0);
     //   List<List<Integer>> result=new LinkedList(res);
        return res;
    }
    public static void dfs(List<List<Integer>> res,List<Integer> tmp,int[] nums,boolean[] used,int k,int index){
        if(tmp.size()==k){
            res.add(new LinkedList<>(tmp));
            return ;
        }
        for(int i=index;i<nums.length;i++){
            if(used[i]!=true){
                tmp.add(nums[i]);
                used[i]=true;
                dfs(res,tmp,nums,used,k,i+1);
                used[i]=false;
                tmp.remove(tmp.size()-1);
            }
        }
    }
}
