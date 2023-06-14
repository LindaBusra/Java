package Batch159.day34_lambda;

import Batch159.day35_lambda.Utils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda02 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Alex");
        names.add("Jim");
        names.add("Michael");
        names.add("Mary");
        names.add("Alexander");
        names.add("Alex");
        names.add("Brad");

        printLessThanFiveCharsUpperCase1(names);
        System.out.println();

        printLessThanFiveCharsUpperCase2(names);
        System.out.println();

        printDistinctSortedByLengthLowerCase(names);
        System.out.println();
        printDistinctSortedByLengthThenAlphabeticalLowerCase(names);

    }
    //Example 1: Print the elements which have less than 5 characters in upper cases on the console
    public static void printLessThanFiveCharsUpperCase1(List<String> names){

        names.stream().filter(t->t.length()<5).map(t-> t.toUpperCase()).forEach(t-> System.out.print(t + " "));
    }


    //Example 1, solution with same method, but I change Lambda Expressions
    public static void printLessThanFiveCharsUpperCase2(List<String> names){

        names.
                stream().
                filter(t->t.length()<5).        //You can not change this Lambda Expression, because it works with a specific value
                                                //If a method works with specific condition, you can not change it to method reference
                map(String::toUpperCase).
                forEach(Utils::printInTheSameLineWithSpaces);
    }



    //Example 2: Print the elements on the console by ordering them according to their lengths in lower cases and un-repeatedly
    public static void printDistinctSortedByLengthLowerCase(List<String> names){
        names.
                stream().
                distinct().
                map(String::toLowerCase).                               //map(t->t.toLowerCase())
                sorted(Comparator.comparing(String::length)).           //sorted(Comparator.comparing(t-> t.length()))
                forEach(Utils::printInTheSameLineWithSpaces);           //forEach(t-> System.out.print(t+" "))
        //sorted(Comparator<? super String> comparator)  for sorting according their lengths
        //Comparator will compare elements, and I say to java while you comparing them use these rules I give you.
        //I used map() before sorted(), because java put A before a, because of ASCII value
     }

    //Example 3: Print the elements on the console by ordering them according to their lengths in lower cases and un-repeatedly.
    //           If some elements are in the same length put them in alphabetical order
    public static void printDistinctSortedByLengthThenAlphabeticalLowerCase(List<String> names){

        names.
                stream().
                distinct().
                map(String::toLowerCase).            //map(t->t.toLowerCase()).
                sorted(Comparator.comparing(String::length).
                thenComparing(t->t.charAt(0))).     //we can not change it because charAt() works with a specific value, we should keep it like Lambda Expression
                forEach(Utils::printInTheSameLineWithSpaces);
        //actually in Lambda we dont use structure like that: t.length() or t.toLowerCase(). we use just methods.
        //i stead of t->t.length()) I use String::length
        //Lambda Expression : t->t.toLowerCase(), but is it not recommended to use Lambda expression



    }
}