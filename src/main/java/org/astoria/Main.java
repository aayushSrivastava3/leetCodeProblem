package org.astoria;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public int subtractProductAndSum(int n) {
        int sum=0;
        int product=1;
        int digit =0;
        while (n > 0) {
            digit = n%10;
            sum += digit;
            product *= digit;
            n/=10;
        }

        String ans = "....";

        if(ans.charAt(0) == '.');

        return Math.abs(product-sum);

    }

    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < nums.length; i += 2) {
            int freq = nums[i];
            int val = nums[i+1];
            for(int j=0; j<=freq;j++){
                arrayList.add(val);
            }
        }

        return arrayList.stream().mapToInt(i -> i).toArray();
    }



    public int[] createTargetArray(int[] nums, int[] index) {
        int[] ans = new int[nums.length];
        ArrayList<Integer> anslist = new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            anslist.add(index[i], nums[i]);
        }

        for(int i=0; i<nums.length;i++){
            ans[i] = anslist.get(i);
        }

        return ans;
    }

    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            if((int) s.charAt(i) <97){
                sb.append((char) ((int) s.charAt(i)+32));
            }else {
                sb.append(s.charAt(i));
            }
        }

        String ans = s.replaceAll("[A-Z]","[a-z]");

        return sb.toString();
    }






    public static void main(String[] args) {
        System.out.println((int) 'A');
        System.out.println((int) 'Z');
    }
}