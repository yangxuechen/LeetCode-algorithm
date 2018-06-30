package leetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode258 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int result=addDigits2(38);
		System.out.println(result);
	}
	
	/**
	 * function 1
	 * @param num
	 * @return
	 */
    public static int addDigits(int num) {
    	
        while(num>10) {
        	num=reInt(num);
        }
    	return num;
    }
    public static int reInt(int num) {
    	int sum=0;
    	List<Integer> list=new ArrayList<Integer>();
    	while(num>0) {
    		list.add(num%10);
    		num/=10;
    	}
    	for(Integer i:list) {
    		sum+=i;
    	}
    	return sum;
    }
    
    public static int addDigits2(int num) {
    	while(num>=10) {
    		num=(num/10)+(num%10);
    	}
    	return num;
    }
    
}
