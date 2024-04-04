package Samira.Week1_solutions;

public class Numbers_DivideWithoutOperator {

     /*
    Write a method that can divide two numbers without using division operator
     */

    public static void divideTwoNumbers(int num1 ,int num2){

        int num3=0;
        if (num1==0 || num2==0){
            System.err.println("invalid number");}
        while (num1>=num2) {
            num1 -= num2;
            num3++;
        }
        System.out.println("The result is "+num3+", the remaining is "+num1);

}

    public static void main(String[] args) {
        divideTwoNumbers(15,3);
    }}