package org.astoria;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
class minColumnDeletionSize {
    public int minDeletionSize(String[] strs) {
        int poppedCount = 0;
        String allLetters = "";

        int sizeOfWords = 0;
        for(String str : strs){
            if(str.length() == 0){
                continue;
            }
            allLetters = allLetters + str;

            sizeOfWords = str.length();
        }

        char allLettersArr[] = allLetters.toCharArray();

        List<List<Character>> unsortedColumns = new ArrayList<>();
        List<List<Character>> sortedColumns = new ArrayList<>();
        //Adding the first column
        for(int i = 0; i<sizeOfWords;i++){
            List<Character> ucolumn = new ArrayList<>();
            List<Character> scolumn = new ArrayList<>();
            for(int j = i; j<allLetters.length();j=j+sizeOfWords){
                ucolumn.add(allLettersArr[j]);
                scolumn.add(allLettersArr[j]);
            }
            unsortedColumns.add(ucolumn);
            Collections.sort(scolumn);
            sortedColumns.add(scolumn);
        }

        for(List<Character> unsorted : unsortedColumns){
            if(!(sortedColumns.contains(unsorted))){
                poppedCount++;
            }
        }


        return poppedCount;
    }
}