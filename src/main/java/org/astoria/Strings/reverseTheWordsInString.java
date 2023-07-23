package org.astoria.Strings;

public class reverseTheWordsInString {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for(String str : words){
            sb.append(new StringBuilder(str).reverse());
            sb.append(" ");
        }

        return sb.toString().substring(0, sb.length()-1);
    }
}
