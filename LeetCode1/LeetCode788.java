package leetCode2;

import java.util.HashSet;
import java.util.Set;

public class LeetCode788 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
//		boolean b=isRotatedDigits(101);
//		if(b) {
//			System.out.println("true");
//		}else {
//			System.out.println("false");
//		}
		int n=rotatedDigits(10);
		System.out.println(n);
	}
	public static int rotatedDigits(int N) {
	    int count=0;
	    for(int i=1;i<=N;i++) {
	    	int flag=0;
	    	int temp=i;
	    	while(temp>0) {
	    		int a=temp%10;
	    		if(a==3||a==7||a==4) {
	    			flag=0;
	    			break;
	    		}
	    		if(a==2||a==5||a==6||a==9) {
	    			flag=1;
	    		}
	    		temp/=10;
	    	}
	    	if(flag==1) {
	    		count++;
	    	}
	    }
    	return count;
	}
	
	//funcation 1
	/*  
    public static int rotatedDigits(int N) {
	    int count=0;
	    for(int i=1;i<=N;i++) {
	    	boolean b=isRotatedDigits(i);
	    	if(b) {
	    		System.out.println(i);
	    		count++;
	    	}
	    }
    	return count;
	}
    
    public static boolean isRotatedDigits(int N) {
    	 Set<Integer> set=new HashSet<Integer>();
 	    while(N>0) {
 	    	int temp=N%10;
 	    	set.add(temp);
 	    	N/=10;
 	    }
 	    if(set.contains(3)||set.contains(4)||set.contains(7)) {
 	    	return false;
 	    }else if(set.size()==1&&set.contains(0)) {
 	    	return false;
 	    }else if(set.size()==1&&set.contains(1)) {
 	    	return false;
 	    }else if(set.size()==2&&set.contains(0)&&set.contains(1)) {
 	    	return false;
 	    }else if(set.size()==1&&set.contains(8)) {
 	    	return false;
 	    }else if(set.size()==2&&set.contains(0)&&set.contains(8)) {
 	    	return false;
 	    }else if(set.size()==2&&set.contains(1)&&set.contains(8)) {
 	    	return false;
 	    }else if(set.size()==3&&set.contains(1)&&set.contains(8)&&set.contains(0)) {
 	    	return false;
 	    }
 	    return true;
    }
    
    */
}
