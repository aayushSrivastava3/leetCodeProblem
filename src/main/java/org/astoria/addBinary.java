package org.astoria;

public class addBinary {
    public String addBinary(String a, String b) {
        String test = "Test";
        StringBuilder str1 = new StringBuilder(a);
        StringBuilder str2 = new StringBuilder(b);
        int sizeDif = Math.abs(a.length() - b.length());

        StringBuilder reverseStr1 = str1.reverse();
        StringBuilder reverseStr2 = str2.reverse();

        if(a.length()>b.length()){
            for(int i=0;i<sizeDif;i++){
                reverseStr2.append("0");
            }

        } else if (b.length() > a.length()) {
            for(int i=0;i<sizeDif;i++){
                reverseStr1.append("0");
            }

        }

        int carry = 0;
        StringBuilder ans = new StringBuilder();

        for(int i=0; i<str2.length(); i++){
            if(reverseStr1.charAt(i) == '1' && reverseStr2.charAt(i) == '1' && carry == 0){
                
                ans.append('0');
                carry = 1;
            } else if (reverseStr1.charAt(i) == '1' && reverseStr2.charAt(i) == '0' && carry == 0) {
                ans.append('1');
                carry = 0;
            } else if (reverseStr1.charAt(i) == '1' && reverseStr2.charAt(i) == '0' && carry == 1) {
                ans.append('0');
                carry = 1;
            } else if (reverseStr1.charAt(i) == '1' && reverseStr2.charAt(i) == '1' && carry == 1) {
                ans.append('1');
                carry = 1;
            } else if (reverseStr1.charAt(i) == '0' && reverseStr2.charAt(i) == '1' && carry == 0) {
                ans.append('1');
                carry = 0;
            } else if (reverseStr1.charAt(i) == '0' && reverseStr2.charAt(i) == '1' && carry == 1) {
                ans.append('0');
                carry = 1;
            }else if (reverseStr1.charAt(i) == '0' && reverseStr2.charAt(i) == '0' && carry == 0) {
                ans.append('0');
                carry = 0;
            }else if (reverseStr1.charAt(i) == '0' && reverseStr2.charAt(i) == '0' && carry == 1) {
                ans.append('1');
                carry = 0;
            }
        }

        if(carry>0){
            ans.append('1');
        }
        return ans.reverse().toString();
    }}
