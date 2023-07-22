package org.astoria.Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class smallerNumbersThanCurrentNumber {

    //Brute force approach
    /**
     * In Brute force we check each number using loops.
     *
     */
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length;i++){
            int count = 0;
            for(int j=0;j<nums.length;j++){
                if(i==j){
                    continue;
                }else{
                    if(nums[i]>nums[j]){
                        count++;
                    }
                }
            }

            ans[i] = count;
        }

        return ans;
    }

    //HashMap approach [Faster]
    /**
     * Here will utilize the sorted property. The index of the value represents the number of numbers smaller the value
     * We just need the handle when 2 values are same -> for that we will use hashmap since it cannot hold duplicate values
     *
     * HashMap <value, Index[number of numbers less than the value]>
     * */
    public int[] smallerNumbersThanCurrentFaster(int[] nums) {
        int[] ans = new int[nums.length];
        int[] sorted = Arrays.stream(nums).sorted().toArray();
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(hm.containsKey(sorted[i])){

                //We will not update the index since we already have the value in the HashMap
                continue;
            }else{

                //If we do not have that value in the HashMap there for its unique and the index represents the number of number less than the value
                hm.put(sorted[i],i);
            }
        }

        //We then poluate the ans array using the hashmap
        for(int i=0; i<nums.length; i++){
            ans[i] = hm.get(nums[i]);
        }

        return ans;
    }
}
