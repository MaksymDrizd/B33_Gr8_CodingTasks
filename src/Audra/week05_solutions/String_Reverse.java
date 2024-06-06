package Audra.week05_solutions;

public class String_Reverse {

    /*
    Write a function that can reverse String
        Ex: Reverse("ABCD"); ==> DCBA
     */

    public static void main(String[] args) {

        // Creating string with value
        String str1 = "ABCD";
        //Creating new empty string
        String reverse1 = "";

        //Looping through the string
        for (int i = str1.length() - 1; i >= 0; i--) {
            //Adding each character to the new string
            reverse1 += str1.charAt(i);
        }
        //Printing out the reverse1
        System.out.println(reverse1);

    }

      // Creating static method with parameters
//    private static void reverseString(String str) {
//        // Creating new empty string
//        String reverse = "";
//
//        // Looping through the string
//        for (int i = str.length() - 1; i >= 0; i--) {
//
//            // Adding each character to the new string
//            reverse = reverse + str.charAt(i);
//        }
//        System.out.println(reverse);
//    }


}
