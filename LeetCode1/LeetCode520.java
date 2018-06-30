package leetCode2;

public class LeetCode520 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     boolean b=isAllCapital("ASDs");
//     if(b) {
//    	 System.out.println("All Capital");
//     }
//		boolean b=isLowercase("sddddddf");
//	     if(b) {
//	    	 System.out.println("All Capital");
//	     }
		
		boolean b=detectCapitalUse("ljj");
	     if(b) {
	    	 System.out.println("true");
	     }else {
	    	 System.out.println("fasle");
	     }
	}
	
	public static boolean detectCapitalUse(String word) {
	    if(isAllCapital(word)||isLowercase(word)||isFirstCapital(word)) {
	    	return true;
	    }
		return false;
	}
	
	//判断单词是否全是大写字母
	public static boolean isAllCapital(String word) {
		for(char c:word.toCharArray()) {
			if(c<'A'||c>'Z') {
				return false;
			}
		}
		return true;
	}
	//判断单词是否全是小写字母
	public static boolean isLowercase(String word) {
		for(char c:word.toCharArray()) {
			if(c<'a'||c>'z') {
				return false;
			}
		}
		return true;
	}
	
	//判断单词是否仅首字母大写
	public static boolean isFirstCapital(String word) {
		if(word.charAt(0)<'A'||word.charAt(0)>'Z') {
			return false;
		}
		for(int i=1;i<word.length();i++) {
			if(word.charAt(i)<'a'||word.charAt(i)>'z') {
				return false;
			}
		}
		return true;
	}

}
