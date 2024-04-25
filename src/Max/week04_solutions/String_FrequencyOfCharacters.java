package Max.week04_solutions;

import java.util.LinkedHashMap;
import java.util.Map;

public class String_FrequencyOfCharacters {

    /*
    Write function that can find the frequency of characters
            Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */
    public static void main(String[] args) {
        String str = "aaabbbcccdddEEEFFF";

        Map<String,Integer> result = new LinkedHashMap<>();
        for (String each : str.split("")) {
            if (result.containsKey(each)){
                result.put(each,result.get(each) + 1);
            }else {
                result.put(each,1);
            }
        }
        System.out.println(result);



    }




}