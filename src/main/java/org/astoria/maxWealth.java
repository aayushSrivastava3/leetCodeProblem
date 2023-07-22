package org.astoria;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class maxWealth {
    public int maximumWealth(int[][] accounts) {

        int maxWealth = 0;
        for(int[]  arr : accounts){
            int currentWealth = 0;
            for(int i : arr){
                currentWealth += i;
            }
            maxWealth = Integer.max(maxWealth, currentWealth);
        }

        BigInteger num1 = new BigInteger(String.valueOf(2));
        BigInteger num2 = new BigInteger(String.valueOf(5));

        if(num2.gcd(num1).intValue() == 1){

        }


        List<Integer> number = new ArrayList<>();





        return maxWealth;
    }
}
