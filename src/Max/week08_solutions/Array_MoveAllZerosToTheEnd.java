package Max.week08_solutions;

import java.util.*;

public class Array_MoveAllZerosToTheEnd {

    /*
    write a program that can move all the zeros to the end of an array
     */

    public static void main(String[] args) {
        int[] arr = {0,6,8,0,2,3,0,6,7};
        moveZerosToTheEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void moveZerosToTheEnd(int[] arr){
        
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0){
                int temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                count++;
            }
        }
        
    }




}
