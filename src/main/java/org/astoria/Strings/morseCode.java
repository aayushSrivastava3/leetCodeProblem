package org.astoria.Strings;

import java.util.HashSet;
import java.util.Set;

public class morseCode {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCodeVal = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> ansSet = new HashSet<>();

        for (String str : words) {
            String morseCode = "";
            for (int i = 0; i < str.length(); i++) {

                /**
                 * Here are using the int value of the char as index.
                 * We know the 'a' is 97, 'b' is 98 and so on.
                 *
                 * therefore if subtract 97 from the int value of the char we will get the index values of that char in the moreCodeVal array
                 * */
                morseCode += morseCodeVal[(int) str.charAt(i) - 97];
            }
            ansSet.add(morseCode);
        }

        return ansSet.size();
    }
}
