package dsaPatterns.twoPointer;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PairSumIsLessThanTarget {
    public static void main(String[] args) {

       List<Integer> nums = Arrays.asList(-6,2,5,-2,-7,-1,3);
       int  target = -2;
       System.out.println(pairSum(nums,target));
    }

    private static int pairSum(List<Integer> nums, int target) {
        Collections.sort(nums);
        int i = 0;
        int j = nums.size()-1;
        int count = 0;


        while(i<j){
            int sum = nums.get(i)+nums.get(j);
            if(sum < target){
                count = count+(j-i);
                i++;
            }else{
                j--;
            }

        }
        return count;
    }
}
