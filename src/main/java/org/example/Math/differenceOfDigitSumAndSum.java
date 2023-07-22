package org.example.Math;

public class differenceOfDigitSumAndSum {

    public int differenceOfSum(int[] nums) {
        int sum=0;
        int digitSum=0;

        for(Integer in : nums){
            sum += in;
            int digit =0;
            while(in>0){
                digit = in%10;
                digitSum += digit;
                in /=10;
            }
        }

        return Math.abs(sum-digitSum);
    }
}
