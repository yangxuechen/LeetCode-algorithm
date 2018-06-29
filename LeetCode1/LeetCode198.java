package leetCode;

public class LeetCode198 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] a= {1,2,3,4,9,9,10,2,8,87,5,99,1};
    int max1=rob(a);
    System.out.println(max1);
    int max2=rob2(a);
    System.out.println(max2);
	}
    public static int rob(int[] nums) {
        int max1=0,max2=0;
        for(int i=0;i<nums.length;i++) {
        	if(i%2==0) {
        		max1+=nums[i];
        	}else {
        		max2+=nums[i];
        	}
        }
        if(max1>max2) {
        	return max1;
        }
    	return max2;
    }
    
    //true
    public static int rob2(int[] nums) {
    	int f1=0,f2=0;
    	for(int i=0;i<nums.length;i++) {
    		int temp=f2;
    		f2=f1+nums[i];
    		f1=Math.max(f1, temp);
    	}
    	return Math.max(f1, f2);
    }
}
