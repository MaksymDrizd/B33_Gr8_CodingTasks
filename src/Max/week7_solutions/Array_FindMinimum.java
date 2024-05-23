package Max.week7_solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array_FindMinimum {

    /*
    Write a function that can find the minimum number from an int Array
     */
    public static void main(String[] args) {
        int [] arr = {10,5,8,35,36,42,73};
        int result = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < result){
                result = arr[i];
            }
        }
        System.out.println(result);

    }







}