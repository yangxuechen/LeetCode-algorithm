package leetCode;

/**
 * ����һ����������Сд��ĸ�Ϳո� ' ' ���ַ��������������һ�����ʵĳ��ȡ�

������������һ�����ʣ��뷵�� 0 ��

˵����һ��������ָ����ĸ��ɣ����������κοո���ַ���
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
