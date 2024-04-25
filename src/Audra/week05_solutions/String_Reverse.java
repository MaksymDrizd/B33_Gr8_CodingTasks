package Audra.week05_solutions;

public class String_Reverse {

    /*
    Write a function that can reverse String
        Ex: Reverse("ABCD"); ==> DCBA
     */

    public static void main(String[] args) {

        String str = "ABCD";
        //Calling the reverse method
        reverseString(str);
    }

    private static void reverseString(String str) {
        // Creating new empty string
        String reverse = "";

        // Looping through the string
        for (int i = str.length() - 1; i >= 0; i--) {

            // Adding each character to the new string
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);
    }


}
