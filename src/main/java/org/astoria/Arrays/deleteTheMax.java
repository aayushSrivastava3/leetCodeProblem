package org.astoria.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class deleteTheMax {
    public int deleteGreatestValue(int[][] grid) {
        List<int[]> sortedArrays = new ArrayList<>();
        for(int[] ints : grid){
            Arrays.sort(ints);
            sortedArrays.add(ints);
        }

        int i=0;
        int sum=0;
        while(i<grid[0].length){
            int max=0;
            for(int[] arr : sortedArrays){
                max = Integer.max(max,arr[arr.length-1-i]);
            }
            sum += max;
            i++;
        }

        return sum;

    }

    public int deleteGreatestValueFast(int[][] grid) {
        int counter=0;
        int sum=0;
        while(counter < grid[0].length){
            int maxMain=0;
            for(int[] arr : grid){
                int max=0;
                HashMap<String, Integer> maxHolder = new HashMap<>();
                for(int i=0; i<arr.length; i++){
                    if(max < arr[i]){
                        maxHolder.put("Max", i);
                        max = arr[i];
                    }else {
                        continue;
                    }
                }
                maxMain = Integer.max(maxMain,arr[maxHolder.get("Max")]);
                arr[maxHolder.get("Max")] = 0;
            }
            sum+=maxMain;
        }

        return sum;
    }

}
