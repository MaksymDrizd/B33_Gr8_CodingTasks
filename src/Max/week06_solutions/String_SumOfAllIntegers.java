package Max.week06_solutions;

import java.util.Collections;

public class String_SumOfAllIntegers {



    /*
    return the sum of all integers found in the parameter String

            Please implement this method to return the sum of all integers found in the
            parameter String. You can assume that integers are separated from other
            parts with one or more spaces (' ' symbol).

            For example, s="12 some text 3 7", result: 22 (12+3+7=22)
        */
    public static void main(String[] args) {

        String str = "12 some text 3 7";
        System.out.println(sumOfInt(str));
    }

    public static int sumOfInt(String str){

        int result = 0;
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {

            result += Integer.parseInt(arr[i]);
        }


        return result;
    }






}
