package Audra.week05_solutions;

import java.util.ArrayList;
import java.util.List;

public class String_UniqueCharacters {

    /*
    Write a return method that can find the unique characters from the String
            Ex: unique("AAABBBCCCDEF") ==> "DEF";

     */

    public static void main(String[] args) {

        // Create a string with value
        String str = "AAABBBCCCDEF";

        // Loop through the string
        for (int i = 0; i < str.length(); i++) {
            // Get the current character
            char currentChar = str.charAt(i);

            // if the current character repeats remove it
            if (str.indexOf(currentChar)!= str.lastIndexOf(currentChar)) {
                str = str.replace(currentChar + "", "");
                i--;
            }
        }
        System.out.println("Unique characters: " + str);

        }
//        for (int i = 0; i < str.length(); i++) {
//            if (!list.contains(str.charAt(i))) {
//                list.add(str.charAt(i));
//            }
//        }
//        System.out.println(list);
    }
