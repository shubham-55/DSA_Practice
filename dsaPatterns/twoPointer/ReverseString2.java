package dsaPatterns.twoPointer;

import java.util.Arrays;

public class ReverseString2 {
    public static void main(String[] args) {
        String str = "abcdefg"; //bacdfeg
        reverseStr(str, 2);
    }

    private static void reverseStr(String s, int k) {

        char[] arr = s.toCharArray();

        for (int start = 0; start < arr.length; start += 2 * k) {
            int i = start;
            int j = Math.min(start + k - 1, arr.length - 1);

            while (i < j) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        System.out.print(Arrays.toString(arr));


}
}
