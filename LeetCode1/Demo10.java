package leetCode;

/**
 * ����һ���Ǹ�������ɵķǿ����飬�ڸ����Ļ����ϼ�һ������һ���µ����顣

���λ���ִ�����������λ�� ������ÿ��Ԫ��ֻ�洢һ�����֡�

����Լ���������� 0 ֮�⣬��������������㿪ͷ��
 * @author yangxuechen
 *
 */
public class Demo10 {

	public static void main(String[] args) {
		int b[]= {9};
		System.out.println(b.length+":length b");
      int a[]=plusOne(b);
        System.out.println(a.length+":length a");
      System.out.print("sum:");
      for(int i=0;i<a.length;i++) {
    	  System.out.print(a[i]);
      }
	}
    public static int[] plusOne(int[] dights) {
    	if(dights==null||dights.length==0) {
    		return null;
    	}
    	 int i;
    	 int len=dights.length;
    	 dights[len-1]+=1;
    	 for(i=len-1;i>0;i--) {
    		 if(dights[i]>=10) {
    			 dights[i]%=10;
    			 dights[i-1]+=1;
    		 }else {
    			 break;
    		 }
    	 }
    	 if(dights[0]==10) {
    		 int[] a=new int[len+1];
    		 a[0]=1;
    		 dights[0]=0;
    		 for(i=0;i<len;i++) {
    			 a[i+1]=dights[i];
    		 }
    		 return a;
    	 }
    	return dights;
    }
   
}
