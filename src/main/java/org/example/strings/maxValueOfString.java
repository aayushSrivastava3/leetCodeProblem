package org.example.strings;

import java.util.Arrays;
import java.util.Collections;

public class maxValueOfString {
    public int maximumValue(String[] strs) {
        int[] value = new int[strs.length];
        int i=0;
        int max=0;
        for(String str : strs){
            //We will use regex matcher -> will return true if there are only digits in the string otherwise return false
            if(str.matches("^\\d+$")){
                value[i] = Integer.parseInt(str);
            }else{
                //If alphanumeric we will return put the length of the string
                value[i] = str.length();
            }
            max = Integer.max(max, value[i]);
            i++;
        }

        return max;
    }

    public int faster(String[] strs) {
        int max =0;
        for(String str : strs){
            int value = 0;
            boolean onlyDigits = true;
            for(int i=0; i<str.length(); i++){
                if((int) str.charAt(i) >= 97){
                    onlyDigits = false;
                    break;
                }
            }
            if(onlyDigits){
                value = Integer.parseInt(str);
            }else{
                value = str.length();
            }

            max = Integer.max(max, value);
        }

        return max;
    }
}
