package dsaPatterns.twoPointer;



public class ValidPallindrome {
    public static void main(String[] args) {
        String s = "0P";

        System.out.println(isValidPallindrome(s));
    }

    private static boolean isValidPallindrome(String s) {
        String cleaned = s.replaceAll("[^A-Za-z0-9]", "");
        String s1 = cleaned.toLowerCase();
        int n = s1.length();

        for(int i = 0, j= n-1;i<j;i++,j--){
            if(s1.charAt(i) != s1.charAt(j)){
                return false;
            }
        }
        return true;
    }


    }



