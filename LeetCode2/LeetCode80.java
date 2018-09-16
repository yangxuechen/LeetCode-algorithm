package LeetCode2;

public class LeetCode80 {
    public static void main(String[] args) {

        int a[]={1,1,1,2,2,2,3,4,5,5,5,5,5,5,5,5,6,6,6};
//        moveArrays(a,2,2);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("*******************");
        int n=removeDuplicates(a);
                for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        int count=0;
        int head=0,tail=0;
        while(tail<nums.length-1-count){
            if(nums[tail]==nums[tail+1]){
                tail++;
            }else{
                if(tail-head>=2){
                    moveArrays(nums,tail+1,tail-head-1);
                    count+=tail-head-1;
                    tail-=(tail-head-1);//移动后位置改变
                }
                head=tail+1;
                tail++;
            }
        }
   //     System.out.println(tail+" "+head);
        if(tail-head>=2){
            moveArrays(nums,tail+1,tail-head-1);
            count+=(tail-head-1);
        }
        return nums.length-count;
    }

    /**
     * 将数组从index索引处向前移动k个单位
     * @param nums
     * @param index
     * @param k
     */
    public static void moveArrays(int[] nums,int index,int k){
        for(int i=index;i<nums.length;i++){
            nums[i-k]=nums[i];
        }
    }

}
