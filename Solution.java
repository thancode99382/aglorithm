import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
     public int[] plusOne(int[] digits) {
            
            for (int i = digits.length - 1 ; i >=0 ; i--) {
                    if( digits[i] <9){
                            digits[i]++; 
                            return digits;
                    }

                    digits[i] = 0;
            }



            int[] result = new int[digits.length + 1];
             result[0] = 1;

             return result;

    }

    public static void main(String[] args) {
        int[] digits = { 9,9,9 };

        Solution solution = new Solution();
        int[] result = solution.plusOne(digits);

        System.out.println(Arrays.toString(result));

        

    }
}