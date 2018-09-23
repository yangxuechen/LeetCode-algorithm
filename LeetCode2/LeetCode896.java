package LeetCode2;

public class LeetCode896 {
    public static void main(String[] args) {

        int a[]={5};
        boolean b=isMonotonic(a);
        if(b){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    public static boolean isMonotonic(int[] A) {
        if(isDecrement(A)||isIncrement(A)){
            return true;
        }
        return false;
    }

    /**
     * 判断数组A是否是递增数组
     * @param A
     * @return
     */
    public static boolean isIncrement(int[] A){
        for(int i=0;i<A.length-1;i++){
            if(A[i]<A[i+1]){
                return false;
            }
        }
        return true;
    }

    /**
     * 判断数组A是否是递减数组
     * @param A
     * @return
     */
    public static boolean isDecrement(int[] A){
        for(int i=0;i<A.length-1;i++){
            if(A[i]>A[i+1]){
                return false;
            }
        }
        return true;
    }
}
