package Max.week03_solutions;

public class Number_Prime {


    /*
        Write a method that can check if a number is prime or not
     */
    public static void main(String[] args) {
        int num = 7;
        System.out.println(isPrime(num));

    }
    public static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
            return false;
        }
        return true;
    }




}
