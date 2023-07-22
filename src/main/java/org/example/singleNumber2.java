package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class singleNumber2 {
    public int singleNumber(int[] nums) {

        HashMap<Integer,Integer> occuranceMap = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(occuranceMap.containsKey(nums[i])){
                occuranceMap.put(nums[i],occuranceMap.get(nums[i])+1);
            }else {
                occuranceMap.put(nums[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> om : occuranceMap.entrySet()){
            if(om.getValue() == 1){
                return om.getKey();
            }
        }

        return 0;
    }

    public int singleNumberBruteForce(int[] nums){
         List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
         HashMap<Integer, Integer> occuranceMap = new HashMap<>();
         for (int i = 0; i < list.size(); i++) {
             int count = Collections.frequency(list, list.get(i));
             occuranceMap.put(count, list.get(i));
             if(count == 1){
                 break;
             }
         }

         return occuranceMap.get(1);
    }
}
