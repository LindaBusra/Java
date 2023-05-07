package JavaLessons.day16_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List15 {
    public static void main(String[] args) {




//To make Arraylist from array

        int[] arr = {2,3,4,5,6,6,7,8,9,10};


        List<Integer> myNumbers= new ArrayList<>();


        for(Integer each:arr) {
            myNumbers.add(each);
        }
        System.out.println("sayilarim arrayListi " + myNumbers);




//----------------------------------------------------------------------------------------------------------------



        Integer arr2[] = {3, 4, 5, 6};

        //When you create a list from array by using "asList()", the list will be fixed in length.

        List<Integer> list = Arrays.asList(arr2);
        System.out.println(list);
        list.add(7);
        list.remove(2);


        //Static03 to remove an element from list
        list.remove(1);
        System.out.println(list);

        //Static03 to add an element into the list
        list.add(7);
        System.out.println(list);

        //Static03 to delete all elements from the list
        list.clear();
        System.out.println(list);

    }
}
