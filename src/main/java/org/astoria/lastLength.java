package org.astoria;

public class lastLength {
    String s;
    public void lastLength(){

    }

    /**
     * Question -> https://leetcode.com/problems/length-of-last-word/
     *
     * This method will return the length of the last word in the sentance
     *
     * Trick -> Start from the trimmed end of the string and increase the index till you find a ' ' character or the word ends
     *
     * Example ->
     * 1. input string = "Hello World", output should be 5
     * 2. input string = "   fly me   to   the moon  ", output should be 4
     *
     * */
    public int lengthOfLastWord(String s) {

        //Say if the inputted string is "a" then it should not run the while loop and return 1
        if(s.length() == 1 ){
            return 1;
        }

        //Need to remove the whitespace before and after the letter
        String str = s.trim();

        //Initiate the index as 0 -> will increase as the word increases
        int index=0;

        /**
         * 2 conditions need to be satisfied to enter the loop.
         *
         * Condition 1 : The checking index number must not be negative
         *  example -> say the input string is "day" then we will start from y and move back checking for ' ' char,
         *  but it will not find even when it reaches d. then next check will be str.length()-1-index
         *  now that the index = length of the string check index will be -1 which is an exception.
         *
         *
         * Condition 2: The char at index must not be ' '
         *  the moment it matches the loop will exit and the final index value is the length of final word in the sentence
         * */
        while(str.length()-index-1 >=0 && str.charAt(str.length()-index-1) != ' '){
            //If both condition match we will increment the index.
            index++;
        }
        return index;
    }
}
