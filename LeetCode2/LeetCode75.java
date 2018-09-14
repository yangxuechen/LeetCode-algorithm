package LeetCode2;

public class LeetCode75 {
    public static void main(String[] args) {

        int a[]={2,1,2,0,0,1};
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("**************");
        countSort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void bubbleSort(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                }
            }
        }
    }

    public static void countSort(int[] nums){
        int countZero=0;
        int countOne=0;
        int countTwo=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                countZero++;
            }else if(nums[i]==1){
                countOne++;
            }else if(nums[i]==2){
                countTwo++;
            }
        }
        //  System.out.println(countZero+" "+countOne+" "+countTwo);
        int i=0;
        for(i=0;i<countZero;i++){
            nums[i]=0;
        }
        for(i=countZero;i<countOne+countZero;i++){
            nums[i]=1;
        }
        for(i=countOne+countZero;i<nums.length;i++){
            nums[i]=2;
        }
    }
}
