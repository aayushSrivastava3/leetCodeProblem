package org.astoria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class numberOfSeniorCitizens {

    public double[] temp(double celcius){
        return new double[]{celcius*2, celcius*3};
    }
    public int countSeniors(String[] details) {

        int count=0;
        for(String str : details){
            if(Integer.parseInt(str.substring(11,13)) >60){
                count++;
            }
        }

        return count;
    }

    public int minimumSum(int num) {
        ArrayList<Integer> digits = new ArrayList<>();

        while(num > 0){
            digits.add(num%10);
            num /=10;
        }

        Collections.sort(digits);

        int num1 = digits.get(1)*10+ digits.get(2);
        int num2 = digits.get(0)*10+ digits.get(3);


        return num1+num2;

    }
    public String sortSentence(String s) {
        String[] strings = s.split(" ");
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, String> hm = new HashMap<>();

        for(String str : strings){
            hm.put(Character.getNumericValue(str.charAt(str.length()-1)), str.substring(0, str.length()));
        }

        for(int i=0; i<strings.length; i++){
            sb.append(hm.get(i));
            sb.append(" ");
        }

        return sb.toString();
    }


        public String decodeMessage(String key, String message) {
        HashMap<Character, Character> keyMap = new HashMap<>();

        char alp = 'a';
        for(int i =0; i<key.length(); i++){
            if(key.charAt(i) == ' ' || keyMap.containsKey(key.charAt(i))){
                continue;
            }else {
                keyMap.put(alp,key.charAt(i));
                alp++;
            }
        }
        StringBuilder sb = new StringBuilder();

        for(int i =0; i<message.length(); i++){
            if(message.charAt(i) == ' '){
                sb.append(' ');
            }else {
                sb.append(keyMap.get(message.charAt(i)));
            }
        }
        return sb.toString();
    }
}
