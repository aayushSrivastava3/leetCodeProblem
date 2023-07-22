package org.example;

import java.io.InterruptedIOException;
import java.util.ArrayList;

public class reverseInt {
    public int reverse(int x) {

        String number = Integer.toString(x);
        StringBuilder rev = new StringBuilder(number).reverse();
        int ans=0;
        try{
            ans = Integer.parseInt(rev.toString().replaceAll("[^0-9]",""));
        }catch(NumberFormatException err){
            return 0;
        }

        System.out.println(ans);

        return ans;
    }
}
