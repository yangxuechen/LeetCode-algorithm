package leetCode2;

public class LeetCode643 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] a= {1,12,-5,-6,50,3};
       double ave=findMaxAverage(a,1);
       System.out.println("ave:"+ave);
	}
	
	 public static double findMaxAverage(int[] nums, int k) {
		 double ave=0;      //�����������ƽ��ֵ
		 double lastAve=0;    //����������һ�ε�ƽ��ֵ
		 int startIndex=0;  //��ʼ����
		 int endIndex=0;  //��������
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
//	 * �ҵ����������������ƽ����
//	 * @param nums
//	 * @param k  ����Ϊk������������
//	 * @return
//	 */
//    public static double findMaxAverage(int[] nums, int k) {
//        double ave=Integer.MIN_VALUE;//ave��ֵ��Сintֵ
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
//     * �ҵ�������һ����������ƽ��ֵ
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
