package org.example;

import java.util.Arrays;

public class searchInsert {
    public int searchInsertMethod(int[] nums, int target) {

        if(target>nums[nums.length-1]){
            return nums.length;
        }

        int index = Arrays.binarySearch(nums, target);

        if(index < 0){
            return Math.abs(index)-1;
        }

        return index;
    }
}
