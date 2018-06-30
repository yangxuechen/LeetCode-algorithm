package leetCode;

public class LeetCode371 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int sum=getSum(200000,5);
    System.out.println(sum);
	}
    public static int getSum(int a, int b) {
        if(b==0) {
        	return a;
        }
        int sum=a^b;
        int carry=(a&b)<<1;
        return getSum(sum,carry);
    }
}
