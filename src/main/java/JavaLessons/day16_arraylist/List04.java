package JavaLessons.day16_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List04 {
    public static void main(String[] args) {




 //Type code to make all elements in a list unique.
 // [2,3,2,2,5]-->[2,3,5]

       List<Integer> a = new ArrayList<>();

        a.add(2);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(5);

        ArrayList<Integer> b =new ArrayList<>();

        for(Integer w:a) {

            if( ! b.contains(w)) {

                b.add(w);
            }
        }
        System.out.println(b);




//------------------------------------------------------------------------------------------



//Example-2 : Ask user to enter a letter, if the letter exist inside the list, convert the element to
//"Got it". Otherwise add the elements into the list
        //           otherwise, add the element into the list
//           [A, K, R, S] ==> User --> K ==> [A, Got it, R, S]
//           [A, K, R, S] ==> User --> P ==> [A, K, R, S, P]



//    ArrayList<String>ch =  new ArrayList<>();
//        ch.add("A");
//        ch.add("K");
//        ch.add("R");
//        ch.add("S");
//
//
//    Scanner scan = new Scanner(System.in);
//    System.out.println("Enter  a letter");
//    String c = scan.next();
//

//
//    if(ch.contains(c)) {
//        ch.set(ch.indexOf(c), "Got it");       //indexOf() method gives you the index of first occurrence of a specific element
//    } else {                                    //indexOf() method returns -1 for non-existing elements
//        ch.add(c);
//    }
//
//    System.out.println(ch);



//------------------------------------------------------------------------------------------

        ArrayList<String>d =  new ArrayList<>();
        d.add("Ab");
        d.add("Kl");
        d.add("Rs");
        d.add("St");
        d.add("Rs");

        int e = d.indexOf("Rs");      //2
        System.out.println(e);

        int f = d.indexOf("Xy");
        System.out.println(f);          //-1

        //Note:How can you understand the existence of a specific elements in a list
        //Use indexOf() method if the result is "-1" it means the element does not exist
        //If the result is not "-1" it means the element exists.
        //Use contains()

        int h = d.lastIndexOf("Rs");        //Last indexOf() method gives you the index last occurrence of a specific element
                                        //Last indexOf() method returns "-1" for non-existing elements
        System.out.println(h);      //4






    }
}
