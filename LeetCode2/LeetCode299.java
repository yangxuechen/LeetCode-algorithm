package LeetCode2;

import java.util.HashMap;
import java.util.Map;

public class LeetCode299 {
    public static void main(String[] args) {

        String str=getHint("1222","1222");
        System.out.println(str);
    }
    public static String getHint(String secret, String guess) {
        int Bulls=0;//公牛数
        int Cows=0; //奶牛数
        StringBuilder newGuess=new StringBuilder();
        Map<Character,Integer> map=new HashMap<Character, Integer>();

        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i)==guess.charAt(i)){
                Bulls++;
            }else{
                if(map.containsKey(secret.charAt(i))){
                    map.put(secret.charAt(i),map.get(secret.charAt(i))+1);
                }else{
                    map.put(secret.charAt(i),1);
                }
                newGuess.append(guess.charAt(i));
            }

        }
        //将secret字符串出现的字符作为key,出现次数作为value存储在map
       String guess2=newGuess.toString();
        for(int i=0;i<guess2.length();i++){
                if(map.containsKey(guess2.charAt(i))) {
                    Cows++;
                    if (map.get(guess2.charAt(i)) == 1) {
                        map.remove(guess2.charAt(i));
                    } else {
                        map.put(guess2.charAt(i), map.get(guess2.charAt(i)) - 1);
                    }
                }
        }

//        System.out.println(Bulls+"A"+Cows+"B");
        return Bulls+"A"+Cows+"B";
    }
}
