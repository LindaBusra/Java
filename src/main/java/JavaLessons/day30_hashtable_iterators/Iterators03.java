package JavaLessons.day30_hashtable_iterators;

import java.util.*;

public class Iterators03 {

    public static void main(String[] args) {


        List<String> list1= new ArrayList<>();
        list1.add("Ali");
        list1.add("Ayshia");
        list1.add("Can");

        System.out.println(list1);//[Ali, Ayshia, Can]


        //Example 1: Remove the element "Can"

        //Remove method does not work with for each loop
//        for (String w: list1){
//
//            if(w.equals("Can")){
//                list1.remove(w);
//            }
//
//        }

        //Update the element==> set() uses iterators in the backend operations
        for (String w: list1){

            list1.set(list1.indexOf(w), w+"!");
        }
        System.out.println(list1);


        //Update the element==> set() uses iterators in the backend operations
        //1.way:
        for (String w: list1){

            list1.set(1, "*");

        }
        System.out.println(list1);



        //2.way: Using iterator object

        Iterator<String> itr1= list1.iterator();


        while(itr1.hasNext()){

            String el= itr1.next();

            itr1.remove();

        }
        System.out.println(list1);//[]




    }

}
