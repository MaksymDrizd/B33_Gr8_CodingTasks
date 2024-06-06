package Max.week09_solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_RemoveNumbers {

    /*
    Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 110; i++) {
             list.add(i);
        }
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= 100){
                list.remove(list.get(i));
            }

        }

        //list.removeIf(p -> p >= 100);


        System.out.println(list);
    }






}
