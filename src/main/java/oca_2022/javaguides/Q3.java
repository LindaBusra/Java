package oca_2022.javaguides;

import java.util.Arrays;

public class Q3 {

    public static void main(String[] args) {
        String[] fruits = {
                "banana",
                "apple",
                "pears",
                "grapes"
        };
        Arrays.sort(fruits, (a, b) -> a.compareTo(b));
        for (String s: fruits) {
            System.out.print(" " + s);
        }
    }
}

/*
What is the result?
A) apple banana grapes pears  +
B) pears grapes banana apple
C) banana apple pears grapes
D) Compilation fails
 */