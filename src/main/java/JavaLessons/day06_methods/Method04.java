package JavaLessons.day06_methods;

public class Method04 {


    public static void main(String[] args) {

        getTotal(5,15);


        System.out.println(isEven(75));

        isVowel('u');

    }


//Question1- Write a program with a method named getTotal that accepts two integers as an argument and
// return its sum. Call this method from main( ) and print the results.
    public static void getTotal(int a, int b) {

        System.out.println("The sum of the numbers:" + a + b);
    }



//Write a method named isEven that accepts an int argument. The method should return true if the argument
// is even, or false otherwise. Also write a program to test your method.

    public static boolean isEven(int a) {

        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }



//Write a value-returning method, isVowel that returns the value true if a given character is a vowel, and
// otherwise returns false. In main() method accept a string from user and count number of vowels in that string.

    public static void isVowel(char ch){

            boolean vowel = ch=='a' || ch=='A'|| ch=='e' || ch=='E' || ch=='i' || ch=='I' ||
                    ch=='o' || ch=='O' || ch=='u' || ch=='U';

            if(vowel) {
                System.out.println("the given character \"" + ch + "\" is vowel");
            } else {
                System.out.println("the given character \"" + ch + "\" is not vowel");
            }
        }



    }

