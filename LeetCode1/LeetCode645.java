package leetCode2;

public class LeetCode645 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int nums[]= {1,2,3,4,4,6};
       int a[]=findErrorNums(nums);
       for(int i:a) {
    	   System.out.println(i);
       }
	}
	 public static int[] findErrorNums(int[] nums) {
	     int n=nums.length;    //���鳤��
	     int a[]=new int[n];  //�����ϣ����ֵȫ��Ϊ0
	     int secondNum=0;  //�������ε���
	     int notNum=0;     //δ���ֵ���
	     for(int i:nums) {
	    	 if(a[i-1]==1) {
	    		 secondNum=i;
	    	 }
	    	 a[i-1]=1;
	     }
	     int j=1;
	     for(int i:a) {
	    	 if(i==0) {
	    		 notNum=j;
	    	 }
	    	 j++;
	     }
	     
//	     System.out.println("secondNum:"+secondNum);
//	     System.out.println("notNum:"+notNum);
	     int b[]=new int[2];
	     b[0]=secondNum;
	     b[1]=notNum;
		 return b;
	 }
}
