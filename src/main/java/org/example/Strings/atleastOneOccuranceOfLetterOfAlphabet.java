package org.example.Strings;

public class atleastOneOccuranceOfLetterOfAlphabet {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26){
            return false;
        }

        String ans = "abcdefghijklmnopqrstuvwxyz";
        boolean flag = false;
        for(int i=0; i<26;i++){
            if(sentence.indexOf(ans.charAt(i)) != -1){
                flag = true;
            }else return false;
        }

        return flag;
    }
}
