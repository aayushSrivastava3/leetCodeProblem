package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class concentration {
    public void getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];


//        for(int i=0;i<ans.length;i++){
//            if(i<nums.length){
//                ans[i] = nums[i];
//            }else{
//                ans[i] = nums[i-nums.length];
//            }
//        }


        System.out.println(Arrays.toString(ans));
    }
}
