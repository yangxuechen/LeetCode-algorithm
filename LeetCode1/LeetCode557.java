package leetCode2;

public class LeetCode557 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s=reverseWords("Let's take LeetCode contest");
     System.out.println(s);
	}
    public static String reverseWords(String s) {
    	if(s==null) {
    		return null;
    	}
        String words[]=s.split(" ");
        String newS="";
        for(String str:words) {
        	String temp=reverseString(str);
        	newS=newS+" "+temp;
        //	System.out.println(temp);
        }
    	return newS.trim();//ºöÂÔ×Ö·û´®µÄÇ°µ¼¿Õ°×ºÍÎ²²¿¿Õ°×
    }
    
    //·´×ª×Ö·û´®
    public static String reverseString(String s) {
        if(s==null) {
	    	return null;
	    }
	    int len=s.length();
		char[] ch=new char[len];
		int i,j;
		for(i=0,j=len-1;i<len;i++,j--) {
			ch[i]=s.charAt(j);
		}
		String str=new String(ch);
		return str;
   }
}
