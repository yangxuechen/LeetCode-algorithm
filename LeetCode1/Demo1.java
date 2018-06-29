package leetCode;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。

       如果不存在公共前缀，返回空字符串 ""。
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
						if(!strs[i].startsWith(str)) {   //子串与每一个字符数组相比较
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
	 * 得到一个str从0-->n的子串
	 * @param str
	 * @param n
	 * @return
	 */
	public static  String getNewString(String str,int n) {
		return str.substring(0, n);
	}
}
