package org.astoria;

import java.util.HashMap;

public class vowelStringCount {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        String vowels = "aeiou";
        for(int i=left;i<=right;i++){
            if(vowels.indexOf(words[i].charAt(0)) != -1 && vowels.indexOf(words[i].charAt(words[i].length()-1)) != -1){
                count++;
            }
        }

        return count;
    }

    public int countPrefixes(String[] words, String s) {
        int count =0;
        for(String str : words){

        }

        return count;
    }

    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> hm = new HashMap<>();

        for(String str : arr){
            if(hm.containsKey(str)){
                hm.put(str, hm.get(str)+1);
            }else{
                hm.put(str,1);
            }
        }

        int index = 1;
        for(String str : arr){
            if(hm.get(str) == 1){
                if(index == k){
                    return str;
                }else{
                    index++;
                }
            }
        }


        return "";
    }
}
