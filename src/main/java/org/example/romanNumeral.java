package org.example;

import java.util.HashMap;

public class romanNumeral {

    public void romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        int number=0;
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        char array[] = s.toCharArray();

        int i=0;
        while(i <= array.length-1){
            if(i != array.length-1){
                if(romanMap.get(array[i]) < romanMap.get(array[i+1])){
                    number = number + romanMap.get(array[i+1]) - romanMap.get(array[i]);
                    i = i+2;
                    continue;
                }
            }
            number = number + romanMap.get(array[i]);
            i++;
        }

        System.out.println(number);
    }
}
