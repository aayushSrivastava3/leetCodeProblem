package org.astoria.Strings;

import java.util.ArrayList;
import java.util.List;

public class splitString {
    public static List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> ans = new ArrayList<>();

        for(String str : words){
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<str.length(); i++){

                //Iterate till we reach the separator
                if(str.charAt(i) == separator){
                    if(sb.length() !=0 ){
                        ans.add(sb.toString());
                    }
                    sb.setLength(0);
                }else sb.append(str.charAt(i));

                //IF separator not found and we iterate till the end of the string
                if(i == str.length()-1){
                    ans.add(sb.toString());
                }

            }
        }

        return ans;
    }
}
