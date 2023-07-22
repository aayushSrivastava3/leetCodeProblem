package org.astoria.Arrays;

import java.util.*;

public class arithmeticTriplets {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count =0;

        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length;j++){
                if(nums[j] - nums[i] == diff){
                    for(int k=j; k<nums.length;k++){
                        if(nums[k] - nums[j] == diff){
                            count++;
                        }else{
                            continue;
                        }
                    }
                }else{
                    continue;
                }
            }
        }

        return count;
    }

    public int arithmeticTripletsFasterUsingHashMap(int[] nums, int diff){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            hm.put(nums[i],i);
        }

        int count=0;
        int i=0;
        while(i< nums.length){
            if(hm.containsKey(nums[i]+diff)){
                if(hm.containsKey(nums[i]+2*diff)){
                    count++;
                }
            }

            i++;
        }

        return count;
    }

    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26){
            return false;
        }

        String ans = "abcdefghijklmnopqrstuvwxyz";
        boolean flag = false;
        for(int i=0; i<26;i++){
            if(sentence.indexOf(ans.charAt(i)) != -1){
                flag = true;
            }else return false;
        }

        return flag;
    }

    public int arithmeticTripletsFasterUsingHashset(int[] nums, int diff) {
        HashSet<Integer> hs = new HashSet<>();
        for(Integer num : nums){
            hs.add(num);
        }

        int count=0;
        int i=0;
        while(i< nums.length){
            if(hs.contains(nums[i]+diff)){
                if(hs.contains(nums[i]+2*diff)){
                    count++;
                }
            }
        }
        return count;
    }
}
