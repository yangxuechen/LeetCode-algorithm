package leetCode;

/**
 * ������������¥�ݡ���Ҫ n ������ܵ���¥����

ÿ��������� 1 �� 2 ��̨�ס����ж����ֲ�ͬ�ķ�����������¥���أ�
 * @author yangxuechen
 *
 */
public class LeetCode70 {

	private static int[] dp;
	public static void main(String[] args) {
		dp=new int[40];
		for(int i=0;i<dp.length;i++) {
			dp[i]=0;
		}
     int n=fun2(40);
     System.out.println(n);
	}
	//�ݹ�ķ������
    public static int fun1(int n) {
    	if(n==1||n==2) {
    		return n;
    	}
    	return fun1(n-1)+fun1(n-2);
    }
    //��̬�滮˼����
    public static int fun2(int n) {
    	if(n==1||n==2) {
    		return n;
    	}
    	if(dp[n-1]==0) {
    		dp[n-1]=fun2(n-1);
    	}
    	if(dp[n-2]==0) {
    		dp[n-2]=fun2(n-2);
    	}
    	return dp[n-1]+dp[n-2];
    	
    }
}
