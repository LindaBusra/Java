package JavaLessons.day16_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class List18 {

    public static void main(String[] args) {


/*
Ask user to enter a letter. If the letter exists in the list convert it to "Got it"
otherwise, add the element user entered into the List
 */

        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        System.out.println(list);



            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a letter please");
            String letter = scan.next();

            if (list.contains(letter)) {

                list.set(list.indexOf(letter), "Got it");
            } else {
                list.add(letter);
            }


        System.out.println("The new list is: " + list);



//-------------------------------------------------------------------------------------------


        //Increase the value of every element by 3 except 7

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(11);
        list1.add(15);
        list1.add(10);
        list1.add(7);
        list1.add(9);
        System.out.println(list1);



        for(int w : list1){

            if(w==7){
                continue;
            }
            list1.set(list1.indexOf(w), w+3);

        }

        System.out.println(list1);







    }
}
