package org.astoria;

public class mySqrt {

    /**
     * The following method will return the nearest integer value for the square root of the number
     * Without using builtin Math.pow utility
     *
     * Example ->
     *
     * 1. input int = 4 -> output 2
     * 2. input int = 8 -> output 2 because square root of 8 is 2.82842... therefore int value is 2
     *
     *
     * Trick/Logic -> The basis of this is binary search from the middle.
     * */
    public int mySqrtMethod(int x) {

        //First check if the number is 0 or not if zero then return 0
        if(x == 0){
            return 0;
        }

        /**
         * We begin the binary search by initiating the first number as 1 and the last as the max int
         * since we know the squareroot is within this range
         * we will reduce this range in each iteration
         *
         * */
        int firstNum = 1;
        int lastNum = x;

        int ans = 0;

        while(lastNum >= firstNum){

            int middleVal = firstNum + (lastNum-firstNum)/2;
            if(middleVal == x/middleVal){
                return middleVal;
            } else if(middleVal > x/middleVal){
                lastNum = middleVal-1;
            } else {
                firstNum = middleVal+1;
                ans = middleVal;
            }
        }

        return ans;
    }
}
