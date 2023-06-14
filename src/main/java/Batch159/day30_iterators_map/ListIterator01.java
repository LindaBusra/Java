package Batch159.day30_iterators_map;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator01 {

    public static void main(String[] args) {

       //How to use ListIterator

        List<String> yourList = new ArrayList<>();
        yourList.add("Tom");
        yourList.add("Jim");
        yourList.add("Clara");
        yourList.add("Angie");
        System.out.println(yourList);   //[Tom, Jim, Clara, Angie]

        //Create ListIterator
        ListIterator<String> listItr = yourList.listIterator();     //[ x(pointer is here) Tom, Jim, Clara, Angie]
        //listIterator() will take your list and change it to ListIterator.I am creating list iterator object (listItr) by converting  yourList


        //if you will go from first to last hasNext(), if you want to go from last to first hasPrevious()
        while (listItr.hasNext()){

            listItr.next();
        }                               //[Tom, Jim, Clara, Angie]


        while(listItr.hasPrevious()){         //[Tom, Jim, Clara, Angie   x(pointer is here) ]

            String el = listItr.previous();
            listItr.set(el + "!");
        }
        System.out.println(yourList);



    }
}
