package dsaPatterns.twoPointer;

public class SortColour {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        int countA = 0;
        int countB = 0;
        int countC= 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==0) countA++;
            if(nums[i]==1) countB++;
            if(nums[i]==2) countC++;
        }
        for(int i = 0; i<countA;i++) nums[i] = 0;
        for(int i = countA; i<countA+countB;i++) nums[i] = 1;
        for(int i = countA+countB; i<nums.length;i++) nums[i] = 2;

        for(int num :nums)
        System.out.print(" " + num);

    }
    }

