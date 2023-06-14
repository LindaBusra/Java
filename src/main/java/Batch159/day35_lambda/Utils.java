package Batch159.day35_lambda;

public class Utils {

    //Utils is for storing usefully methods in a project. If yu will use a method again and again type it once, and put it into Utils.


    public static int getSumOfDigits(int a){

        int sum=0;

        while(a>0) {
            sum += a/10;
        }

        return sum;
    }


    public static int getSquare(int a){

       return a*a;
    }


    public static int getCube(int a){

        return a*a*a;
    }

    public static void printInTheSameLineWithSpaces(Object s){

        System.out.print(s + " ");
    }


    public static boolean checkIsEven(int num){

       return num%2==0;
    }

    public static boolean checkIsOdd(int num){

        return num%2==1;
    }
}
