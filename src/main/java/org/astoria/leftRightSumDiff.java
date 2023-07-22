package org.astoria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leftRightSumDiff {
    public void leftRightDifference(int[] nums) {


        List<Integer> leftSumL = new ArrayList<>();
        List<Integer> rightSumL = new ArrayList<>();
        int[] ans = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j>=0;j--){
                sum += nums[j];
            }
            leftSumL.add(sum);

            int rsum =0;
            for(int j=i; j<nums.length;j++){
                rsum += nums[j];
            }
            rightSumL.add(rsum);
        }
        leftSumL.remove(leftSumL.get(leftSumL.size()-1));
        rightSumL.remove(rightSumL.get(0));

        leftSumL.add(0,0);
        rightSumL.add(0);

        System.out.println(leftSumL);
        System.out.println(rightSumL);
    }

    public void leftRightDifferenceFast(int[] nums){

        int[] leftSum = new int[nums.length];
        int [] rightSum = new int[nums.length];

        leftSum[0] = 0;
        rightSum[nums.length-1] = 0;
        for(int i=0; i<nums.length-1;i++){
            leftSum[i+1] = leftSum[i]+nums[i];
        }
        for (int i=nums.length-2; i>=0 ;i--){
            rightSum[i] = rightSum[i+1]+nums[i+1];
        }

        System.out.println(Arrays.toString(leftSum));
        System.out.println(Arrays.toString(rightSum));
    }
}
