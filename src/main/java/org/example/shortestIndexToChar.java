package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class shortestIndexToChar {
    public int[] shortestToChar(String s, char c) {
        ArrayList<Integer> indexes = new ArrayList<>();

        int[] ans = new int[s.length()];
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == c){
                indexes.add(i);
            }
        }

        for(int i=0;i<s.length();i++){
            int min=s.length();
            for(Integer index : indexes){
                min = Math.min(min, Math.abs(i-index));
            }
            ans[i] = min;
        }

        return ans;
    }
}
