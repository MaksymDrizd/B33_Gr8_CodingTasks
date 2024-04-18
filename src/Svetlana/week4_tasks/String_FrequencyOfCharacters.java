package Svetlana.week4_tasks;

import java.util.HashMap;
import java.util.Map;

public class String_FrequencyOfCharacters {

    /*
    Write function that can find the frequency of characters
            Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */
    public static void main(String[] args) {
        String str = "aaabbbcccdddEEEFFF";
        frequencyOfCharacters("aaabbbcccdddEEEFFF");

    }

    public static void frequencyOfCharacters(String str){

        Map<Character,Integer> counter = new HashMap<>();
        for (int i = 0; i < str.length() ; i++) {
            char key = str.charAt(i);

            if(!counter.containsKey(key)){
                counter.put(key, 0);
            }

            counter.put(key,counter.get(key)+1);

        }
        System.out.println( counter);


    }





}
