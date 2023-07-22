package org.astoria;

import java.util.HashMap;

public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numbers = new HashMap<>();
        int solution [] = new int[2];
        for(int i = 0; i<nums.length; i++){
            int compliment = target - nums[i];
            if(numbers.containsKey(compliment)){
                solution[0] = numbers.get(compliment);
                solution[1] = i;
                break;
            }else{
                numbers.put(nums[i],i);
            }
        }
        return solution;
    }
}
