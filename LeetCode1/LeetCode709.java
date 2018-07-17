package leetCode2;

public class LeetCode709 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s=toLowerCase("ASDfggHH");
		System.out.println(s);
	}
    public static String toLowerCase(String str) {
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++) {
        	if(ch[i]>='A'&&ch[i]<='Z') {
        		ch[i]+=32;
        	}
        }
        String s=new String(ch);
    	return s;
    }

}
