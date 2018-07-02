package leetCode2;

public class LeetCode643 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] a= {1,12,-5,-6,50,3};
       double ave=findMaxAverage(a,1);
       System.out.println("ave:"+ave);
	}
	
	 public static double findMaxAverage(int[] nums, int k) {
		 double ave=0;      //用来保存最大平均值
		 double lastAve=0;    //用来保存上一次的平均值
		 int startIndex=0;  //起始索引
		 int endIndex=0;  //结束索引
		 for(startIndex=0;startIndex<k;startIndex++) {
			 lastAve+=nums[startIndex];
		 }
		 ave=lastAve;
		 System.out.println("firstSum:"+lastAve);
		 for(startIndex=0,endIndex=k;endIndex<nums.length;startIndex++,endIndex++) {
			 double tempAve=lastAve+nums[endIndex]-nums[startIndex];
			 lastAve=tempAve;
			 System.out.println("tempAve:"+tempAve);
			 if(tempAve>ave) {
				 ave=tempAve;
			 }
		 }
		 
		 return ave/k;
	 }
//	/**
//	 * 找到数组中子数组最大平均数
//	 * @param nums
//	 * @param k  长度为k的连续子数组
//	 * @return
//	 */
//    public static double findMaxAverage(int[] nums, int k) {
//        double ave=Integer.MIN_VALUE;//ave赋值最小int值
//        int len=nums.length;
//        for(int i=0;i<=len-k;i++) {
//        	double tempAve=findAverage(nums,i,i+k-1);
//        	if(tempAve>ave) {
//        		ave=tempAve;
//        	}
//        }
//    	return ave;
//    }
//    
//    /**
//     * 找到数组中一段连续数的平均值
//     * @param nums
//     * @param startIndex
//     * @param endIndex
//     * @return
//     */
//    public static double findAverage(int[] nums,int startIndex,int endIndex) {
//    	double ave=0;
//    	for(int i=startIndex;i<=endIndex;i++) {
//    		ave+=nums[i];
//    	}
//    	System.out.println("sum:"+ave);
//    	ave=ave/(endIndex-startIndex+1);
//    	System.out.println(ave);
//    	return ave;
//    }

}
