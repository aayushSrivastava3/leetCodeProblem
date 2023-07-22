package org.astoria;

import java.util.*;

public class reverseVowels {
    public String reverseVowels(String s) {
        LinkedHashMap<Integer,Character> hm = new LinkedHashMap<>();

        for(int i=0;i<s.length();i++){
            char chr = s.charAt(i);
            if(chr == 'a' || chr =='e' || chr == 'i' || chr =='o' || chr == 'u' ||
                    chr == 'A' || chr =='E' || chr == 'I' || chr =='O' || chr == 'U'){
                hm.put(i,s.charAt(i));
            }
        }

        System.out.println(hm);
        Integer[] arr = hm.keySet().toArray(new Integer[0]);
        int index = 0;
        StringBuilder sb = new StringBuilder(s);
        for(int i=0; i<sb.length();i++){
            char chr = s.charAt(i);
            if(chr == 'a' || chr =='e' || chr == 'i' || chr =='o' || chr == 'u' ||
                    chr == 'A' || chr =='E' || chr == 'I' || chr =='O' || chr== 'U'){
                sb.setCharAt(i,hm.get(arr[arr.length-1-index]));
                index++;
            }

            if(index == hm.keySet().size()){
                break;
            }
        }

        return sb.toString();
    }
}
