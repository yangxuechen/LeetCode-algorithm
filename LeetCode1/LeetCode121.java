package leetCode;

/**
 * ����һ�����飬���ĵ� i ��Ԫ����һ֧������Ʊ�� i ��ļ۸�

��������ֻ�������һ�ʽ��ף������������һ֧��Ʊ�������һ���㷨�����������ܻ�ȡ���������

ע���㲻���������Ʊǰ������Ʊ��
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
