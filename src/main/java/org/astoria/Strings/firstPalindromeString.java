package org.astoria.Strings;

public class firstPalindromeString {

    public boolean isPalindrom(String str) {
        boolean flag = false;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
                flag = true;
            } else {
                return false;
            }
        }

        return flag;
    }

    public String firstPalindrome(String[] words) {
        for (String str : words) {
            if (str.length() == 1) {
                return str;
            }
            if (isPalindrom(str)) {
                return str;
            }
        }

        return "";
    }
}
