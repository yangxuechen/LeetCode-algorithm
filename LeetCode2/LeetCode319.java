package LeetCode2;

import java.util.HashMap;
import java.util.Map;

public class LeetCode319 {
    public static void main(String[] args) {

        Map<Integer,Integer> map=new HashMap<Integer, Integer>();
        for(int i=1;i<280;i++){
            int n=bulbSwitch(i);
            if(map.containsKey(n)){
                map.put(n,map.get(n)+1);
            }else{
                map.put(n,1);
            }
            System.out.println("灯泡数："+i+"       n轮后开启的灯泡数： "+n);
        }
//       for(int i:map.keySet()){
//           System.out.println(i+" "+map.get(i));
//       }

        System.out.println("************************************");
for(int i=1;i<280;i++){
    int n=bulbSwitch2(i);
    System.out.println(i+" "+n);
}

    }

    /**
     * 通过
     * @param n
     * @return
     */
    public static int bulbSwitch2(int n){
        if(n<=3){
            return 1;
        }
        if(n<=8){
            return 2;
        }
        int first=7;
        int count=8;
        int res=2;
        while (count<n){
            count+=first;
            first+=2;
            res++;
        }
        return res;
    }

    /**
     * 超出时间限制
     * @param n
     * @return
     */
    public static int bulbSwitch(int n) {
        int[] a=new int[n];
        for(int i=1;i<=n;i++){
            trunOf(a,i);
 //           pringArray(a);
        }
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                count++;
            }
        }
        return count;
    }

    public static void trunOf(int a[],int k){
        for(int i=k-1;i<a.length;i+=k){
            if(a[i]==0){
                a[i]=1;
            }else{
                a[i]=0;
            }
        }
    }

   public static void pringArray(int[] a){
        for(int i:a){
            System.out.print(i+" ");
        }
       System.out.println();
   }
}
