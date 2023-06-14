package Others.MyPractice.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaQ2 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 5, -3, 5, 7, 4, -6, 10, 11);


        printEvenElements(numbers);
        System.out.println();

        printSquareOddElements(numbers);
        System.out.println();

        getMinGreaterThanSeven01(numbers);
        getMinGreaterThanSeven02(numbers);
        getMinGreaterThanSeven03(numbers);

        getHalfOfDistinctElementsInReversedOrder(numbers);
        System.out.println();

        sumOfSquaresOfDistinctEvenElements(numbers);
        System.out.println();

        productOfCubesOfDistinctEvenElements(numbers);
        System.out.println();


    }




//1) Create a method to print the even list elements on the console in the same line with a space
//between two consecutive elements.(Functional)


    public static void printEvenElements(List<Integer> list){

        list.stream().filter(a-> a%2==0).forEach(a-> System.out.print(a + " "));

    }



//2) Create a method to print the square of odd list elements on the console in the same line with a space
//between two consecutive elements.(Functional)


    public static void printSquareOddElements(List<Integer> list) {

        list.stream().filter(a->a%2==1).map(a->a*a).forEach(a-> System.out.print(a+ " "));
    }




//3-Create a method to find the minimum value which is greater than 7 and even from the list
//more than 7, even min value

        //1.Way

    public static void getMinGreaterThanSeven01(List<Integer> list) {

        int n1 = list.stream().distinct().filter(a-> a%2==0).filter(a->a>7).reduce(Integer.MAX_VALUE, (a,b)-> a>b? b : a);
        System.out.println("the number is: " + n1);

    }

//2. way

    public static void getMinGreaterThanSeven02(List<Integer> list) {

        Integer n2 = list.stream().distinct().filter(t -> t > 7).filter(t -> t % 2 == 0).
                        sorted(Comparator.reverseOrder()).
                        reduce(Integer.MAX_VALUE, (t, u) -> u);

        System.out.println("the number is: " + n2);

    }

        //3. way


    public static void getMinGreaterThanSeven03(List<Integer> list) {

        Integer n3 = list.stream().distinct().filter(t -> t > 7).filter(t -> t % 2 == 0).
                        sorted().findFirst().get();

        System.out.println("the number is: " + n3);
    }




//4)Create a method to find the half of the elements which are distinct and greater than 5 in reverse order in the list
//distinct,half of the elements, greater than 5, reverse,list


    public static void getHalfOfDistinctElementsInReversedOrder(List<Integer> list) {

        List<Double> newList  = list.stream().distinct().filter(t -> t > 5).map(t-> t/2.0).
                sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.print(newList + " ");
    }


    //5)Create a method to calculate the sum of the squares if distinct even elements

    public static void sumOfSquaresOfDistinctEvenElements(List<Integer> list) {

        int sum = list.stream().distinct().filter(a->a%2==0).map(a->a*a).reduce(0,(a,b)->a+b);
        System.out.println("the sum is: " +  sum);
    }


        //6)Create a method to calculate the product of the cubes of distinct even elements

    public static void productOfCubesOfDistinctEvenElements(List<Integer> list) {

        int product = list.stream().distinct().filter(a->a%2==0).map(a->a*a*a).reduce(1,(a,b)->a*b);
        System.out.println("the product is: " +  product);
    }

    }

