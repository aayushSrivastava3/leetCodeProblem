package org.astoria;

import java.util.HashMap;

public class StringLadder {
    public int maximumNumberOfStringPairs(String[] words) {
        HashMap<String,Integer> hm = new HashMap<>();
        int count = 0;
        for(String str : words){
            String s="12";
            String check = s.replace('1',str.charAt(1)).replace('2',str.charAt(0));
            if(hm.containsKey(check)){
                count++;
            }else{
                hm.put(str, count);
            }
        }

        return count;
    }
}
