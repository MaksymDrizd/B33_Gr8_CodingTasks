package Max.week01_solutions;

public class Numbers_DivideWithoutOperator {

    public static void main(String[] args) {
        int num1 = 17;
        int num2 = 4;
        division(num1,num2);



    }
    public static void division(int num1, int num2){
        int count = 0;
        if (num2 == 0){
            System.err.println("CANNOT BE DIVIDED BY ZERO");
            System.exit(1);
        } //    1       4
        while (num1 >= num2) {//false and ext the loop
            num1 -= num2; //17 - 4 = 13, 13-4=9, 9-4=5, 5-4=1
            count++;//1, 2, 3,4

        }
        System.out.println("result is " + count + " reminder is  " + num1);

    }

    /*
    Write a method that can divide two numbers without using division operator
     */
}
