package AnnaP.week07_solutions;

import java.util.Arrays;

public class Array_SortInDescendingOrder {

    /*
        Write a return method that can sort an int array in descending order without using the sort method
     */

    public static void main(String[] args) {


        int[] numbers = {30, 40, 50, 60, 70};
        int[] result = reversedArray(numbers); // call method -> pass the argument,which is given numbers elements -> assign                                        to result to return the int result.

        System.out.println(Arrays.toString(result)); // to display array result elements use toString method
    }
         /*
    1.Create method to reverse an int array and return it
    2.Create an array variable named reversedArray
     */
        public static int[] reversedArray ( int[] array){
        /* to be able to reverse an array the metjod must have the array itself                                               // in the scobe.
        // int[] reversedArray = new int[]  // to make sure this array is capable enough to have all the elements of the                                        //given array we will instantiate this array. i need to set the length of                                        //this array which determines how many element this array can have.*/
        /*
        How can you ensure that the new array can accommodate all the elements from the given array?
      3.For that we will assign the given array's length to this array's length. |
                                                                                 V
         */

            int[] reversedArray = new int[array.length];  //the lenght of given array will be the same as new array. But by     default it will be 0's as the elements. if [5] than 5 0's etc.
        /*
        4.I need to get every single elements of given array from last index to first index and to store them in to indexes off this new array. But i cannot use for each loop because i don't have access to the index numbers and for each loop iterates the elements starting ffrom the first element to the last not reversed as we need in this task.

        So in order to get the elements in the reversed order i need to access the index number of given array and also need to use the index number of the second array because i want to update the elements of the second array too.
        So in this task you can not use for each loop.

        But we already know the loop that can get the elements of the array in the reverse order.

        5.Create the loop that can get the reverse index orders using the shortcut array.forr
         */

            for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            /*
            so this i now is representing the index number of given array starting from last to the first. Now im able to use this i as the index number to get the elements from last to first  " array[i] "
             */
                reversedArray[j] = array[i]; // this element "  array[i]; "  needs to be assigned to the index 0 of this new                                 array.

           /*
           6.Now i need to use another variable "j" which will be representing the index number of this new array starting from zero till the last index numbers.

            7. After the loop i will have the reversed array and then i will be able to return  that array from this  method*/

            }
            return reversedArray;
        }
        /*
        8. Now let me call this method from the main method's body.
       */

        //9. Same method for double array
/*
        public static double[] reversedArray ( double[] array){
            if (array.length <= 1) {
                return array;
            }
            double[] reversedArray = new double[array.length];
            for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
                reversedArray[j] = array[i];
            }
            return reversedArray;

        }
        public static String[] reversedArray (String[]array)
        { // to replace double to String in method highlight  the lines from public... to length before loop , then hold command + R. In search bar input present DT to replace String, then press replace all.
            if (array.length <= 1) {
                return array;
            }
            String[] reversedArray = new String[array.length];
            for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
                reversedArray[j] = array[i];
            }
            return reversedArray;

        }
*/




    }
