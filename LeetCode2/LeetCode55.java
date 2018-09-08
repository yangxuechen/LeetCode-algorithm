package LeetCode2;

public class LeetCode55 {
    public static void main(String[] args){
       int a[]={2,3,1,1,4};
       boolean b=canJump(a);
       if(b){
           System.out.println("true");
       }
    }

    public static boolean canJump(int[] nums) {
        int reach=0;
        int i=0;
        while(i<nums.length && i<=reach){
            reach=Math.max(reach,i+nums[i]);
            i++;
        }
        return reach>=nums.length-1;
    }
}
