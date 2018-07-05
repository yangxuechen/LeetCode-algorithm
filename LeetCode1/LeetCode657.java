package leetCode2;

public class LeetCode657 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="RLUDD";
        boolean b=judgeCircle(str);
        if(b) {
        	System.out.println("true");
        }else {
        	System.out.println("false");
        }
	}
    public static boolean judgeCircle(String moves) {
        int x=0,y=0;   //定义原点坐标
        for(char c:moves.toCharArray()) {
        	if(c=='R') {
        		y++;
        	}else if(c=='L') {
        		y--;
        	}else if(c=='U') {
        	    x++;
        	}else if(c=='D') {
        		x--;
        	}
        }
        if(x==0&&y==0) {
        	return true;
        }
    	return false;
    }
}
