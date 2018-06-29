package leetCode;

public class Demo3 {

	public static void main(String[] args) {
		String[] strs= {"asdelll","asdel","asdel"};
		String[] strs2=null;
		String str=longestCommonPrefix(strs);
		System.out.println(str);

	}
	public static String longestCommonPrefix(String[] strs) {
		if(strs==null) {
			return "";
		}
		int flag=0,i,j=0,k=0;
		for(j=0;j<strs[0].length();j++) {
			char ch=strs[0].charAt(j);
			for(i=0;j<strs.length-1;i++) {
				if(strs[i].charAt(j)!=ch) {
					flag=1;
					break;
				}
				if(flag==1) {
					break;
				}else {
					k++;
				}
			}
		}
		System.out.println(k);
		String str=strs[0].substring(0, k);
		return str;
	}
}
