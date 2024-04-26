package Max.week05_solutions;

public class String_Reverse {

    /*
    Write a function that can reverse String
        Ex: Reverse("ABCD"); ==> DCBA
     */

    public static void main(String[] args) {

        String str = "ABCD";
        String reversed ="";

        for (int i = str.length() -1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println(reversed);
    }


}
