package leetCode2;

public class LeetCode551 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		boolean b=checkRecord("PPALLL");
		if(b) {
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}
    public static boolean checkRecord(String s) {
        if(onlyOneA(s)==true&&onlyTwoContinuousL(s)==false)
        	return true;
    	return false;
    }
    
    //�ж��ַ������Ƿ����ֻ��1��A
    public static boolean onlyOneA(String s) {
    	int count=0;
    	for(char c:s.toCharArray()) {
    		if(c=='A') {
    			count++;
    		}
    		if(count>1) {
    			return false;
    		}
    	}
    	return true;
    }
    
    //�ж��ַ������Ƿ��г�������������L
    public static boolean onlyTwoContinuousL(String s) {
    	for(int i=0;i<s.length()-2;i++) {
    		if(s.charAt(i)=='L'&&s.charAt(i+1)=='L'&&s.charAt(i+2)=='L') {
    			return true;
    		}
    	}
    	return false;
    }
}
