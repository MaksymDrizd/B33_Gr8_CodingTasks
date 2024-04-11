package Svetlana.week3_tasks;

public class Number_Prime {

    /*
        Write a method that can check if a number is prime or not
     */

    public static void main(String[] args) {
        int num = 3;
        System.out.println(isPrime(num));

    }
    public static boolean isPrime(int num){
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

}



