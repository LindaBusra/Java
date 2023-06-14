package Batch159.day35_lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lambda01 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Mary");
        names.add("Michale");
        names.add("Alex");
        names.add("Alberto");
        names.add("Chris");

        System.out.println(getSquaresOfLengthsInListDistinctly1(names));

        System.out.println(getSquaresOfLengthsInListDistinctly2(names));


    }



    //Example 1: Create a method takes the square of lengths of Strings, puts them in a list in reverse order distinctly

      //1. way
        public static List<Integer> getSquaresOfLengthsInListDistinctly1(List<String> names){

       return names.stream().
               map(String::length).         //map(t->t.length()) can be used as well
                                            //map(t->t.length()) is called "Lambda Expression" - String::length is called "Method Reference"
               distinct().
               map(Utils::getSquare).                 //map(t->t*t) can be used as well
               sorted(Comparator.reverseOrder()).
               collect(Collectors.toList());            //class name, method -->Collectors.toList()
                //Map() method change string elements to integer, og length will be unique, so I use distinct() after map()
                //for put them in a list-->collect(Collectors.toList())
                //I made my functional code as expected

            // names.stream().  map(t->t.length()).  distinct().   map(t->t*t).  sorted(Comparator.reverseOrder()). collect(Collectors.toList())
            //  Mary            4                       4               16              49                              [49, 25, 16]
            //  Michale         7                       7               49              25
            //  Alex            4                       5               25              16
            //  Alberto         7
            //  Chris           5
        }



        //2.way: This did not work!!!
        public static Set<Integer> getSquaresOfLengthsInListDistinctly2(List<String> names) {

            return names.stream().map(t -> t.length()).map(t -> t * t).sorted(Comparator.reverseOrder()).collect(Collectors.toSet());
        }

        //toSet() will make repeated occurrences just once.
        //toSet() puts them in ascending order every time, and it does let me to put element in any order, sorted method is not working
        //if your task needs any sort, dont use toSet(). We can use like in getSquaresOfLengthsInListDistinctly1  distinct() fpr prevent repetation,
        //and you should put them in a list for to be able to sort them.


        /*
            Note: Normally for distinct elements we should use "Set" to store the elements.
                  But "collect(Collectors.toSet())" method does not let you sort the elements, but we need to sort the elements in reverse order
                  That is why we did not use "collect(Collectors.toSet())" we used "collect(Collectors.toList());" with "distinct()"
        */







}
