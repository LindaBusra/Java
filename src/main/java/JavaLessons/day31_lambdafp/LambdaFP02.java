package JavaLessons.day31_lambdafp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaFP02 {

    /*

    1)The variable or variables gives us the logic part. This structure is called Lambda Expression
    "variable or variables" ==> "logic"
    2) In functional programming, we can use "Lambda Expression", it is allowed but not recommended.
    Instead of "Lambda Expression" we prefer "method reference".
    3)Method Reference is "Class Name::Method Name".

    For example;    "String::Length"  (do not type method parenthesis, type just method name)
                    "Arrays::toString"
                    "Utility::getCube"
    You can use your own class to create the required methods for your application, For exp: you created
    "Animal" class, and you have eat() in Animal class. ==> "Animal::eat"

     */

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();

        l.add(8);
        l.add(9);
        l.add(131);
        l.add(8);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);

        printElementsFunctional(l);
        System.out.println();

        printEvenElementsStructured(l);
        System.out.println();

        printSquareOfOddElements(l);
        System.out.println();

        printCubeOfDistinctOddElements(l);
        System.out.println();

        sumOfSquaresOfDistinctEvenElements01(l);
        sumOfSquaresOfDistinctEvenElements02(l);
        System.out.println();

        productOfCubesOfDistinctEvenElements(l);

        getMaxElement(l);
        getMinElement(l);

        getMinGreaterThanSevenEvenNum(l);

        getHalfOfDistinctGraterThanFiveReverse(l);
    }

    //1-Create a method to print the elements on the console in the same line with a space
    //between two consecutive elements.

    public static void printElementsFunctional(List<Integer> list) {

        list.stream().forEach(UtilsClass::printInSameLineWithASpace);
    }


    //2-Create a method to print the even elements in the list on the console in the same line with a space.
    //between two consecutive elements (Functional with method reference)

    public static void printEvenElementsStructured(List<Integer> list) {

        list.
                stream().filter(UtilsClass::checkToBeEven).
                forEach(UtilsClass::printInSameLineWithASpace);
    }


    //3-Create a method to print the square of odd list elements in the list on the console in the same line with a space.
    //between two consecutive elements (Functional P)

    public static void printSquareOfOddElements(List<Integer> list) {

        list.
                stream().filter(UtilsClass::checkToBeOdd).
                map(UtilsClass::getSquare).
                forEach(UtilsClass::printInSameLineWithASpace);

    }


    // 4- Create a method to print the cube of distinct odd list elements on the console in the same line with a space
    //  between two consecutive elements (Functional Method Referance)


    public static void printCubeOfDistinctOddElements(List<Integer> list) {

        list.
                stream().distinct().
                filter(UtilsClass::checkToBeOdd).
                map(UtilsClass::getCube).
                forEach(UtilsClass::printInSameLineWithASpace);

    }

    //5-Create a method to calculate the sum of the squares of distinct even elements.

    public static void sumOfSquaresOfDistinctEvenElements01(List<Integer> list) {

        //1.way
        int sum = list.stream().distinct().filter(UtilsClass::checkToBeEven).map(UtilsClass::getSquare).
                reduce(0, Math::addExact);

        System.out.println(sum);

    }


    public static void sumOfSquaresOfDistinctEvenElements02(List<Integer> list) {

        //2.way
        Integer sum = list.stream().distinct().filter(UtilsClass::checkToBeEven).map(UtilsClass::getSquare).
                reduce(0, Integer::sum);

        System.out.println(sum);

    }



    //6-Create a method to calculate the product of the cubes of distinct even elements.


    public static void productOfCubesOfDistinctEvenElements(List<Integer> list) {

        Integer result = list.
                            stream().distinct().
                            filter(UtilsClass::checkToBeEven).
                            map(UtilsClass::getCube).
                            reduce(1, Math::multiplyExact);

        System.out.println(result);
    }



    //7-Create a method to find the maximum value from the list elements

    public static void getMaxElement(List<Integer> list) {


    Integer max = list.stream().distinct().reduce(Integer.MIN_VALUE, Math::max);

        System.out.println(max);
    }



    //8-Create a method to find the minimum value from the list  elements (in 2 ways)

    public static void getMinElement(List<Integer> list) {

        Integer min = list.stream().distinct().reduce(Integer.MAX_VALUE, Math::min);

        System.out.println(min);
    }



    //Create a method to find the minimum value which is greater than 7 and even elements from the list.

    public static void getMinGreaterThanSevenEvenNum(List<Integer> list) {

        Integer min = list.
                        stream().distinct().
                        filter(t-> t>7).filter(UtilsClass::checkToBeEven).reduce(Integer.MAX_VALUE, Math::min);

        System.out.println(min);

        //or
        Integer min1 = list.stream().distinct().filter(t-> t>7).filter(UtilsClass::checkToBeEven).findFirst().get();

        System.out.println(min1);

    }



    //Create a method to find the half of the elements which are distinct and greater than 5 in reverse order in a list

    public static void getHalfOfDistinctGraterThanFiveReverse(List<Integer> list) {

    List<Double> result =    list.
                            stream().distinct().
                            filter(t-> t>5).
                            map(UtilsClass::getHalf).
                            sorted(Comparator.reverseOrder()).
                            collect(Collectors.toList());

    System.out.println(result);


    }

}