package Audra.week09_solutions;

import java.util.Arrays;

public class Array_ConcatTwoArrays {

    /*
    Write a return method that can concat two arrays
     */

    public static void main(String[] args) {

        // create two arrays and initialize
        int[] arrNum = {1, 2, 3};
        int[] arrNum2 = {4, 5, 6};

        int[] arrResult = concatTwoArrays(arrNum, arrNum2); // calling the concatTwoArrays method
        System.out.println(Arrays.toString(arrResult));

        // create for loop and iterate over arrResult
//        for (int i = 0; i < arrResult.length; i++) {
//            // print the concat result to console
//            System.out.print(arrResult[i] + " ");
//        }
    }

    public static int[] concatTwoArrays(int[] arrNum, int[] arrNum2) {
        // create a new array with length of arrNum + arrNum2
        int[] arrResult = new int[arrNum.length + arrNum2.length];

        // iterate over arrNum and add it to arrResult array
        for (int i = 0; i < arrNum.length; i++) {

            arrResult[i] = arrNum[i];
        }

        // iterate over arrNum2 and add it to arrResult array
        for (int i = 0; i < arrNum2.length; i++) {

            arrResult[i + arrNum.length] = arrNum2[i];
        }

        return arrResult;
    }



}
