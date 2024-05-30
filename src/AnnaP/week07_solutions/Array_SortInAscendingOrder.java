package AnnaP.week07_solutions;

public class Array_SortInAscendingOrder {

    /*
    Write a method that can sort an int array in Ascending order without using the sort method

     */
    public static void main(String[] args) {
        int[] list = {67, 5, 34, 65, 12, 32};
        list = sortArray(list); //sortArray method is responsible for sorting the array in ascending order.
        // print the sorted array
        for (int num : list) {  //the sorted array is assigned back to the list variable, and then it is printed using a for-each loop.
            System.out.print(num + " ");
        }
    }
    public static int[] sortArray(int[] list) { //sortArray that sorts an integer array in ascending order.Sort algorithm works by repeatedly swapping adjacent elements if they are in the wrong order.
        int n = list.length; //The method sortArray takes an integer array list as input. It initializes a variable n with the length of the array
        for (int i = 0; i < n - 1; i++) { //The outer loop runs from index 0 to n - 1, where n is the length of the array. This loop represents the number of passes needed to sort the entire array.
            for (int j = 0; j < n - i - 1; j++) { //The inner loop runs from index 0 to n - i - 1, where i is the current pass number. This loop compares adjacent elements and swaps them if they are in the wrong order.
                if (list[j] < list[j + 1]) { // for descending order change the greater sign to less sign
                    // swap list[j] and list[j+1]
                    int temp = list[j]; //
                    list[j] = list[j + 1];
                    list[j + 1] = temp;

                    //Inside the inner loop, the condition if (list[j] > list[j + 1]) checks if the current element (list[j]) is greater than the next element (list[j + 1]). If it is, the elements are swapped using the following three lines of code:
                    //int temp = list[j];
                    //list[j] = list[j + 1];
                    //list[j + 1] = temp;
                }
            }
        }
        return list;
    }
}



