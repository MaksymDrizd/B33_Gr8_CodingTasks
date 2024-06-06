package Max.week09_solutions;

import java.util.Arrays;

public class Array_ConcatTwoArrays {

    /*
    Write a return method that can concat two arrays
     */

    public static void main(String[] args) {

        int[] arr1 = {1,6,8,31,72,24,62,72};
        int[] arr2 = {65,3,7,5,32,14};

        int[] combinedArr = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            combinedArr[i]=arr1[i];
        }
        for (int i = arr1.length; i < combinedArr.length; i++) {
            combinedArr[i]= arr2[i - arr1.length];
        }
        System.out.println(Arrays.toString(combinedArr));

    }






}
