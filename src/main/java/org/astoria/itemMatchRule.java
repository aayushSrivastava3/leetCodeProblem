package org.astoria;

import java.util.HashMap;
import java.util.List;

public class itemMatchRule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        HashMap<String, Integer> rule = new HashMap<>();

        rule.put("type",0);
        rule.put("color",1);
        rule.put("name",2);
        int count = 0;
        for(List<String> str : items){
            if(str.get(rule.get(ruleKey)).equals(ruleValue)){
                count++;
            }
        }

        return count;
    }
}
