package Max.week10_solutions;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.*;

public class Map_SortByValues {

    /*
        Write a method that can sort the map by values
     */

    public static void main(String[] args) {

        Map<Integer,Integer> map = new LinkedHashMap<>();
        map.put(1,60);
        map.put(3,30);
        map.put(2,20);
        map.put(4,70);


        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        Map<Integer,Integer> result = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> each : list) {
            result.put(each.getKey(),each.getValue());
        }
        System.out.println(result);


    }




}
