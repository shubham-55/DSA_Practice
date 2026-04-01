package dsaPatterns.twoPointer;

public class Pallindrome {
    public static void main(String[] args) {
        {
          System.out.println(isPallindrome(-12321));
        }
    }

    private static boolean isPallindrome(int x) {
            String s = String.valueOf(x);
            int n = s.length();

            for(int i = 0, j= n-1;i<j;i++,j--){
                if(s.charAt(i) != s.charAt(j)){
                    return false;
                }

            }
            return true;

        }
    }


