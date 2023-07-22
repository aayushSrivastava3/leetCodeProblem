package org.example;

import java.util.*;

public class validParenthesis {
    public  void isValid() {

        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        HashSet<Integer> removedDuplicates = new HashSet<>();

        int index = 0;
        for(int i = 0; i<nums.length;i++){
            if(!removedDuplicates.contains(nums[i])){
                removedDuplicates.add(nums[i]);
                nums[index] = nums[i];
                index++;
            }else{
                continue;
            }
        }

        for(int num : nums) {
            System.out.println(num);
        }
    }
}
