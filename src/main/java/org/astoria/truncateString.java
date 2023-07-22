package org.astoria;

public class truncateString {
    public String truncateSentence(String s, int k) {
        int spaceCount=0;
        String ans = "";
        for(int i=0; i<s.length();i++){
            if(s.charAt(i) == ' '){
                spaceCount++;
            }

            if(spaceCount == k){
                break;
            }
            ans += s.charAt(i);
        }

        return ans;
    }

    public String truncateSentenceFaster(String s, int k) {
        String[] words = s.split(" ");
        String ans = "";
        for(int i=0; i<k;i++){
            ans += ' ';
            ans += words[i];
        }

        return ans.substring(1);
    }
}
