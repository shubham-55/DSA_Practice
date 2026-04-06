package dsaPatterns.twoPointer;

public class reverseWordInString {
    public static void main(String[] args) {
        String s = "the sky is blue";
        String str = s.trim();

        String[] str1 = str.split(" ");
        int i =0 , j = str1.length-1;
        while(i<=j){
            String temp = str1[i];
            str1[i] = str1[j];
            str1[j] = temp;
            i++;
            j--;
        }
        str1.toString();
        for(String s1 :str1){
            System.out.print(" " + s1);
        }


    }
}
