package Others.MyPractice.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaQ1 {

    public static void main(String[] args) {


//Java 8 Lambda Basic  https://www.youtube.com/watch?v=gpIUfj3KaOc&list=PLqq-6Pq4lTTa9YGfyhyW2CqdtW9RtY-I3&index=1
//Why Lambda? Enables functionally programming, readable and concise code, Easier -to-use APIa and libraries
//Enables support for parallel processing

        List<Integer> numbers = Arrays.asList(3, 4,-5, 1,-2, 5, 4, -2, 10);


        numbers.stream().forEach(t-> System.out.print(t + " "));    // to get all elements
        System.out.println();

        numbers.stream().distinct().forEach(t-> System.out.print(t + " "));     //to get distinct elements
        System.out.println();

        numbers.stream().sorted().distinct().forEach(t-> System.out.print(t+ " "));     //sorted()
        System.out.println();

        int max = numbers.stream().reduce(0, (t,u) -> Integer.max(t,u));        //max element
        System.out.println("max: " + max);

        int min = numbers.stream().reduce(0, (t,u) -> Integer.min(t,u));        //min element
        System.out.println("min: " + min);

        int sum = numbers.stream().reduce(0,(a,b)->a+b);            //find the sum
        System.out.println("the sum is: " + sum);

        int sum1 = numbers.stream().reduce(0, Integer::sum);
        System.out.println("the sum is: " + sum1);




    }
}
