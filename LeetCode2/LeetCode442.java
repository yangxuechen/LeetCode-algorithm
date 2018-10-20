package LeetCode2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCode442 {
    public static void main(String[] args) {

        int a[]={4,3,2,7,8,2,3,1};
        List<Integer> res=findDuplicates2(a);
        System.out.println(res);
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> res=new LinkedList<Integer>();
        int a[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            a[nums[i]-1]++;
        }
        for(int i=0;i<nums.length;i++){
            if(a[i]>1){
                res.add(i+1);
            }
         //   System.out.print(a[i]+" ");
        }
        return res;
    }

    public static List<Integer> findDuplicates2(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            while(nums[i] != i + 1) {
                if(nums[nums[i] - 1] == nums[i]) {
                    break;
                }
                int tmp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = tmp;
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if(nums[i] != i + 1) {
                list.add(nums[i]);
            }
        }
        return list;
    }
}
