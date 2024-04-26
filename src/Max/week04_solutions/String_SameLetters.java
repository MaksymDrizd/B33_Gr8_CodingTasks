package Max.week04_solutions;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class String_SameLetters {

    // Write a return method that check if a string is build out of the same letters as another string.
    // Ex:  same("abc",  "cab"); -> true



    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = "cab";

            if (!(str1.length() == str2.length())) {
                System.out.println("false");
            }else {
                Set<String> set1 = new TreeSet<>(Arrays.asList(str1.split("")));
                Set<String> set2 = new TreeSet<>(Arrays.asList(str2.split("")));
                System.out.println(set1.equals(set2));
            }






    }





}
