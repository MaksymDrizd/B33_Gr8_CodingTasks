package Max.week01_solutions;

public class Numbers_DivideWithoutOperator {

    public static void main(String[] args) {
        int num1 = 16;
        int num2 = 4;
        System.out.println(num1 +" / " + num2 + " = " + division(num1, num2));


    }
    public static int division(int num1, int num2){
        int count = 0;
        if (num2 == 0){
            System.err.println("CANNOT BE DIVIDED BY ZERO");
            System.exit(1);
        }
        while (num1 >= num2){
            num1 -= num2;
            count++;
        }
        return count;
    }

    /*
    Write a method that can divide two numbers without using division operator
     */
}
