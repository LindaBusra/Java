package JavaLessons.day06_methods_recursion;

import java.util.Scanner;

public abstract class Methods10 {

    //Find factorial of 10.
    public static void main(String[] args) {

        factorial(5);

        factorialWithScan();

        add(5,3);
        System.out.println( add(5,3));

        System.out.println("The sum of the numbers is: " + Add(3,5,4));

        greeting();

        greeting("Selma");                  //call method with String


    }





    public static void factorial(int num) {         //public:
        int fact = 1;

        for (int i = 1; i <= num; i++) {

            fact = fact * i;
        }

        System.out.println("Factorial of " + num + " is: " + fact);

    }




    public static void factorialWithScan() {         //public:

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = scan.nextInt();

        int fact = 1;

        while(num1>0) {

            fact = fact * num1;
            num1--;
        }

        System.out.println("Factorial is " + fact);





    }



    public static int add(int a, int b) {

        return a+b;
    }


    public static int Add(int a, int b, int c) {
        return (a+b+c);
    }


    public static void greeting() {

        System.out.println("Welcome to my house");
    }


    public static void greeting(String name) {

        System.out.println("Welcome to my house " + name);
    }




}

/*
120
Enter a number
5
120
8
The sum of the numbers is: 12
Hi
hiSelma
 */