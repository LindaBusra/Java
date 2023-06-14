package Others.MyPractice.Lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaQ3_max_min {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 5, -3, 5, 7, 4, -6, 10, 11);



        maxElement01(numbers);
        maxElement02(numbers);
        maxElement03(numbers);
        maxElement04(numbers);

        minElement01(numbers);
        minElement02(numbers);
        minElement03(numbers);
        minElement04(numbers);


    }



//Create a method to find the maximum value from the list elements with 3 ways

    public static void maxElement01(List<Integer> list) {

    int max = list.stream().reduce(0, (a,b)-> Integer.max(a,b));
    System.out.println("max: " + max);

    }


    public static void maxElement02(List<Integer> list) {

        int max = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (a,b)->b);
        System.out.println("max: " + max);

    }


    public static void maxElement03(List<Integer> list) {

        int max = list.stream().distinct().reduce(Integer.MIN_VALUE, (a,b)->a>b? a:b);
        System.out.println("max: " + max);

    }


    public static void maxElement04(List<Integer> list) {
        Integer max = list.stream().reduce(Integer.MIN_VALUE, Math::max);
        System.out.println("max: " + max);
    }


//Create a method to find the minimum value from the list elements with 3 ways


    public static void minElement01(List<Integer> list) {

        int min = list.stream().reduce(0, (a,b)-> Integer.min(a,b));
        System.out.println("min: " + min);

    }


    public static void minElement02(List<Integer> list) {

        int min = list.stream().distinct().sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE, (a,b)->b);
        System.out.println("min: " + min);

    }


    public static void minElement03(List<Integer> list) {

        int min = list.stream().distinct().reduce(Integer.MAX_VALUE, (a,b)->a>b? b:a);
        System.out.println("min: " + min);

    }


    public static void minElement04(List<Integer> list) {
        Integer min = list.stream().reduce(Integer.MAX_VALUE, Math::min);
        System.out.println("min: " + min);
    }
    }

