package leetCode2;

public class LeetCode824 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="I speak Goat Latin";
		String str=toGoatLatin(s);
		System.out.println(str);
	}
    public static String toGoatLatin(String S) {
	    String arrs[]=S.split(" ");
	    String s1="a";
	    String result="";
	    for(int i=0;i<arrs.length;i++) {
	    	String tempS;
	    	char c[]=arrs[i].toCharArray();
	    	if(c[0]=='a'||c[0]=='e'||c[0]=='i'||c[0]=='o'||c[0]=='u'||
	    	   c[0]=='A'||c[0]=='E'||c[0]=='I'||c[0]=='O'||c[0]=='U') {
	    		tempS=arrs[i]+"ma";
	    	}else {
	    		tempS=new String(c,1,c.length-1);
	    		tempS=tempS+c[0]+"ma";
	    	}
	    	tempS=tempS+s1;
	    	s1+='a';
	    	result=result+tempS+" ";
	    }
    	return result.trim();
	}
}
