package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class removeElementVal {
    public int removeElement(int[] nums, int val) {

        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                nums[index] = nums[i];
                index++;
            }
        }

        for(int i =0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
        return index;
    }
}
