package leetCode;

public class LeetCode345 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s=reverseVowels("auio");
    System.out.println(s);
	}
    public static String reverseVowels(String s) {
        if(s==null) {
        	return null;
        }
        int len=s.length();
        char[] ch=s.toCharArray();
        int i=0,j=len-1;
       while(i<j) {
        	if(!isVowels(ch[i])) {
        		
        		i++;
        	}
        	if(!isVowels(ch[j])) {
        		j--;
        	}
        	if(isVowels(ch[i])&&isVowels(ch[j])) {
        		char temp=ch[i];
    			ch[i]=ch[j];
    			ch[j]=temp;
    			i++;
    			j--;
        	}
        }
        String str=new String(ch);
    	return str;
    }
    
    public static boolean isVowels(char c) {
    	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
    		return true;
    	}
    	if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
    		return true;
    	}
    	return false;
    }
}
