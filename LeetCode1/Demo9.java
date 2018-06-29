package leetCode;

/**
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。

如果不存在最后一个单词，请返回 0 。

说明：一个单词是指由字母组成，但不包含任何空格的字符串
 * @author yangxuechen
 *
 */

public class Demo9 {

	public static void main(String[] args) {
		int n=lengthOfLastWords("j  ");
        System.out.println(n);
	}
    public static int lengthOfLastWords(String str) {
    	if(str==null||str.length()==0) {
    		return 0;
    	}
    	if(str.length()==1&&str.charAt(0)!=' ') {
    		return 1;
    	}
    	int len=str.length();
    	int i,count=0;
    	int flag=0;
    	for(i=len-1;i>=0;i--) {
    		
    		while(str.charAt(i)==' '&&i!=0) {
    			i--;
    		}
    		while(str.charAt(i)!=' '&&i!=0) {
    			count++;
    			i--;
    			flag=1;
    		}
    		if(flag==1)
    			break;
    	}
    	if(i==0&&str.charAt(i)!=' ') {
    		return count+1;
    	}
    	if(flag==0&&str.charAt(0)!=' ') {
    		return 1;
    	}
    	return count;
    }
}
