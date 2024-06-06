package Audra.week09_solutions;

import java.util.ArrayList;
import java.util.List;

public class List_RemoveNumbers {

    /*
    Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */

    public static void main(String[] args) {

        // created a list of Integers
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i <= 107; i++) {
            list.add(i);
        }
        System.out.println(list);

        // remove all index values greater than 100
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) >= 100) {
//                list.remove(list.get(i));
//                i--;
//            }
//        }

       list.removeIf(l -> l >= 100);
        System.out.println(list);


    }









}
