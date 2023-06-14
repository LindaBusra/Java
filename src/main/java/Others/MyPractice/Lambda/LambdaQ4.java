package Others.MyPractice.Lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaQ4 {


    public static void main(String[] args) {



        List<Integer> numbers = Arrays.asList(2, 5, -3, 5, 7, 4, -6, 10, 11, 12);

        System.out.println("The size of array: " + numbers.size());

        int first = numbers.stream().findFirst().get();
        System.out.println("The first element in array: " + first);


        int min = numbers.stream().sorted().findFirst().get();
        System.out.println("The min: " + min);

        int max = numbers.stream().sorted(Comparator.reverseOrder()).findFirst().get();
        System.out.println("The max: " + max);

        numbers.stream().filter(a->a%3==0).filter(a->a%2==0).distinct().forEach(a-> System.out.print(a + " "));
        System.out.println();




        //List with String

        List<String> names = Arrays.asList("Ingrid", "Ole", "Mary", "Vidar", "Jeny");

        String firstName = names.stream().findFirst().get();
        System.out.println("The first element in array: " + firstName);


        names.stream().sorted().forEach(a-> System.out.print(a+ " "));            //alphabetical order
        System.out.println();

        int size = names.size();
        System.out.println("Size of array: " + size);




    }
}
