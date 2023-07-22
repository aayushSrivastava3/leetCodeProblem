package org.example;

public class shuffleString {
    public String restoreString(String s, int[] indices) {
        StringBuilder sb = new StringBuilder(s);

        for(int i=0; i<indices.length; i++){
            System.out.println(i);
            sb.setCharAt(indices[i], s.charAt(i));
        }
        return sb.toString();

    }
}
