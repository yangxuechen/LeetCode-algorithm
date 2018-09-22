package LeetCode2;

public class LeetCode905 {
    public static void main(String[] args) {

        int a[]={0,2};
        sortArrayByParity(a);
        for(int i:a){
            System.out.print(i+" ");
        }
    }

    public static int[] sortArrayByParity(int[] A) {

        int startIndex=0;
        int endIndex=A.length-1;
        while(startIndex<endIndex){
            while(A[startIndex]%2==0){
                startIndex++;
                if(startIndex>=endIndex){
                    break;
                }
            }
            while(A[endIndex]%2!=0){
                endIndex--;
                if(startIndex>=endIndex){
                    break;
                }
            }
            if(startIndex>=endIndex){
                break;
            }
            int tmp=A[endIndex];
            A[endIndex]=A[startIndex];
            A[startIndex]=tmp;
        }
        return A;
    }
}
