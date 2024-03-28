package Mohamed;

public class Numbers_OddOrEven {

   /*
            Write  a method which can identifies given number is even or odd
            EX:
            identify(5) ->  "Odd"
            identify(6) ->  "Even"

        */

    public static void main(String[] args) {

        boolean result = isEven(6);
        System.out.println("the number is Event = " + result);
        result = isOdd(5);
        System.out.println("the number is Odd = " + result);



    }

    public static boolean isOdd(int number) {
        if (number % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }




}
