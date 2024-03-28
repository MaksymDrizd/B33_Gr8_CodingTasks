package Max.week01_solutions;

public class Numbers_OddOrEven {

    public static void main(String[] args) {

        int n = 6;
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
