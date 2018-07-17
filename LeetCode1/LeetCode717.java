package leetCode2;

public class LeetCode717 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]= {0};
      boolean b=isOneBitCharacter(a);
      if(b) {
    	  System.out.println("true");
      }else {
    	  System.out.println("false");
      }
	}
    public static boolean isOneBitCharacter(int[] bits) {
    	if(bits==null||bits.length==0) {
    		return false;
    	}
    	if(bits.length==1) {
    		return true;
    	}
    	int i;
        for( i=0;i<bits.length;) {
        	if(bits[i]==0) {
        		i++;
        	}else {
        		i+=2;
        	}
        	if(i==bits.length-1) {
        		return true;
        	}
        }
    	return false;
    }
}
