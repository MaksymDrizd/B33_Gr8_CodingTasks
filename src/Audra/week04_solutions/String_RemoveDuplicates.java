package Audra.week04_solutions;

public class String_RemoveDuplicates {
    /*
    Write function that can remove the duplicated values from String
            Ex: removeDup("AAABBBCCC") ==> ABC
     */

    public static void main(String[] args) {

        String str = "AAABBBCCC";

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == str.charAt(i+1)){
                str = str.substring(0, i) + str.substring(i+1);
                i--;
            }
        }
    }



}
