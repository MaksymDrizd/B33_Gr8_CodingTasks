package Max.week03_solutions;

import java.util.Collection;
import java.util.Collections;

public class Number_ReverseInteger {

/*
Write a return method that can reverse
negative number and return it as int
 */
public static void main(String[] args) {
    int num = -124235252;
    System.out.println(reverseNegativeNum(num));
}

    public static int reverseNegativeNum(int num){
        int result = 0;
        while (num != 0){
            result = (result * 10) + (num % 10);
            num /= 10;

        }
        return result;
    }



}
