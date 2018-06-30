package leetCode;

public class LeetCode389 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      char c=findTheDifference("asdf","asdfe");
      System.out.println(c);
	}
    public static char findTheDifference(String s, String t) {
        int[] ch=new int[26];
        for(char c:s.toCharArray()) {
        	ch[c-'a']++;
        }
        for(char c:t.toCharArray()) {
        	ch[c-'a']--;
        }
        int i;
        for( i=0;i<26;i++) {
        	if(ch[i]!=0) {
        		break;
        	}
        }
        char c='a';
        for(int j=0;j<i;j++) {
        	c++;
        }
    	return c;
    }

}
