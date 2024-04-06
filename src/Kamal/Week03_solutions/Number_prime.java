package Kamal.Week03_solutions;

public class Number_prime {
    public static void main(String[] args) {
        //prime numbers are those numbers which are divisible only by itself and 1

        // declare variables int num
        int num = 20;

        // declare variable boolean isPrime for check if num is prime
        boolean isPrime = true;

        // declare variable int i for loop strat with 2 because we know the prime number gets divided by 1 and itself
        for (int i = 2; i < num; i++) {
            // if num is divisible by i, then num is not prime
            if (num % i == 0) {
                isPrime = false;
                break;

            }
        }

        // if num is prime, then print num
        if (isPrime) {
            System.out.println(num + " is prime");
        } else {
            System.out.println(num + " is not prime");
        }




    }

    /*
        Write a method that can check if a number is prime or not
     */

}
