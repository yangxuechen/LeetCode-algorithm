package leetCode;

/**
 * 阶乘后的0的个数
 * @author yangxuechen
 *
 */
public class LeetCode172 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n=trailingZeroes(5);
      System.out.println(n);
	}
    public static int trailingZeroes(int n) {
        int num=0;
        while(n>0) {
        	num+=n/5;
        	n/=5;
        }
        return num;
    }
}
