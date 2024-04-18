package Max.week04_solutions;

import java.util.LinkedHashSet;
import java.util.Set;

public class String_RemoveDuplicates {
    /*
    Write function that can remove the duplicated values from String
            Ex: removeDup("AAABBBCCC") ==> ABC
     */
    public static void main(String[] args) {

        String str = "AAABBBCCC";
        Set<String> result = new LinkedHashSet<>();
        for (String each : str.split("")) {
            result.add(each);
        }
        System.out.println("result = " + result);

//------------------------------------------------------------------------------------------------

        String noDuplicates= "";
        for (String each : str.split("")) {
            if (!noDuplicates.contains(each)){
                noDuplicates += each;
            }
        }
        str = noDuplicates;
        System.out.println("noDuplicates = " + str);
    }



}
