package Svetlana.week1_tasks;

import java.util.Scanner;

public class Number_OddOrEven {

    /*
    Write  a method which can identifies given number is even or odd
        EX:
        identify(5) ->  "Odd"
        identify(6) ->  "Even"

     */
    public static void main(String[] args) {
        int n = 7;
        evenOrOdd(n);


    }
    /*
    Write  a method which can identifies given number is even or odd
        EX:
        identify(5) ->  "Odd"
        identify(6) ->  "Even"
     */
    public static void evenOrOdd(int n){
        String evenOrOdd = (n % 2 == 0) ? "Even":"Odd";
        System.out.println(("Number "+ n + " is " + evenOrOdd));
    }
}

