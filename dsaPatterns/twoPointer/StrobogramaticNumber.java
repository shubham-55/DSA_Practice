package dsaPatterns.twoPointer;

import java.util.HashMap;
import java.util.Map;

public class StrobogramaticNumber {
    public static void main(String[] args) {
        String s = "31682891";
        System.out.println(isSubogrammatic(s));
    }

    private static boolean isSubogrammatic(String str) {
        Map<Character,Character> map = new HashMap<>();
        map.put('1','1');
        map.put('8','8');
        map.put('6','9');
        map.put('9','6');

        int i =0, j = str.length()-1;
        while(i<=j){
            if(map.get(str.charAt(i)) != null && map.get(str.charAt(i)) == str.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;


    }
}
