package leetCode2;

import java.util.ArrayList;
import java.util.List;

public class LeetCode728 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
//		boolean b=isTrue(129);
//		if(b) {
//			System.out.println("true");
//		}else {
//			System.out.println("false");
//		}
		
		List<Integer> list=selfDividingNumbers(1,22);
		System.out.println(list);
	}
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<Integer>();
        for(int i=left;i<=right;i++) {
        	if(isTrue(i)) {
        		list.add(i);
        	}
        }
    	return list;
    }
    
    //判断一个数是否是自除数
    public static boolean isTrue(int n) {
        int m=n;
    	while(n>0) {
    		int temp=n%10;
    		n/=10;
    		if(temp==0) {
    			return false;
    		}
    		if(m%temp!=0) {
    			return false;
    		}
    	}
    	return true;
    }
}
