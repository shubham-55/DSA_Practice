package dsaPatterns.twoPointer;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {


        String s = "Hello";


        System.out.println(reveseStr(s));
    }

    private static String reveseStr(String s) {
        char[] str = s.toCharArray();
        int i = 0, j = s.length()-1;
        while (i<j){
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;

        }
        return Arrays.toString(str);

    }
}
