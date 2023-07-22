package org.astoria.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class oddLengthArraySum {
    public int sumOddLengthSubarrays(int[] arr) {
        List<int[]> intArrList = new ArrayList<>();

        for(int i=1; i<=arr.length; i+=2){
            int j=0;
            while(j+i-1<arr.length){
                intArrList.add(Arrays.copyOfRange(arr,j,j+i));
                j++;
            }
        }

        int sum=0;
        for(int[] i : intArrList){
            sum += Arrays.stream(i).sum();
        }

        return sum;
    }
}
