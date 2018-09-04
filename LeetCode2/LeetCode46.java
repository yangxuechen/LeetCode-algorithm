package LeetCode2;

import java.util.LinkedList;
import java.util.List;

public class LeetCode46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,2};
        List<List<Integer>> res=permute(a);
        for(List<Integer> l:res) {
        	System.out.println(l);
        }
	}
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new LinkedList<List<Integer>>();
        List<Integer> tmp=new LinkedList<Integer>();
        
        boolean used[]=new boolean[nums.length];
        dfs(res,tmp,used,nums);
        return res;
    }
   public static void dfs(List<List<Integer>> res,List<Integer> tmp,boolean[] used,int[] nums) {
	   if(tmp.size()==nums.length) {
		   res.add(new LinkedList(tmp));
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
