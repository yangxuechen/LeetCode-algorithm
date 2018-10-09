package LeetCode2;

public class LeetCode541 {
    public static void main(String[] args) {
//        char[] chars="asdfghjj".toCharArray();
//        reverseCharArrays(chars,0,3);
//        System.out.println(new String(chars));

        String s=reverseStr("a",1);
        System.out.println(s);
    }
    public static String reverseStr(String s, int k) {
        int len=s.length();  //字符串长度
        int count=len/(2*k); //每2*k为一段字符串，count是段数
        int remainder=len%(2*k);//s字符串中，每2*k为一段字符串，remainder是余下的字符串的长度
        char[] chars=s.toCharArray();

        //将s字符串中长度为2*k的前count段字符串子串按要求反转
        for(int i=0;i<len-remainder;i+=2*k){
            reverseCharArrays(chars,i,i+k-1);
        }

        //反转最后剩余的一段字符串
        if(remainder<k){
            //长度小于k,全部反转
            reverseCharArrays(chars,len-remainder,len-1);
        }else{
            //长度大于k,反转前k个字符即可
            reverseCharArrays(chars,len-remainder,len-remainder+k-1);
        }
        return new String(chars);
    }
    /**
     * 反转从startIndex到endIndex这一段字符数组
     * @param chars
     * @param startIndex
     * @param endIndex
     */
    public static void reverseCharArrays(char[] chars,int startIndex,int endIndex){
        while(startIndex<endIndex){
            char tmp=chars[endIndex];
            chars[endIndex]=chars[startIndex];
            chars[startIndex]=tmp;
            startIndex++;
            endIndex--;
        }
    }
}
