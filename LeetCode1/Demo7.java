package leetCode;

/**
 * �Ӵ����ַ����е�һ�γ��ֵ�λ��
 * @author yangxuechen
 *
 */
public class Demo7 {

	public static void main(String[] args) {
		
     int n=strStr(null,"kj");
     System.out.println(n);
	}
	public static int strStr(String haystack, String needle) {
		if(needle==null) {
			return 0;
		}
		if(haystack==null) {
			return -1;
		}
		return haystack.indexOf(needle);
	}
}
