package dsaPatterns.twoPointer;

public class ValidPallindrom2 {
    public static void main(String[] args) {
        {
            String s ="abc";
            System.out.println(isPallindrome2(s));
        }
    }

    private static boolean isPallindrome2(String s) {
        int i = 0, j= s.length()-1;
        while(i<j){
            char left = s.charAt(i);
            char right = s.charAt(j);

            if(left != right){
              return   pallindromHelper(i+1,j,s) || pallindromHelper(i,j-1,s);
            }else{
                i++;
                j--;
            }
        }
        return true;
    }

    private static boolean pallindromHelper(int i, int j, String s) {
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }else{
                i++;
                j--;
            }

        }
        return true;
    }

}


