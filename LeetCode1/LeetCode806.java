package leetCode2;

public class LeetCode806 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int widths[]= {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
		String S="bbbcccdddaaa";
       int a[]=numberOfLines(widths,S);
       for(int i:a)
       System.out.println(i);
	}
	public static int[] numberOfLines(int[] widths, String S) {
	    int row=0;  //一行所占单位数
	    int count=0; //所需行数
	    for(int i=0;i<S.length();i++) {
	    	row+=widths[S.charAt(i)-'a'];
	    	if(row>100) {
	    		row=0;
	    		count++;
	    		i--;
	    	}
	    }
	    int a[]= {count+1,row};
	 //   System.out.println(count+1+" "+row);
		return a;
	}
}
