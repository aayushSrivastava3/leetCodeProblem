package org.example;

import java.util.*;

public class consistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        int count =0;
        for(String str : words){
            boolean flag = false;
            for(char c : str.toCharArray()){
                if(allowed.indexOf(c) != -1){
                    flag = true;
                }
            }

            if(flag){
                count++;
            }
        }

        return count;
    }

    public int countConsistentStringsFaster(String allowed, String[] words){
        char[] arr = allowed.toCharArray();
        LinkedHashSet set = new LinkedHashSet();
        for(char c : arr){
            set.add(c);
        }
        int count=0;
        for(String str : words){
            boolean flag = false;
            for(char c : str.toCharArray()){
                if(set.contains(c)){
                    flag=true;
                }else {
                    flag = false;
                    break;
                }
            }

            if(flag){
                count++;
            }
        }

        return count;
    }
}
