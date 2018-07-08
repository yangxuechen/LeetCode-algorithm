package leetCode2;

public class LeetCode680 {

	public static void main(String args[]) {
		String s="a";
		boolean b=validPalindrome(s);
		if(b) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
	
	/**
	 * 判断字符串在允许删除一个字符的情况下能否成为回文串
	 * @param s
	 * @return
	 */
    public static boolean validPalindrome(String s) {
        for(int i=0,j=s.length()-1;i<j;i++,j--) {
        	if(s.charAt(i)!=s.charAt(j)) {
        		if(isPalindrome(s,i+1,j)||isPalindrome(s,i,j-1)) {
        			return true;
        		}else {
        			return false;
        		}
        	}
        }
    	return true;
    }
    
    /**
     * 判断字符串从startIndex~endIndex这一段子串是否是回文串
     * @param s  字符串
     * @param startIndex  起始索引
     * @param endIndex    结束索引
     * @return
     */
    public static boolean isPalindrome(String s,int startIndex,int endIndex) {
    	for(int i=startIndex,j=endIndex;i<j;i++,j--) {
    		if(s.charAt(i)!=s.charAt(j)) {
    			return false;
    		}
    	}
    	return true;
    }
}
