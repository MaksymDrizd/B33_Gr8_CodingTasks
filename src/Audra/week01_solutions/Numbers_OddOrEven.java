package Audra.week01_solutions;

public class Numbers_OddOrEven {
    public static void main(String[] args) {
        /*
            Write  a method which can identifies given number is even or odd
            EX:
            identify(5) ->  "Odd"
            identify(6) ->  "Even"

        */

        boolean result = isOdd(5);
        System.out.println(result);
        result = isEven(6);
        System.out.println(result);
    }

    public static boolean isOdd(int num1) {

        boolean result;
        if (num1 % 2 != 0) {
            return result = true;
        } else {
            return result = false;
        }

    }

    public static boolean isEven(int num1) {

        boolean result;
        if (num1 % 2 == 0) {
            return result = true;
        } else {
            return result = false;
        }
    }
}
