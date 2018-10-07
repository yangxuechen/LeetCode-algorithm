package LeetCode2;

public class LeetCode7 {
    public static void main(String[] args) {

//        String str="asdfj";
//        String s=reverseString(str);
//        System.out.println(s);
        System.out.println(Integer.MAX_VALUE);
        int n=reverse(1534236469);
        System.out.println(n);
    }
    public static int reverse(int x) {
        if(x>0){
            String str=Integer.toString(x);
            String s=reverseString(str);
            try{
                return Integer.parseInt(s);
            }catch (NumberFormatException e){
                return 0;
            }

        }else if(x<0){
            x=Math.abs(x);
            String str=Integer.toString(x);
            String s=reverseString(str);
            s="-"+s;
            try{
                return Integer.parseInt(s);
            }catch (NumberFormatException e){
                return 0;
            }
        }
        return 0;
    }

    public static String reverseString(String str){
        char ch[]=str.toCharArray();
        int i,j;
        for(i=0,j=ch.length-1;i<(ch.length-1)/2+1;i++,j--){
            char tmp=ch[j];
            ch[j]=ch[i];
            ch[i]=tmp;
        }
        return new String(ch);
    }
}
