package org.astoria;

public class wordFoundInSentances {
    public int mostWordsFound(String[] sentences) {
        int max = 0;

        for(String s : sentences){
            String[] sen = s.split(" ");
            max = Integer.max(max, sen.length);
        }

        return max;
    }

}
