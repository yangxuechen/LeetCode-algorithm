package leetCode;

/**
 * ��дһ�������������ַ��������е������ǰ׺��

       ��������ڹ���ǰ׺�����ؿ��ַ��� ""��
 * @author yangxuechen
 *
 */
public class Demo1 {

	public static void main(String[] args) {

		String[] strs= {"abc","ab","ab"};
		String[] strs2=null;
		String str=longestCommonPrefix(strs);
		System.out.println(str);
	}
	public static String longestCommonPrefix(String[] strs) {
		        if(strs==null||strs.length==0){
		            return "";
		        }
		        if(strs.length==1){
		            return strs[0];
		        }
		        String str=new String();
				String str2=new String();
		        String str3=strs[0];
		    //    str2=strs[0];
				int flag=0;
				for(int j=0;j<str3.length();j++) {
					str=getNewString(str3,j+1);
					//System.out.println(str+"******");
					for(int i=0;i<strs.length;i++) {
						if(!strs[i].startsWith(str)) {   //�Ӵ���ÿһ���ַ�������Ƚ�
					     flag=1;
					     break;
						}
					}
					if(flag==0) {
						str2=str;
					}else {
						break;
					}
				}
				
				return str2;
		    }
		    
		
	/**
	 * �õ�һ��str��0-->n���Ӵ�
	 * @param str
	 * @param n
	 * @return
	 */
	public static  String getNewString(String str,int n) {
		return str.substring(0, n);
	}
}
