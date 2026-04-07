package dsaPatterns.twoPointer;

public class HappyNumber {
    public static void main(String[] args) {
      int  n = 19;
      System.out.print(isNumberHappy(n));
    }

    private static boolean isNumberHappy(int n) {
        int slow = n;
        int fast = n;
        while(fast !=1){
            slow = sumOfSqureOfDigit(slow);
            fast = sumOfSqureOfDigit(sumOfSqureOfDigit(fast));
            if(fast ==1) return true;
            if (slow == fast) return false;
        }
        return true;

    }

    private static int sumOfSqureOfDigit(int n){
        int sum =0;
        while (n>0){
            int digit = n%10;
             sum +=  digit*digit;
            n = n/10;
        }
        return sum;
    }
}
