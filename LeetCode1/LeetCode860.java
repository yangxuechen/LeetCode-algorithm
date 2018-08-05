package leetCode2;

public class LeetCode860 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,5,10,20};
        boolean b=lemonadeChange(a);
        if(b) {
        	System.out.println("true");
        }else {
        	System.out.println("false");
        }
	}
	public static boolean lemonadeChange(int[] bills) {
	    int countFive=0;//5元数量
	    int countTen=0;//10元数量
	    for(int i=0;i<bills.length;i++) {
	    	if(bills[i]==5) {
	    		countFive++;
	    	}else if(bills[i]==10) {
	    		countTen++;
	    		countFive--;
	    	}else if(bills[i]==20) {
	    		if(countTen>0) {
	    			countTen--;
	    			countFive--;
	    		}else {
	    			countFive-=3;
	    		}
	    	}
	    	if(countFive<0||countTen<0) {
	    		return false;
	    	}
	    }
		return true;
	}

}
