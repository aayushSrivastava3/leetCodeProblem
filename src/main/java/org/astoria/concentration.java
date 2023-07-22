package org.astoria;

import java.util.Arrays;

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
