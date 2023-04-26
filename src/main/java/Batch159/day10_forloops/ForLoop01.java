package Batch159.day10_forloops;

public class ForLoop01 {


 /*     1)Loops are used for "repeated actions" in Java
        2)There are 4 loops in Java i)for-loop  ii)while loop  iii)do-while loop  iv)for-each loop       */


    public static void main(String[] args) {

        //Example 1: Type code to print "Hi!" 5 times on the console

        for(int i=1; i<6; i++) {
            System.out.println("Hi");
        }



        //Example 2: Type code to print integers from 12 to 3

        for(int i= 12; i>2; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n");




        //Example 3: Type code to print "even" integers from 7 to 12

        //1.way
        for(int i=7; i<13; i++){

            if(i%2==0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");


        //2.way
        for(int i=8; i<13; i+=2) {
            System.out.print(i + " ");
        }

    }
    }

