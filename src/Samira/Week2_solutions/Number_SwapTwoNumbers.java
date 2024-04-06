package Samira.Week2_solutions;

public class Number_SwapTwoNumbers {

     /*
    Swap two variable values without using a third variable
     */

    public static void main(String[] args) {

        int num1 = 4;
        int num2= 5;
        num2 = num1 + num2;
        num1 = num2 - num1;
        num2 = num2 - num1;

        System.out.println(num1);
        System.out.println(num2);

    }
}
