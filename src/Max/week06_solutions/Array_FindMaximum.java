package Max.week06_solutions;

public class Array_FindMaximum {
    /*
        Write a function that can find the maximum number from an int Array
     */
    public static void main(String[] args) {

        int[] arr = {1,55,3,79,44,68,47,8};
        System.out.println("maxNum(arr) = " + maxNum(arr));

    }
    public static int maxNum(int[] arr){

        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (result< arr[i]){
                result=arr[i];
            }
        }
        return result;

    }




}
