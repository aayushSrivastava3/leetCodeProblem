package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class palindromeNumber {
        public boolean isPalindrome(int x) {
            if(x<0){
                return false;
            }

            ArrayList<Integer> number = new ArrayList<>();

            Boolean flag = false;
            while( x != 0){
                number.add(x%10);
                x = x/10;
            }

            for(int i = 0; i<number.size()/2; i++){
                if(number.get(i) == number.get(number.size()-1-i)){
                    flag = true;
                }else {
                    flag = false;
                }
            }


            return flag;
//            String number = Integer.toString(x);
//
//            System.out.println(number);
//            StringBuilder reverseNum = new StringBuilder(number).reverse();
//
//            System.out.println(reverseNum);
//            if(number.equals(reverseNum.toString())){
//                return true;
//            }
        }
}
