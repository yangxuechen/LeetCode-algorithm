package leetCode2;

public class LeetCode762 {

	public static void main(String[] args) {
//		System.out.println(11>>0);
//		System.out.println(toBit(11));
//		System.out.println(11>>0&1);
//		
//		System.out.println("**************");
//		
//		System.out.println(11>>1);
//		System.out.println(toBit(11>>1));
//		System.out.println(11>>1&1);
//		
//		System.out.println("**************");
//		
//		System.out.println(11>>2);
//		System.out.println(toBit(11>>2));
//		System.out.println(11>>2&1);
//		
//		System.out.println("**************");
//		
//		System.out.println(11>>3);
//		System.out.println(toBit(11>>3));
//		System.out.println(11>>3&1);
		int n=countPrimeSetBits(244,269);
		System.out.println(n);
	}
	
    public static int countPrimeSetBits(int L, int R) {
        //1.找出0~32中的质数
    	boolean flag[]=new boolean[33];
    	for(int i=0;i<32;i++) {
    		flag[i]=true;
    	}
    	for(int i=2;i<33;i++) {
    		if(flag[i]) {
    			for(int j=i+i;j<33;j+=i) {
    				flag[j]=false;
    			}
    		}
    	}
    	
    	int sum_count=0;//置位位数为质数的整数个数
    	for(;L<=R;L++) {
    		int one_count=0;//L的二进制数中1的个数
    		for(int i=0;i<32;i++) {
    			if((L>>i&1)==1) {
    				one_count++;
    			}
    		}
    		if(flag[one_count]&&one_count!=1) {
    			sum_count++;
    		}
    	}
    	return sum_count;
    }
	
	public static String toBit(int n) {
		String s="";
		while(n>0) {
			int temp=n%2;
			s=temp+s;
			n/=2;
		}
		return s;
	}

}
