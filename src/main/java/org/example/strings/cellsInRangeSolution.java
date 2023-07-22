package org.example.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class cellsInRangeSolution {
    /**
     * The following program returns the list of cells that come in passed ranges
     *
     * Example -> cellsInRange("K1:L2")
     * Output -> List<String> => ["K1","K2","L1","L2"]
     *
     * Max runtime -> 3ms
     */
    public List<String> cellsInRange(String s) {
        //Initiating ans list
        ArrayList<String> ans = new ArrayList<>();

        //We need the range values
        String[] range = s.split(":");

        //We will add the initial starting point of the range
        ans.add(range[0]);

        //We will run till we get to the final point in the range
        while (!(ans.get(ans.size() - 1).equals(range[1]))) {

            //Our current position will be the last element we add to the list
            String currentCell = ans.get(ans.size() - 1);

            //We will append the values of the next cell in a string builder
            StringBuilder nextCell = new StringBuilder();

            /**
             * We will first check the row number in the column since we can traverse down in column till we reach the
             * row number in the target.
             *
             * If the row number matched we will move to the next column
             *
             * Example -> Range -> ["K1","L2"]
             * explanation -> we start from K1 that's first row in column K. then we move down from K1 to K2
             *                we can now see that the current row number(2) matches the target row number of L2.
             *                therefore we move to next column K->L.
             *                New current is now L1. but its not the target therefore we move down in K column.
             * */

            //If the row number of the current cell do not match the target cell number we move down
            if (currentCell.charAt(1) != range[1].charAt(1)) {
                nextCell.append(currentCell.charAt(0));
                //Add 1 to the current cell row number [Moving down].
                nextCell.append(Character.getNumericValue(currentCell.charAt(1)) + 1);
                //We add the next cell to the ans list.
                ans.add(nextCell.toString());
            } else {     //If the number matches we move to the next column
                //We take the char's int value and increment it by 1 and then covert it back to char
                nextCell.append((char) ((int) currentCell.charAt(0) + 1));


                /**
                 * Note we cannot go back to the first row of the next column we have to move the row number in the initial
                 * cell.
                 *
                 * Say the Range mentioned is ["K5","L6"] -> we cannot go from K5 -> L1.
                 * we have to move to L5 rather than L1.
                 *
                 *
                 * Therefore, we initiate the next column with incremented Char along with the row number from the initial range.
                 *
                 * */
                nextCell.append(Character.getNumericValue(range[0].charAt(1)));
                ans.add(nextCell.toString());
            }
        }

        return ans;
    }
}
