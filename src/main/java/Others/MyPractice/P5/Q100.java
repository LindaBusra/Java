package Others.MyPractice.P5;

import JavaLessons.day31_lambdafp.UtilsClass;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Q100 {

    public static void main(String[] args) {


        //Get count, min, max, sum, and average for numbers

        List<Integer> a = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

        IntSummaryStatistics result = a.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println(result);

        System.out.println("Highest prime number in List : " + result.getMax());
        System.out.println("Lowest prime number in List : " + result.getMin());
        System.out.println("Sum of all prime numbers : " + result.getSum());
        System.out.println("Average of all prime numbers : " + result.getAverage());


        //Question 2- // Create List of square of all distinct numbers

        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);

        numbers.stream().distinct().map(t -> t * t).forEach(t -> System.out.print(t + " "));

        //or
        List<Double> square = numbers.stream().distinct().map(t -> Math.pow(t, 2)).collect(Collectors.toList());

        System.out.println(square);

        System.out.println("-----------------");
        System.out.println(returnSumFromThreeToEight(3, 8));

        System.out.println(multiply(3, 8));

        System.out.println(add(3, 5));

        System.out.println(addEven(2, 10));
        System.out.println(sumEven(2,10));

        System.out.println("-----------------");
        System.out.println(sumofdig(23,32));

        // Question 3-Convert String to Uppercase and join them using coma
        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada");

        System.out.println(convertUpper(G7));

        G7.stream().map(t -> t.toUpperCase().concat(", ")).forEach(System.out::print);

    }

    public static List<String> convertUpper(List<String> list) {
        return list.stream().map(t -> t.toUpperCase()).collect(Collectors.toList());
    }


    //Create a method to calculate multiplication of the integers from 3(inclusive) to 8(inclusive)


    public static int returnSumFromThreeToEight(int x, int y) {

        return IntStream.rangeClosed(x, y).reduce(1, Math::multiplyExact);

    }

//or

    public static int multiply(int a, int b) {
        return IntStream.rangeClosed(a, b).reduce(1, Math::multiplyExact);
    }


    //// create a method to get some of two integer(both are inclusive)

    public static int add(int x, int y) {
        return IntStream.rangeClosed(x, y).reduce(0, Integer::sum);
    }


    ////create a method to calculate the sum of even integers between given two integer

    public static int addEven(int x, int y) {
        return IntStream.rangeClosed(x, y).filter(t -> t % 2 == 0).reduce(0, Integer::sum);
    }

//or
    public static int sumEven(int x, int y) {
        int sum = IntStream.rangeClosed(x, y).filter(t -> t % 2 == 0).reduce(0, Math::addExact);
        return sum;

    }



    //// create a method to calculate the sum of digits of every integers between given to integers
    //// 23 and 32 ==> 2+3 2+4 2+5 2+6 2+7 2+8 2+9 3+0 3+1 3+2 ==> for each some parts


    public static int sumofdig(int x, int y){
        return IntStream.rangeClosed(x, y).map(UtilsClass::getSumOfDigits).reduce(0, Integer::sum);
    }


    public static int getSumOfDigits(int x){

        int sum=0;
        while(x!=0){
            sum += x%10;
            x=x/10;
        }
        return sum;
    }

    }








