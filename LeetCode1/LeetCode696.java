package leetCode2;

public class LeetCode696 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        boolean b=isTrue("000111");
//        if(b) {
//        	System.out.println("true");
//        }else {
//        	System.out.println("false");
//        }
        
        int n=countBinarySubstrings("00110011");
        System.out.println(n);
	}
	
	/*
	 *   funcation 1
	 *  超出时间限制
	 public static int countBinarySubstrings(String s) {
		 if(s==null||s.length()==0) {
			 return 0;
		 }
	     int count=0;
		 for(int i=0;i<s.length();i++) {
			 for(int j=i+1;j<=s.length();j++) {
				 String tempS=s.substring(i, j);
				// System.out.println(tempS);
				 if(isTrue(tempS)) {
					 count++;
				 }
			 }
		 }
		 return count;
	 }
	
	//判断s是否0,1组合且数量相同，0与0组合，1与1组合
	public static boolean isTrue(String s) {
		int len=s.length();
		if(len%2!=0) {
			return false;
		}
		if(s.charAt(0)==s.charAt(len-1)) {
			return false;
		}
		for(int i=0;i<len/2-1;i++) {
			if(s.charAt(i)!=s.charAt(i+1)) {
				return false;
			}
		}
		for(int i=len/2;i<len-1;i++) {
			if(s.charAt(i)!=s.charAt(i+1)) {
				return false;
			}
		}
		
	//	System.out.println(s);
		return true;
	}
     */
	
	 public static int countBinarySubstrings(String s) {
		 if(s==null||s.length()<=1) {
			 return 0;
		 }
		 int count=0;
		 int a[]=new int[s.length()]; //用来存储连续0,1的个数
		 char ch[]=s.toCharArray();
		 int temp=0;   //连续0,1的长度
		 for(int i=0;i<s.length()-1;i++) {
			 a[temp]++;
			 if(ch[i]!=ch[i+1]) {
				 temp++;
			 }
		 }
		 a[temp]++;
		 for(int i=0;i<temp;i++) {
			 count+=Math.min(a[i], a[i+1]);
		 }
		 return count;
	 }
}
