package leetCode;

public class LeetCode168 {

	public static void main(String[] args) {
		System.out.println("702/26="+702/26+"\n702%26="+702%26);
       String str=convertToTitle(702);
       System.out.println(str);
	}
   public static String convertToTitle(int n) {
        char[] key=new char[27];
        char ch='A';
        char[] result=new char[2];
        for(int i=1;i<27;i++) {
        	key[i]=ch;
        	ch++;
        }
        
//        for(char c:key) {
//        	System.out.print(c+" ");
//        }
        if(n<=26) {
        	return ""+key[n];
        }
        int a=n/26;//n/26µÄvalue
        int b=n%26;//n%26µÄvalue
 //       System.out.println("a="+a+"\nb="+b);
        
        if(b==0) {
        	 result[1]=key[26];
        	 result[0]=key[a-1];
        }
        else {
        	 result[0]=key[a];
        	result[1]=key[b];
        }
        
       String str=new String(result);
	   return str;
    }
}
