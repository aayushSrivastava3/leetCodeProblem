package org.astoria;

public class plusOne {
    public int[] plusOneMethod(int[] digits) {

        int carry = 0;
        if(digits[digits.length -1 ] == 9){
            System.out.print("uuu");
            digits[digits.length -1 ] = 0;
            carry = 1;
        }else{
            digits[digits.length -1]++;
        }

        for(int i=digits.length-2; i>=0; i++){
            if(digits[i] == 9 && carry == 1){
                digits[i] = 0;
                carry = 1;
            }else if(digits[i] != 9 && carry ==1 ){
                digits[i]++;
                carry = 0;
            }else {
                break;
            }
        }

        if(carry == 1){
            int[] result = new int[digits.length+1];  //resultant array of size first array and second array
            System.arraycopy(new int[] {1}, 0, result, 0, 1);
            System.arraycopy(digits, 0, result, 1, digits.length);
            return result;
        }

        return digits;

//        String num = "";
//
//        StringBuilder ans = new StringBuilder();
//        for(int i : digits){
//            num += Integer.toString(i);
//        }
//
//        int carry=0;
//        if(num.charAt(num.length()-1) == '9'){
//            ans.append('0');
//            carry = 1;
//        }else{
//           ans.append(Integer.parseInt(String.valueOf(num.charAt(num.length()-1)))+1);
//        }
//        for(int i=num.length()-2;i>=0;i--){
//            if(num.charAt(i) == '9' && carry == 1){
//                ans.append(0);
//                carry = 1;
//            } else if (num.charAt(i) !=9 && carry == 1) {
//                ans.append(Integer.parseInt(String.valueOf(num.charAt(i)))+1);
//            }else{
//                ans.append(num.charAt(i));
//            }
//        }
//
//        if(carry == 1 && num.charAt(0) == '9'){
//            ans.append('1');
//        }
//        List<String> arr = Arrays.asList(ans.reverse().toString().split(""));
//
//        System.out.print(arr);
//        return arr.stream().mapToInt(i -> Integer.parseInt(i)).toArray();
    }
}
