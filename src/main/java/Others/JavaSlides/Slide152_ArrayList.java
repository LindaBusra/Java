package Others.JavaSlides;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class Slide152_ArrayList {
    public static void main(String[] args) {



         /*   List Question 01:

1 )Create a String list whose elements are A, C, E, and F. Print it on the console.
2)By using add() with index method, add B into the 1st index.
    List elements should be like A, B, C, E, and F. Print it on the console
3)By using set() method, convert E to D.
    List elements should be like A, B, C, D, and F. Print it on the console
4)By using remove() method, remove F from the list.
    List elements should be like A, B, C, D. Print it on the console
5)Find the size of the list and print the size on the console.          */


//1
        ArrayList<String> str = new ArrayList<>();

        str.add("A");
        str.add("C");
        str.add("E");
        str.add("F");

        System.out.println(str);            // [A, C, E, F]

//2
        str.add(1,"B");
        System.out.println(str);            // [A, B, C, E, F]


//3
        str.set(3, "D");
        System.out.println(str);            // [A, B, C, D, F]



//4
        str.remove(4);
        System.out.println(str);            // [A, B, C, D]


//5
        int size = str.size();
        System.out.println("The size of list is:" + size);      // The size of list is:4


//-------------------------------------------------------------------------------------------------------------------



/*    List Question 02:
    Find the sum of the elements in the array { {1,2,3}, {4,5}, {6,7} } and return an array.
    For example; for { {1,2,3}, {4,5}, {6,7} } output will be {6, 9, 13}            */

        int arr[][] = { {1,2,3}, {4,5}, {6,7} };

        int newArray[] = new int[arr.length];

        int sum = 0;

        for(int i=0; i<arr.length; i++) {

            for(int j=0; j<arr[i].length; j++) {

                sum += arr[i][j];
            }
            newArray[i] = sum;
            sum=0;

        }


        System.out.println("Arrays04 is:" + Arrays.toString(newArray));            // Arrays04 is:[6, 9, 13]












    }



}
