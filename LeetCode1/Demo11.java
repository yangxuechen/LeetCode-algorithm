package leetCode;

import java.util.Arrays;

/**
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。

输入为非空字符串且只包含数字 1 和 0。
 * @author yangxuechen
 *
 */
public class Demo11 {
    public static void main(String args[]) {
    	
//    	int a[]=stringFormatInteger("123456789");
//    	for(int i=0;i<a.length;i++) {
//    		System.out.println(a[i]);
//    	}
//    	
//    	String s=integerFormatString(a);
//    	System.out.println(s);
//    	reversalArray(a);
//    	for(int i=0;i<a.length;i++) {
//    		System.out.println(a[i]);
//    	}
//    	int a[]= {1,1,1,1};
//    	int b[]= {1,0,1,1};
//    	int c[]=addArrayAB(a,b);
//    	for(int i=0;i<c.length;i++) {
//    		System.out.print(c[i]);
//    	}
    	
    	
    	
    	String a="1010";
    	String b="1011";
    	String s=addBinary(null,null);
    	System.out.println(s);
//    	int a[]= {1,0,1,0};
//    	//reversalArray(a);
//    	int b[]=reversal(a);
//    	for(int i=0;i<b.length;i++) {
//    		System.out.println(b[i]);
//    	}
    }
    public static String addBinary(String a,String b) {
    	if(a==null||b==null) {
    		return "";
    	}
    	int a1[]=stringFormatInteger(a);
    	int b1[]=stringFormatInteger(b);//将字符串转换成数组
    	a1=reversal(a1);
    	b1=reversal(b1);
    	int c[]=addArrayAB(a1,b1);
    	c=reversal(c);
    	String s=integerFormatString(c);
    	return s;
    }
    //两个数组间的加法
    public static int[] addArrayAB(int[] a,int[] b) {
    	int lenA=a.length,lenB=b.length;
    	int shortLen,longLen;
    	int i,j;
    	int[] a1=a;
    	int[] b1=b;
    	if(lenA>lenB) {
    		shortLen=lenB;
    		longLen=lenA;
    		int c[]=new int[longLen+1];
    		for(i=0;i<longLen;i++) {
    			c[i]=a1[i];
    		}
    		c[i]=0;
    		for(i=0;i<shortLen;i++) {
        		c[i]+=b1[i];
        		if(c[i]>=2) {
        			c[i]%=2;
        			c[i+1]+=1;
        		}
        	}
    		for(j=i;j<longLen;j++) {
    			if(c[j]>=2) {
        			c[j]%=2;
        			c[j+1]+=1;
        		}
    		}
    		if(c[longLen]==0) {
    			int d[]=new int[longLen];
    			for(i=0;i<longLen;i++) {
    				d[i]=c[i];
    			}
    			return d;
    		}
    		return c;
    	}else if(lenA<lenB) {
    		shortLen=lenA;
    		longLen=lenB;
    		int c[]=new int[longLen+1];
    		for(i=0;i<longLen;i++) {
    			c[i]=b1[i];
    		}
    		c[i]=0;
    		for(i=0;i<shortLen;i++) {
        		c[i]+=a1[i];
        		if(c[i]>=2) {
        			c[i]%=2;
        			c[i+1]+=1;
        		}
        	}
    		for(j=i;j<longLen;j++) {
    			if(c[j]>=2) {
        			c[j]%=2;
        			c[j+1]+=1;
        		}
    		}
    		if(c[longLen]==0) {
    			int d[]=new int[longLen];
    			for(i=0;i<longLen;i++) {
    				d[i]=c[i];
    			}
    			return d;
    		}
    		return c;
    	}else {
    		longLen=lenB;
    		int c[]=new int[longLen+1];
    		for(i=0;i<longLen;i++) {
    			c[i]=a1[i];
    		}
    		c[i]=0;
    		for(i=0;i<longLen;i++) {
        		c[i]+=b1[i];
        		if(c[i]>=2) {
        			c[i]%=2;
        			c[i+1]+=1;
        		}
        	}
    		if(c[longLen]==0) {
    			reversalArray(c);
    			int d[]=new int[longLen];
    			for(i=0;i<longLen;i++) {
    				d[i]=c[i];
    			}
    			return d;
    		}
    		return c;
    	}
    }
    public static boolean reversalArray(int[] a) {
    	int i,j;
    	int len=a.length;
    	int temp=0;
    	for(i=0,j=len-1;i<(len/2+1);i++,j--) {
    		 temp=a[i];
    		a[i]=a[j];
    		a[j]=temp;
    	}
    	return true;
    }
    public static int[] reversal(int[] a) {
    	int b[]=new int[a.length];
    	int i,j;
    	for(i=0,j=a.length-1;i<a.length;i++,j--) {
    		b[i]=a[j];
    	}
    	return b;
    }
    public static int[] stringFormatInteger(String s) {
    	int len=s.length();
    	int[] a=new int[len];
    	for(int i=0;i<len;i++) {
    		a[i]=s.charAt(i)-'0';
    	}
    	return a;
    }
    public static String integerFormatString(int[] a) {
    	
    	int len=a.length;
    	char[] ch=new char[len];
    	for(int i=0;i<len;i++) {
    		switch(a[i]) {
    		case 0:
    			ch[i]='0';break;
    		case 1:
    			ch[i]='1';break;
    		case 2:
    			ch[i]='2';break;
    		case 3:
    			ch[i]='3';break;
    		case 4:
    			ch[i]='4';break;
    		case 5:
    			ch[i]='5';break;
    		case 6:
    			ch[i]='6';break;
    		case 7:
    			ch[i]='7';break;
    		case 8:
    			ch[i]='8';break;
    		case 9:
    			ch[i]='9';break;
    			default:break;
    		}
    	}
    	String str=new String(ch);
    	return str;
    }
}
