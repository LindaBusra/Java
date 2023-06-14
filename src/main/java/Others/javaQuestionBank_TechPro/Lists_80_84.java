package Others.javaQuestionBank_TechPro;

import java.util.*;

public class Lists_80_84 {
    public static void main(String[] args) {


// 1) Find the sum of all list elements in an integer list

//    List<Integer> myList = new ArrayList<>();
//    myList.add(12);
//    myList.add(31);
//    myList.add(7);
//    myList.add(13);
//    myList.add(10);
//
//
//    int sum = 0;
//
//    for(int w: myList) {
//
//        sum += w;
//    }
//
//        System.out.println("the sum of all list elements: " + sum);



//-------------------------------------------------------------------------------------------------------



// 2- Find the sum of all list elements before the first occurrence of 13 in an integer list

//    List<Integer> myList = new ArrayList<>();
//    myList.add(12);
//    myList.add(31);
//    myList.add(7);
//    myList.add(13);
//    myList.add(10);
//
//    int sum = 0;
//
//    for(int w: myList) {
//
//        if(w==13) {
//            break;
//        }
//
//        sum += w;
//    }
//
//    System.out.println("Find the sum of all list elements: " + sum);



//-------------------------------------------------------------------------------------------------------



// 3) Find the multiplication of all even list elements in an integer list


//    List<Integer> myList = new ArrayList<>();
//    myList.add(12);
//    myList.add(31);
//    myList.add(7);
//    myList.add(13);
//    myList.add(10);
//    int mult = 1;
//
//    for(int w:myList) {
//
//        if(w % 2 == 0) {
//
//            mult *= w;
//        }
//    }
//
//        System.out.println("The multiplication of all even list elements:" + mult);



//-------------------------------------------------------------------------------------------------------



// 4) Check if elements are in descending order in a list
//Example: (Yellow, Blue, Red, Green) ==> Output: It is not in descending order
// (Yellow, Red, Green, Blue) ==> Output: It is in descending order


//        List<String> e = new ArrayList<>();
//        e.add("Yellow");
//        e.add("Red");
//        e.add("Green");
//        e.add("Blue");
//        System.out.println(e);       // [Yellow, Red, Green, Blue]
//
//
//
//        List<String> newE = new ArrayList<>();
//
//        newE.addAll(e);
//        Collections.sort(newE);
//        System.out.println(newE);    // [Blue, Green, Red, Yellow]  ascendig order
//
//        Collections.reverse(newE);
//        System.out.println(newE);   // [Yellow, Red, Green, Blue]  descendig order
//
//
//        int count = 0;
//
//        for(int i=0; i<e.size(); i++) {
//
//            if(e.get(i).equals(newE.get(i))) {
//                count++;
//            }
//        }
//
//
//    if(count == e.size()) {
//        System.out.println("elements are in descending order in a list");
//    } else {
//        System.out.println("elements are not in descending order in a list");
//    }



//-------------------------------------------------------------------------------------------------------



// 5) If the list has 15 as element, change all 15s to 51
//Example: (12, 11, 15, 34, 43) ==> Output is (12, 11, 51, 34, 43)


    List<Integer> g = new ArrayList<>();
    g.add(12);
    g.add(11);
    g.add(15);
    g.add(34);
    g.add(15);
    g.add(43);

    for(int w:g) {

        if(w==15) {

            g.set(g.indexOf(15), 51);

        }
    }

        System.out.println(g);



//-------------------------------------------------------------------------------------------------------


//6) If a list has 15 or 13, remove them.
//Example: (10, 31, 15, 13, 54) ==> Output is (10, 31, 54)

    List<Integer> h = new ArrayList<>();
    h.add(10);
    h.add(31);
    h.add(15);
    h.add(13);
    h.add(54);
    h.add(13);

if(!h.contains(15) && !h.contains(13) ) {

    System.out.println("There is no 13 or 15 and the list");

} else {

    for(int i= 0; i<h.size(); i++) {

        if(h.get(i)==15) {

            h.remove(h.indexOf(15));
        }
    }

    for(int i= 0; i<h.size(); i++) {

        if(h.get(i)==13) {

            h.remove(h.indexOf(13));
        }
    }


    System.out.println(h);

    }







    }
}
