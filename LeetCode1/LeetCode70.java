package leetCode;

/**
 * 假设你正在爬楼梯。需要 n 步你才能到达楼顶。

每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
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
	//递归的方法解决
    public static int fun1(int n) {
    	if(n==1||n==2) {
    		return n;
    	}
    	return fun1(n-1)+fun1(n-2);
    }
    //动态规划思想解决
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
