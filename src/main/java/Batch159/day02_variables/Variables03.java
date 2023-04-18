package Batch159.day02_variables;

public class Variables03 {

    public static void main(String[] args) {

        // Write a Java program to break an integer into a sequence of individual digits.
        // Hint: use / and %
        // X: input: 12345
        //    output: 1
        //            2
        //            3
        //            4
        //            5

        int x = 12345;
        int ones = x%10;
        int tens = (x/10)%10;
        int hundreds = (x/100)%10;
        int thousends = (x/1000)%10;
        int tenthousends = (x/10000)%10;

        System.out.println(ones + "\n" + tens + "\n" + hundreds + "\n"  + thousends + "\n" + tenthousends + "\n");

    }
}
