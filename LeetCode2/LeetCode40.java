package LeetCode2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LeetCode40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {10,1,2,7,6,1,5};
        List<List<Integer>> list=combinationSum2(a,8);
        
        System.out.println(list);
	}
	
	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
		Set<List<Integer>> res=new HashSet<List<Integer>>();
		List<Integer> temp=new LinkedList<Integer>();
		
		Arrays.sort(candidates);
		solve(res,0,0,temp,candidates,target);
		
		List<List<Integer>> result=new LinkedList<List<Integer>>(res);
		//System.out.println(res);
		return result;
	}
	
	private static void solve(Set<List<Integer>> res,int currentIndex,int count,List<Integer> tmp,int[] candidates,int target) {
		 if(count>=target) {
	            if(count==target)
	                res.add(new LinkedList<>(tmp));
	            return;
	        }
		 for(int i=currentIndex;i<candidates.length;i++) {
			 if(count+candidates[i]>target) {
				 break;
			 }
			 tmp.add(candidates[i]);
			 solve(res,i+1,count+candidates[i],tmp,candidates,target);
			 tmp.remove(tmp.size()-1);
		 }
		 
	}

}
