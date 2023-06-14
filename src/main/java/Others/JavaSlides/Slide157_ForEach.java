package Others.JavaSlides;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Slide157_ForEach {

    public static void main(String[] args) {


// For-each Question 1: Create an integer array find the sum of all elements by using for-each loop
// and print the sum on the console.


    int list[] = {1,2,3,4,5,6};

    int sum = 0;

    for(int w: list) {
        sum+=w;
    }
        System.out.println("the sum of all elements: " + sum);



//---------------------------------------------------------------------------------------------------------------



// For-each Question 2: Create a list find the sum of all elements by using for-each loop and print the sum on the console.

    ArrayList<Integer> number = new ArrayList<>();

    number.add(1);
    number.add(5);
    number.add(6);
    number.add(4);
    number.add(9);

    int total = 0;

    for(int w: number) {
        total += w;
    }
        System.out.println("the sum of all elements: " + total);



//---------------------------------------------------------------------------------------------------------------



// For-each Question 3: Write a Java program to find the common elements between two arrays (string values).

        String  st1 [] = {"Ole", "Jan", "Sigrund", "Susanne", "Terje"};

        String  st2 [] = {"Ole", "Amalie", "Sigrund", "Helen", "Øystein"};


        for(String w: st1) {

            for(String m : st2) {

                if(w.equals(m)) {

                    System.out.print(w + " ");
                }
            }
        }





    }
}
