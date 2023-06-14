package oca_2022.javaguides;

import java.util.stream.Stream;

public class Q4 {

    public static void main(String[] args) {
        Stream < Integer > nums = Stream.of(1, 2, 3, 4, 5);
        nums.filter(n -> n % 2 == 1);
        nums.forEach(p -> System.out.print(p));     //IllegalStateException: stream has already been operated upon or closed
    }

}


/*
What is the result?
A) 135
B) 12345
C) Compilation fails
D) An exception is thrown at runtime   +
 */


//If it was like that --> nums.filter(n -> n % 2 == 1).forEach(p -> System.out.print(p)); Result is 135