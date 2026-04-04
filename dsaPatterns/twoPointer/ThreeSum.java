package dsaPatterns.twoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
      int[] nums=  {-1,0,1,2,-1,-4};

          List<List<Integer>> list =  sums(nums);
          System.out.println(list);
    }

    private static List<List<Integer>> sums(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();

        for (int f = 0; f < nums.length; f++) {
            if (nums[f] > 0) {
                break;
            }
            if (f == 0 || nums[f] != nums[f - 1]) {
                twoSumhelper(f,nums,list);
            }

        }
        return list;
    }



    static void twoSumhelper(int f, int[] nums, List<List<Integer>> res){
        int i = f+1;
        int j = nums.length-1;

        while(i<j){
            int sum = nums[i]+ nums[j];
            if(sum>0){
                j--;}
                else if( sum<0){
                    i++;}
                else {
                    res.add(Arrays.asList((nums[f]),nums[i],nums[j]));
                    i =i+1;
                    j = j-1;
            }

            }
        }
    }

