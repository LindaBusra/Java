package JavaLessons.day01_variables;

import java.sql.SQLOutput;

public class JavaMath {
    public static void main(String[] args) {


//        The Math.max(X,y) method can be used to find the highest value of X and y:

        int a = Math.max(5, 10);
        System.out.println(a);      //10


//        The Math.min(X,y) method can be used to find the lowest value of X and y:

        int b = Math.min(5, 10);
        System.out.println(b);      //5


//        The Math.sqrt(X) method returns the square root of X:

        Math.sqrt(64);
        System.out.println(Math.sqrt(64));  //8


//        The Math.abs(X) method returns the absolute (positive) value of X:

        Math.abs(-4.7);
        System.out.println(Math.abs(-4.7)); //4.7



//        Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):

        Math.random();

        System.out.println(Math.random());      // 0 to 100  output is decimal number

        int randomNum = (int)(Math.random() * 100);  // from 0 to 100  output is  integer number
        System.out.println(randomNum);

        int randomNum1 = (int)(Math.random() * 100+1);  // from 1 to 100
        System.out.println(randomNum1);

        System.out.println((int)(Math.random()*10));   //from 0 to 10
        System.out.println((int)(Math.random()*10 +1) );  //from 1 to 10


        System.out.println(Integer.max(12,43));
        System.out.println(Integer.min(23,243));
        System.out.println(Double.sum(12.2, 23.3));


    }
}
