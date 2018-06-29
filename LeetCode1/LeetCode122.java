package leetCode;

public class LeetCode122 {

	public static void main(String[] args) {
		int a[]= {1,3,3,4,100};
		int max=maxProfit(a);
		System.out.println(max);

	}
	 public static  int maxProfit(int[] prices) {
		 if(prices==null||prices.length<1) {
			 return 0;
		 }
	        int profit=0;
	        int max=0;
	        for(int i=0;i<prices.length-1;i++) {
	        	profit=prices[i+1]-prices[i];
	        	if(profit>0) {
	        		max+=profit;
	        	}
	        }
	        return max;
	    }
}
