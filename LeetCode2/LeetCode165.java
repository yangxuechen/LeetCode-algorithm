package LeetCode2;

public class LeetCode165 {
    public static void main(String[] args) {

        String v1="1.0";
        String v2="1";
        int n=compareVersion(v1,v2);
        System.out.println(n);
    }

    public static int compareVersion(String version1, String version2) {
        String v1[]=version1.split("\\.");
        String v2[]=version2.split("\\.");
        int len1=v1.length;//v1字符串数组长度
        int len2=v2.length;//v2字符串数组长度
        int min=Math.min(len1,len2);//最短长度
        int i;
        for( i=0;i<min;i++){
            int a=Integer.parseInt(v1[i]);
            int b=Integer.parseInt(v2[i]);
            if(a>b){
                return 1;
            }else if(a<b){
                return -1;
            }
        }
        if(len1>len2){
           for(int j=i;j<len1;j++){
               int tmp=Integer.parseInt(v1[j]);
               if(tmp!=0){
                   return 1;
               }
           }
           return 0;
        }else if(len1<len2){
            for(int j=i;j<len2;j++){
                int tmp=Integer.parseInt(v2[j]);
                if(tmp!=0){
                    return -1;
                }
            }
            return 0;
        }
        return 0;
    }
}
