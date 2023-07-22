//package org.example;
//
//public class validPalindrome {
//    public boolean isPalindrome(String s) {
//        String check= s.toLowerCase().replaceAll("[^a-z0-9]","");
//        if(s.length()==0){
//            return true;
//        }
//
//        int right = s.length()-1;
//        boolean flag = false;
//
//        String subString = s.replace(s.charAt(0),'0');
//        for (int i=0; i<check.length()/2;i++){
//            if(check.charAt(i) == check.charAt(check.length()-1-i)){
//                flag = true;
//            }else {
//                return false;
//            }
//        }
//
//        for(int i=0; i<s.length(); i++){
//            String newStr = new StringBuilder(s).deleteCharAt(i).toString();
//            if(isPalindrome(newStr)){
//                return true;
//            }
//        }
//
//        return flag;
//
//        if(check.equals(new StringBuilder(check).reverse().toString())){
//            return true;
//        }else {
//            return false;
//        }
//    }
//}
