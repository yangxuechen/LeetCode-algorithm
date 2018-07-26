package leetCode2;

public class LeetCode796 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String s=getNewString("asdfgh",2);
		boolean b=rotateString("","");
		if(b) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
    public static boolean rotateString(String A, String B) {
    	if(A==null||B==null) {
    		return false;
    	}
    	if(A.length()!=B.length()) {
    		return false;
    	}
    	if(A.length()==0&&B.length()==0) {
    		return true;
    	}
        char c=B.charAt(0);
        for(int i=0;i<A.length();i++) {
        	if(c==A.charAt(i)) {
        		String s=getNewString(A,i);
        		if(s.equals(B)) {
        			return true;
        		}
        	}
        }
    	return false;
    }
	/**
	 * 将s字符串从index索引位置到尾索引作为新字符串的前一段字符串，后一段字符串为s字符串从0索引位置到index索引的字符串
	 * @param s
	 * @param index
	 * @return
	 */
	public static String getNewString(String s,int index) {
		int len=s.length();
		char ch[]=new char[len];
		int i=0,j;
		for(i=0,j=index;j<len;i++,j++) {
			ch[i]=s.charAt(j);
		}
		for(j=0;j<index;i++,j++) {
			ch[i]=s.charAt(j);
		}
	//	System.out.println(new String(ch));
		return new String(ch);
	}

}
