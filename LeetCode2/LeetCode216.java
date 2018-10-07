package LeetCode2;

import java.util.LinkedList;
import java.util.List;

public class LeetCode216 {
    public static void main(String[] args) {

        List<List<Integer>> res=combinationSum3(3,9);
        for(List<Integer> l:res){
            System.out.println(l);
        }
    }
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res=new LinkedList<List<Integer>>();
        List<Integer> tmp=new LinkedList<Integer>();
        boolean[] used=new boolean[9];
        int nums[]={1,2,3,4,5,6,7,8,9};
        combination(res,tmp,used,nums,k,n,0,0);
        return res;
    }

    /**
     *
     * @param res  结果集
     * @param tmp  临时存储遍历到的数
     * @param used 用来判断该数是否已经使用
     * @param nums 0~9
     * @param k     个数
     * @param n     目标值和
     * @param sum   tmp链表中的数的和
     * @param index 索引位置
     */
    public static void combination(List<List<Integer>> res, List<Integer> tmp,boolean[] used,int[] nums,int k,int n,int sum,int index){
        if(tmp.size()==k){
            if(sum==n){
                res.add(new LinkedList<Integer>(tmp));
            }
            return ;
        }
        for(int i=index;i<nums.length;i++){
            if(used[i]==false){
                tmp.add(nums[i]);
                sum+=nums[i];
                used[i]=true;
            }
            combination(res,tmp,used,nums,k,n,sum,i+1);
                used[tmp.get(tmp.size()-1)-1]=false;
                sum-=tmp.get(tmp.size()-1);
                tmp.remove(tmp.size()-1);
        }
    }
}
