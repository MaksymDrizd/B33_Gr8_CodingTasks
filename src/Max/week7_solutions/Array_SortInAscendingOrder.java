package Max.week7_solutions;

import java.util.Arrays;

public class Array_SortInAscendingOrder {

    /*
    Write a method that can sort an int array in Ascending order without using the sort method
     */
    public static void main(String[] args) {
        int [] arr = {10,42,8,25,4,22,12};
        sortAscending(arr);
        System.out.println("Ascending order = " + Arrays.toString(arr));
    }
    public static void sortAscending(int [] arr1){
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length - 1; j++) {
                if (arr1[j]>arr1[j + 1]){
                    int temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }
        }
    }






}
