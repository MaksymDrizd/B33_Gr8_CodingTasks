package Samira.Week1_solutions;

public class Numbers_OddOrEven {

     /*
    Write  a method which can identifies given number is even or odd
        EX:
        identify(5) ->  "Odd"
        identify(6) ->  "Even"

     */

    public static void oddOrEven(int num) {
        if (num%2== 0) {
            System.out.println("The number "+num+" is Even");
        } else {
            System.out.println("The number "+num+" is Odd");
        }
    }
    public static void main(String[] args) {


        oddOrEven(5);



    }
}
