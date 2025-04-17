package org.astoria.Arrays;

public class invertImage {
    public int[][] flipAndInvertImage(int[][] image) {
        int indexI = 0;
        int[][] ans = new int[image.length][];
        for(int[] arr : image){
            int[] ar = new int[arr.length];
            int index=0;
            for(int i : arr){
                //Start filling from the end of the array
                //If 0 the add 1 
                if(i == 0){
                    ar[arr.length-1-index] = 1;
                }else{  //Otherwise add 0
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
