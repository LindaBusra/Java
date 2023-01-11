package JavaLessons.day31_lambdafp;

import JavaLessons.day31_lambdafp.UtilsClass;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Lambda01_String {
    public static void main(String[] args) {

        List<String> l = new ArrayList<>();

        l.add("Tom");
        l.add("Alley");
        l.add("Tom");
        l.add("Mark");
        l.add("Amanda");
        l.add("John");
        l.add("Jackson");
        l.add("Marry");
        l.add("Alberto");
        l.add("Tucker");
        l.add("Ben");

        printInUppercases01(l);
        System.out.println();
//      printInUppercases02(l);


        printElementSortedByLength(l);
        System.out.println();

        printElementsInReverseOrderSortedByLength(l);
        System.out.println();
        printDistinctElementsSortedByLastChar(l);
        System.out.println();

        printAllElementsByTheirLengthAndFirstInitialChars(l);
        System.out.println();

        removeIfTheLengthGreaterThanFive(l);        //6

        removeIfStartsWithAOrEndsWithN01(l);        //7
        removeIfStartsWithAOrEndsWithN02(l);        //7

        removeTheElementsLengthsInBetween5And10OrEndsWithO01(l);
        removeTheElementsLengthsInBetween5And10OrEndsWithO02(l);

        System.out.println(checkLengthToBeLessThanTwelve(l));

        System.out.println(checkAnyNotToStartWithX(l));
        System.out.println(checkAnyElementEndingWithR(l));



    }


    //1) Create a method to print all list elements in uppercase

    //1.way
    public static void printInUppercases01(List<String> list) {

        list.stream().map(String::toUpperCase).forEach(UtilsClass::printInSameLineWithASpace);

    //we use map for update elements
    }


    //2,way
//    public static void printInUppercases02(List<String> list) {
//
//        list.replaceAll(String::toUpperCase);   //if we are sure about there is a method which is ready, we dont have to use stream().
//
//        System.out.println(list);
//    }



    // 2-Create a method to print the elements after ordering according to their length.

    public static void printElementSortedByLength(List<String> list) {

        list.stream().sorted(Comparator.comparing(String::length)).forEach(UtilsClass::printInSameLineWithASpace);
    //for reach out to forEach I used stream();
     }



    //3)Create a method to print the elements after creating according their lengths( in reverse order)


    public static void printElementsInReverseOrderSortedByLength(List<String> list) {

        list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(UtilsClass::printInSameLineWithASpace);     //by using reversed(), descending order
    }




    //4) Create a method to sort the distinct elements by using their last characters
    public static void printDistinctElementsSortedByLastChar(List<String> list) {

        list.stream().distinct().sorted(Comparator.comparing(UtilsClass::getLastChar)).forEach(UtilsClass::printInSameLineWithASpace);

    }



    //5)Create a method to sort elements according to their lengths then according to their first character
    public static void printAllElementsByTheirLengthAndFirstInitialChars(List<String> list) {

            list.stream().distinct().sorted(Comparator.comparing(String::length).thenComparing(UtilsClass::getFirstChar)).
                forEach(UtilsClass::printInSameLineWithASpace);
    //or   thenComparing(t->t.chartAt(0))
    }




    //6)Remove the elements if the length of the element is greater than 5


    public static void removeIfTheLengthGreaterThanFive(List<String> list){
       list.removeIf(t-> t.length()>5);
       System.out.println(list);
    }



    //7)Remove the elements if the elements starts with"A" or "a"  or ending with 'N' or 'n';

    public static void removeIfStartsWithAOrEndsWithN01(List<String> list){

        //1. way
        Predicate<String> checkCondition = t->t.charAt(0)=='A' || t.charAt(0)=='a' || t.charAt(t.length()-1)=='N' || t.charAt(t.length()-1)=='n';
        list.removeIf(checkCondition);  //or list.removeIf(t-> checkCondition.test(t));
        System.out.println(list);
    }




    public static void removeIfStartsWithAOrEndsWithN02(List<String> list){

        //2.way
        list.removeIf(t->t.startsWith("A") || t.startsWith("a") || t.endsWith("N") || t.endsWith("n"));
        System.out.println(list);
    }


    //8)Remove the elements if the element length is between 5 and 10 or ending with 'o';


//    //1.way

    public static void removeTheElementsLengthsInBetween5And10OrEndsWithO01(List<String> list){

        list.removeIf(t->t.length()>4 && t.length()<11 || t.endsWith("o"));
        System.out.println(list);
    }


    //2.way
      public static void removeTheElementsLengthsInBetween5And10OrEndsWithO02(List<String> list){

        Predicate<String> checkCondition = t-> t.length()>4 && t.length()<11 || t.endsWith("o");  //to check a condition

        list.removeIf(checkCondition);  // or list.removeIf(t-> checkCondition.test(t));  //put every element in this condition, and test it.
        System.out.println(list);
    }




    //9)Create a method to check if the lengths of all elements are less than 12

    public static boolean checkLengthToBeLessThanTwelve(List<String> list){

        return list.stream().allMatch(t->t.length()<12);   //it gives sture/false
    }


    //10-Create a method to check if the initial of any elements is not 'X'


    public static boolean checkAnyNotToStartWithX(List<String> list){

        return list.stream().noneMatch(t->t.charAt(0)=='X');    //it gives sture/false
        //none of them start with X
    }



    //11-Create a method to check if at least one of the elements ending with "n"


    public static boolean checkAnyElementEndingWithR(List<String> list){

        return list.stream().anyMatch(t->t.endsWith("n"));      //it gives sture/false
        //none of them start with X
    }


}
