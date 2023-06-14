package Others.MyPractice.P3;

import java.util.ArrayList;

public class Q63 {

    public static void main(String[] args) {


        // Part1:
        // Create an arraylist of Strings
        // add - "Red", "Green", "Blue", "Yellow" and "Black" inside
        // print out all the elements, each element on new line

        // Part2:
        // Create a method that accepts a String arraylist and a String as parameters
        // method should add the element at the first index of arraylist

        // Part3:
        // Create a method that accepts a String arraylist and a String as parameters
        // it should add element before last element
        // ex:  [1, 2, 3]  -> [1, 2, 4, 3]


        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");

        System.out.println(colors);         //[Red, Green, Blue, Yellow, Black]


        //Part 1
        for(String w:colors) {

            System.out.println(w);
        }


        addFirstIndex(colors, "Purple");

        addBeforeLastElement(colors, "Lilla");

        System.out.println(colors);

    }


    public static void addFirstIndex(ArrayList<String> colors, String a) {

        colors.add(0,a);
    }

    public static void addBeforeLastElement(ArrayList<String> colors, String a) {

        colors.add(colors.size()-1, a);



    }
}
