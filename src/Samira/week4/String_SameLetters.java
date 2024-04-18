package Samira.week4;

import java.util.Arrays;

public class String_SameLetters {

    // Write a return method that check if a string is build out of the same letters as another string.
    // Ex:  same("abc",  "cab"); -> true

    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = "cab";

        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }


    }
}
