package LeetCode2;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LeetCode47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {1,1,2};
        List<List<Integer>> res=permuteUnique(a);
        for(List<Integer> l:res) {
        	System.out.println(l);
        }
	}
	
    public static List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> res=new HashSet<List<Integer>>();
        List<Integer> tmp=new LinkedList<Integer>();
        boolean[] used=new boolean[nums.length];
        dfs(res,tmp,used,nums);
        
        List<List<Integer>> result=new LinkedList<List<Integer>>(res);
        return result;
    }
    
    public static void dfs(Set<List<Integer>> res,List<Integer> tmp,boolean[] used,int[] nums) {
    	if(tmp.size()==nums.length) {
    		res.add(new LinkedList<Integer>(tmp));
    		return ;
    	}
    	for(int i=0;i<nums.length;i++) {
    		if(used[i]!=true) {
    			tmp.add(nums[i]);
    			used[i]=true;
    			dfs(res,tmp,used,nums);
    			tmp.remove(tmp.size()-1);
    			used[i]=false;
    		}
    	}
    }
}
