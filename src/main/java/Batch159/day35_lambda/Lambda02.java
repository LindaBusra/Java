package Batch159.day35_lambda;

import JavaLessons.day31_lambdafp.UtilsClass;

import java.util.stream.IntStream;

public class Lambda02 {
    public static void main(String[] args) {


        printIntegers1(3, 11);
        System.out.println();
        printIntegers2(3, 11);
        System.out.println();

        System.out.println(getFactorial(5));
        System.out.println();
        System.out.println(getFactorial(0));
        System.out.println();
        System.out.println(getFactorial(-15));
        System.out.println();

        System.out.println(findTheSumOfIntegersBetweenTwoGivenIntegers(4,7));
        System.out.println();
        System.out.println(findTheSumOfIntegersBetweenTwoGivenIntegers(7,4));
        System.out.println();

        System.out.println(getTheSumOfDigitsOfIntegersInTheGivenRange1(45, 47));
        System.out.println(getTheSumOfDigitsOfIntegersInTheGivenRange2(45, 47));

    }

    //Example 1: Create a method prints the integers from 3 to 11
    //1.Way: I used structural programming.

    public static void printIntegers1(int start, int end) {

        for(int i =start; i<=end; i++) {
            System.out.print(i + " ");
        }
    }


    //2.Way:
    public static void printIntegers2(int start, int end) {

        IntStream.rangeClosed(start, end).forEach(Utils::printInTheSameLineWithSpaces);
        //forEach(System.out::print); I have this one but in prints without space
        //t-> System.out.print(t + " ") I changed this one with forEach(Utils::printInTheSameLineWithSpaces)--> Ideal functional code, I used just methods
        //If I have no list I have start end end integers data I can use IntStream, but after that I have to use range()
        // in rangeClosed(int startInclusive, int endInclusive)
        //IntStream is vertical, all elements are in vertical order
    }




    //Example 2: Create a method to calculate the factorial of a given number
    //           5! ==> 1*2*3*4*5 = 120        3! ==> 1*2*3 = 6     0! = 1   No factorial for negative integers

    public static int getFactorial(int num) {

        if(num==0) {
            return 1;
        } else if (num<0) {
//            num = Math.abs(num);      //We can use like that. That part depends on documentation
            System.out.println("Factorial of negative integers cannot be calculated");
            return -1;
        }

        return IntStream.rangeClosed(1,num).reduce(Math::multiplyExact).getAsInt();
        //reduce(1,(t,u)->t*u) --->reduce(Math::addExact).getAsInt(), I used getAsInt() because of Optional Integer
        //reduce(1,(t,u)->t*u) if you get to numbers, multiply them. starting number is 1
    }



    //Example 3: Create a method to find the sum of integers from 4 to 7

    public static int findTheSumOfIntegersBetweenTwoGivenIntegers(int start, int end) {

        if(start>end) {
            //1.way
//            int temp = start;
//            start = end;
//            end = temp;

            //2.way
            start =start+end;
            end = start-end;
            start =start-end;

        }
        return IntStream.rangeClosed(start,end).reduce(Math::addExact).getAsInt();
        //reduce(0, (t,u)->t+u) -->reduce(Math::addExact).getAsInt()
        //getAsInt() --> for convert Optional Integer to regular Integer
    }



    //Example 4: Create a method to find the sum of the digits of integers from 45 to 47
    //           4+5+4+6+4+7=30

    //1.Way:
    public static int getTheSumOfDigitsOfIntegersInTheGivenRange1(int a, int b) {

        return IntStream.rangeClosed(a, b).map(Utils::getSumOfDigits).reduce(Math::addExact).getAsInt() ;       //reduce(Math::addExact).getAsInt()  -->  reduce(0, (t, u)->t+u);
                //I am changing numbers to digits, so I use map()
                //45                        9                               9+10+11
                //46                        10
                //47                        11


        //UtilsClass:It is a storage for reusable methods. What kind of method do you have in UtilClass?
        //For example I have a method that take screenshot automatically if test fails.
        //I method which click on submit button automatically
    }

    //2.Way:
    public static int getTheSumOfDigitsOfIntegersInTheGivenRange2(int a, int b) {

        return IntStream.rangeClosed(a,b).map(Utils::getSumOfDigits).sum();        //instead og reduce() we can use sum()

        //we have sum(), count() methods-->it gives numbers of elements in the stream
    }
}
