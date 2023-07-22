package org.example.strings;

public class countAstrisks {
    public int countAsterisksFirst(String s) {
        //Split into array on basis of | sign
        String[] strs = s.split("\\|");
        int sum = 0;

        //Only iterate for Odd iterations
        for (int i = 0; i < strs.length; i += 2) {
            sum += strs[i].length() - strs[i].replaceAll("\\*", "").length();
        }
        return sum;
    }

    public int countAsterisksUsingModulo(String s){
        int count=0;
        int pipeCount=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '|'){
                //We will track the pipecount
                pipeCount++;
            }
            //We will count astrisk only when the pipecount is even
            if(pipeCount % 2 == 0 && s.charAt(i) == '*'){
                count++;
            }
        }

        return count;
    }

    //Fastest
    public int countAsterisksUsingFlag(String s){
        int count = 0;
        int len = s.length();
        // To track whether we are in an even pipeCount section
        boolean inEvenSection = true;

        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);

            if (ch == '|') {
                // Toggle the inEvenSection flag when encountering '|'
                inEvenSection = !inEvenSection;
            } else if (ch == '*' && inEvenSection) {
                count++;
            }
        }

        // Final result is stored in 'count'
        return count;

    }


}
