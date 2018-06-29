package leetCode;

public class LeetCode88 {

	public static void main(String[] args) {
	
    int a[]= {0,1,2,3,0,0,0,0,0,0,0,0};
    int b[]= {4,5,9,10};
    merge(a,4,b,4);
  //  insertArray(a,7,8,5);
    for(int i=0;i<a.length;i++) {
    	System.out.println(a[i]);
    }
	}
    public static void merge(int[] a,int m,int[] b,int n) {
    	int i,j;
    	for(i=0;i<n;i++) {
//    		if(b[i]>a[m-1]) {
//    			insertArray(a,m+i,b[i],m+i);
//    		}
// 		else {
    			for(j=0;j<m+i;j++) {
        			if(b[i]<a[j]) {
        				break;
        			}else {
        				continue;
        			}
        		}
    			insertArray(a,m+i,b[i],j);
//    		}
    	}
    }
    public static void insertArray(int[] a,int len,int value,int n) {
    	int i;
    	for(i=len-1;i>=n;i--) {
    		a[i+1]=a[i];
    	}
    	a[n]=value;
    }
    public static void printArrayValue(int[] a,int len) {
    	for(int i=0;i<len;i++) {
    		System.out.print(a[i]+" ");
    	}
    }
}
