package Max.week10_solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_Sort_Desc {

    /*
ArrayList - sorting in descending order
Write a method that can sort the ArrayList in descending order without
using the sort method.
     */
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(12,7,13,5,2,9));

        for (int i = 0; i < nums.size()-1; i++) {
            for (int j = 0; j < nums.size()-1; j++) {
                int temp = 0;
                int current = nums.get(j);
                int next = nums.get(j + 1);
                if (current < next){
                    temp = current;
                    nums.set(j,next);
                    nums.set((j+1),temp);

                }
            }
        }
        System.out.println("nums = " + nums);

    }


}
