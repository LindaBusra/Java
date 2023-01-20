package JavaLessons.day30_hashtable_iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterators04 {

    public static void main(String[] args) {




        List<String> list= new ArrayList<>();
        list.add("Ingrid");
        list.add("Caroline");
        list.add("Tom");
        list.add("Einar");
        list.add("Martine");
        list.add("Jan Erik");

        System.out.println(list);           //[Ingrid, Caroline, Tom, Einar, Martine, Jan Erik]

        ListIterator<String> itr= list.listIterator();


        while(itr.hasNext()){

            String el= itr.next();

            itr.set(el + "*");


        }
        System.out.println(list);           //[Ingrid*, Caroline*, Tom*, Einar*, Martine*, Jan Erik*]





        while(itr.hasPrevious()) {          //pointer was the end. is there any element before you get it and  move pointer to the left

            String el = itr.previous();

            itr.set("*" + el);

        }

        System.out.println(list);           //[*Ingrid*, *Caroline*, *Tom*, *Einar*, *Martine*, *Jan Erik*]



        //change elements with for each
        for(String w: list) {

            list.set(list.indexOf(w), "a");
        }
        System.out.println(list);           //[a, a, a, a, a, a]





        //Ask user enter a word. And put * start and finish of each character. Welcome -->[*W*, *e*, *l*, *c*, *o*, *m*, *e*]


        String s ="Welcome";
        String ss[] = s.split("");

        List<String> myList = new ArrayList<>();

        for(String w:ss) {

            myList.add(w);
        }


        ListIterator<String> itr1 = myList.listIterator();

        while(itr1.hasNext()) {

        String el=itr1.next();

        itr1.set("*"+el+"*");


        }

        System.out.println(myList);         //[*W*, *e*, *l*, *c*, *o*, *m*, *e*]


        for(String w:myList) {             //*W* *e* *l* *c* *o* *m* *e*
            System.out.print(w+ " ");
        }


    }
}
