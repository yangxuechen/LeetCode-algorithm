package leetCode;

/**
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。

如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。

注意你不能在买入股票前卖出股票。
 * @author yangxuechen
 *
 */
public class LeetCode121 {

	public static void main(String[] args) {
		int[] a= {1,2,8,0,9,110};
		int max=maxProfit(a);
		System.out.println(max);
	}
	public static int maxProfit(int[] prices) {
		  if(prices==null||prices.length<1){
	            return 0;
	        }
		int min=prices[0];
		int profit=0;
		for(int i=1;i<prices.length;i++) {
			if(min>prices[i]) {
				min=prices[i];
			}
			if(prices[i]-min>profit) {
				profit=prices[i]-min;
			}
		}
		return profit;
	}

}
