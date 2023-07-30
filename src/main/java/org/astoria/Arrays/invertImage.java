package org.astoria.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class invertImage {
    public int[][] flipAndInvertImage(int[][] image) {
        int indexI = 0;
        int[][] ans = new int[image.length][];
        for(int[] arr : image){
            int[] ar = new int[arr.length];
            int index=0;
            for(int i : arr){
                if(i == 0){
                    ar[arr.length-1-index] = 1;
                }else{
                    ar[arr.length-1-index] = 0;
                }
                index++;
            }
            ans[indexI] = ar;
            indexI++;
        }
        return ans;
    }
}
