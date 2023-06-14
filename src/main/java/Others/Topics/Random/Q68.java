package Others.Topics.Random;

import java.util.ArrayList;

public class Q68 {
    public static void main(String[] args) {

/*
// create an int array list, the list must consist of 10 elements
         // Create a void method named "add random" and its parameter is int array list.
         // this method assign values from 0 to 20 in array list.
         // if it throws an even number, write 111 instead of that element
         // If there is no even number, it will give the message that there is no even number.
 */


        ArrayList<Integer> list = new ArrayList<>();
        randomArray(list);

    }

    public static void randomArray(ArrayList<Integer> list) {

        for (int i = 0; i < 10; i++) {
         list.add((int) (Math.random() * 20));

        }

        System.out.println("Random list: " + list);


        for(int w:list) {

            if(w%2==0) {

                list.set(list.indexOf(w), 111);

            }
        }

        System.out.println(list);

        int count = 0;
        for(int w: list) {

            if(w==111) {
                count++;
            }
        }

        if(count==0) {
            System.out.println("There is no even number in this array");
        }
    }
}