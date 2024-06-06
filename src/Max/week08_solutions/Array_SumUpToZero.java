package Max.week08_solutions;

import java.util.Arrays;

public class Array_SumUpToZero {

    /*
    Write a function:
    that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
    The function can return any such array.
    For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
    The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice).
    For N = 3 one of the possible answers is [-1,0,1] (but there are many more correct answers).
     */
    public static void main(String[] args) {

        int n = 15;

        int[] arr = new int[n];



        for (int i = 1; i < arr.length; i++) {
            if (i % 2 != 0){
                arr[i - 1] = i + 1;
            }else{
                arr[i -1]= -(arr[i - 2]);
            }
        }
        arr[arr.length - 1] = -(arr[arr.length - 2]);
        if (n % 2 != 0){
            arr[arr.length - 1] = 0;
        }
                System.out.println(Arrays.toString(arr));



    }






}
