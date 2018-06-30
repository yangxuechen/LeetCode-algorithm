package leetCode;

public class LeetCode459 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//    String s=getSonString("assdf",5);
//    System.out.println(s);
    
//    boolean b= isSonString("a","a");
//    if(b) {
//    	System.out.println("true");
//    }else {
//    	System.out.println("false");
//    }
//    
		boolean b= repeatedSubstringPattern("aabaabaab");
		if(b) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
	public static boolean repeatedSubstringPattern(String s) {
		int len=s.length();
	    for(int i=1;i<=len/2;i++) {
	    	String sonStr=getSonString(s,i);
	    	boolean b=isSonString(s,sonStr);
	    	if(b==true) {
	    		return true;
	    	}
	    }
		return false;
	}
	
	//得到从0到n的子串
	public static String getSonString(String s,int n) {
		char a[]=new char[n];
		for(int i=0;i<n;i++) {
			a[i]=s.charAt(i);
		}
		String str=new String(a);
		return str;
	}
	//判断s2是否是s1的循环子串
	public static boolean isSonString(String s1,String s2) {
		int len1=s1.length();
		int len2=s2.length();
		if(len1%len2!=0) {
			return false;
		}
		int i,j;
		for(i=0,j=0;i<len1;) {
		//	System.out.println(s1.charAt(i)+" "+s2.charAt(j));
			if(s1.charAt(i)!=s2.charAt(j)) {
		//		System.out.println("no");
				return false;
			}
			i++;j++;
			if(j==len2) {
				j=0;
			}
		}
		return true;
	}
}
