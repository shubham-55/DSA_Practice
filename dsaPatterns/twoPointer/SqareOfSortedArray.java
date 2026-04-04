package dsaPatterns.twoPointer;

import java.util.Arrays;

public class SqareOfSortedArray {
    public static void main(String[] args) {
        int nums[] = {-7,-3,2,3,11};
        int[] res = new int[nums.length];
        int i =0, j = nums.length-1;
        int k = j;

        while(i<=j){
            if(Math.abs(nums[i])<=Math.abs(nums[j])){
                res[k]=nums[j]*nums[j];
               j--;
               k--;

            }else{
                res[k] = nums[i]*nums[i];
                i++;
                k--;
            }
        }
        for(int ik =0;ik< nums.length;ik++){
            System.out.println(res[ik]);
        }
    }
}
