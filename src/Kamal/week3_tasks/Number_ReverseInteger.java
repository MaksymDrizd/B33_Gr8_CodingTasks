package Kamal.week3_tasks;

public class Number_ReverseInteger {
    public static void main(String[] args) {
        /*
       this methode takes an integer as input and returns its result
       it handeles both positive and negative integers
         */

        // declare the negative integer number
        int num = -54134; // -43145

        // declare the reverse integer number with default value 0 to store the result the reverse on it
        int reverse = 0;

        // use the while loop to reverse the integer
        while (num != 0) { // while num is not egale a zero

            reverse = reverse * 10 + num % 10;

            num /= 10;
        }

        System.out.println("reverse num is : " + reverse);
    }

    /*
Write a return method that can reverse
negative number and return it as int
 */
}
