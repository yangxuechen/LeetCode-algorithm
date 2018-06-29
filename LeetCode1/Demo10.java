package leetCode;

/**
 * 给定一个非负整数组成的非空数组，在该数的基础上加一，返回一个新的数组。

最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。

你可以假设除了整数 0 之外，这个整数不会以零开头。
 * @author yangxuechen
 *
 */
public class Demo10 {

	public static void main(String[] args) {
		int b[]= {9};
		System.out.println(b.length+":length b");
      int a[]=plusOne(b);
        System.out.println(a.length+":length a");
      System.out.print("sum:");
      for(int i=0;i<a.length;i++) {
    	  System.out.print(a[i]);
      }
	}
    public static int[] plusOne(int[] dights) {
    	if(dights==null||dights.length==0) {
    		return null;
    	}
    	 int i;
    	 int len=dights.length;
    	 dights[len-1]+=1;
    	 for(i=len-1;i>0;i--) {
    		 if(dights[i]>=10) {
    			 dights[i]%=10;
    			 dights[i-1]+=1;
    		 }else {
    			 break;
    		 }
    	 }
    	 if(dights[0]==10) {
    		 int[] a=new int[len+1];
    		 a[0]=1;
    		 dights[0]=0;
    		 for(i=0;i<len;i++) {
    			 a[i+1]=dights[i];
    		 }
    		 return a;
    	 }
    	return dights;
    }
   
}
