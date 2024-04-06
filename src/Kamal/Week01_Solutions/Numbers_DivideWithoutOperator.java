package Kamal.Week01_Solutions;

import java.util.Scanner;

public class Numbers_DivideWithoutOperator {
    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 5;
        int count = 0;

        if (firstNumber > secondNumber) {
            firstNumber = firstNumber - secondNumber  ;
            count++;
        } else if (secondNumber > firstNumber) {
            secondNumber = firstNumber - secondNumber;
        }


    }
}
/*
    Write a method that can divide two numbers without using division operator
     */
