package Samira.week4;


import java.util.HashMap;
import java.util.Map;


public class String_FrequencyOfCharacters {
    /*
       Write function that can find the frequency of characters
               Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
        */
    public static void main(String[] args) {

        String str = "aaabbbcccdddEEEFFF";
        str = str.toLowerCase();
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (char each : str.toCharArray()) {
            if (map.get(each) == null) {
                map.put(each, 1);
            } else {
                map.put(each, map.get(each) + 1);
            }
        }
           map.forEach((key, value) ->{
               System.out.print(key +""+value);
           });


    }
}