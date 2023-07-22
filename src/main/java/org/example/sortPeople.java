package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class sortPeople {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> heightNameMap = new HashMap<>();

        String[] ans = new String[names.length];
        for(int i=0;i<names.length;i++){
            heightNameMap.put(heights[i],names[i]);
        }

        Arrays.sort(heights);
        for(int i=0; i< heights.length;i++){
            ans[i] = heightNameMap.get(heights[heights.length-1-i]);
        }

        return ans;
    }
}
