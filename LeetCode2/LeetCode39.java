package LeetCode2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LeetCode39 {

	public static void main(String[] args) {
		int a[]= {2,3,6,7};
		List<List<Integer>> list=combinationSum(a,7);
        System.out.println(list);
	}
	public static List<List<Integer>> combinationSum(int[] candidates, int target) {  
		List<List<Integer>> res = new LinkedList<List<Integer>>();  //保存结果集
		List<Integer> tmp = new LinkedList<>();  //保存符合条件的数
		Arrays.sort(candidates);  //将数组升序排序
		
		solve(res,0,0,tmp,candidates,target);
		return res;
	}
	
	private static void solve(List<List<Integer>> res,int currentIndex,int count,List<Integer> tmp,int[] candidates,int target) {
		 if(count>=target) {
	            if(count==target)
	                res.add(new LinkedList<>(tmp));
	            return;
	        }
		 
		 for(int i = currentIndex;i<candidates.length;i++){
	            if(count+candidates[i]>target){
	                break;
	            }
	            tmp.add(candidates[i]);
	            solve(res,i,count+candidates[i],tmp,candidates,target);
	            tmp.remove(tmp.size()-1);
	        }
	}

}
