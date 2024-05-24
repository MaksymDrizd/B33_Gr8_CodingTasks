package AnnaP.week07_solutions;

import static java.lang.Math.min;

public class Array_FindMinimum {

    public static void main(String[] args) {

        //int num2 = min(10, 45);
        //System.out.println("Minimum number is " + num2);

        int[] x = {5,67,3,11,20};

        System.out.println(minValue(x));


    }
    public static int minValue(int[] numbers) { //The function minValue takes an integer array numbers as input.
        if (numbers == null || numbers.length == 0) { // It first checks if the array is null or empty. If it is, it prints "Array is empty" and returns 0.
            System.out.println("Array is empty");
            return 0;
        }

        //{5,67,3,11,20}
        int min = numbers[0]; //f the array is not empty, it initializes a variable min with the first element of the array (numbers[0]).
        for (int number : numbers) { //It then iterates through each element of the array using a for-each loop. For each element, it checks if it is smaller than the current minimum value (min).
            if (number < min){ // If the condition is true, it means that the current element is smaller than the current minimum value, so it updates min with the new minimum value.
                min = number;

            }
        }
        return min; //After iterating through all the elements, the function returns the minimum value (min).

}
}

/*
    Write a function that can find the minimum number from an int Array
     */