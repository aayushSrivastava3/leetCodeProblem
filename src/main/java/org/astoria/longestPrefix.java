package org.astoria;

import java.util.Arrays;

public class longestPrefix {
    public String longestCommonPrefix() {

        String[] arr = {"cir","car"};
        Arrays.sort(arr);

        String str1 = arr[0];
        String str2 = arr[arr.length-1];

        int maxIndex = Math.min(str1.length(), str2.length());
        int i=1;
        String longestCommon = "";
        longestCommon += str1.charAt(0);

        for(String str : arr){
            System.out.println(str);
        }

        if(!str2.startsWith(longestCommon)){
            return "";
        }

        while(i <= maxIndex-1){
            if(str2.startsWith(longestCommon)){
                longestCommon += str1.charAt(i);
                i++;
            }else {
                StringBuilder finalAnswer = new StringBuilder(longestCommon);
                finalAnswer.deleteCharAt(finalAnswer.length()-1);

                return finalAnswer.toString();
            }
        }
        return longestCommon;
    }
}

