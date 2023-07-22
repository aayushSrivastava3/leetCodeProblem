package org.example;

import java.util.Arrays;

public class candy {
    public void kidsWithCandies() {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;

        Boolean[] ans = new Boolean[candies.length];

        int maxCandy = Arrays.stream(candies).max().getAsInt();

        System.out.println(maxCandy);

        for(int i : candies){
            if(i+extraCandies>=maxCandy){
                ans[i] = true;
            }else {
                ans[i] = false;
            }
        }

        Arrays.asList(ans);
    }
}
