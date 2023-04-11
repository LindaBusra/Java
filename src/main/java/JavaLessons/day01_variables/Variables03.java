package JavaLessons.day01_variables;

public class Variables03 {


    public static void main(String[] args) {


//Java Variables

//Q04_after-Create double variables for the prices of any 3 items. Print the sum of the prices on the console with a label.

                double shirtPrice = 12.99;
                double hatPrice = 23.99;
                double shoesPrice = 15.99;

                System.out.println("Total prise is "+ (shirtPrice+hatPrice+shoesPrice));



// Q2-Create a float variable, a long variable, and an integer variable for any 3 items. Print the multiplication of the values on the console with a label.

                float aa= 4.15f;
                long bb=12L;
                int cc=100;
                System.out.println("Multiplication is " + (aa*bb*cc));



//Q3-Type a code to find simple interest. Note: Simple interest formula = principal * rate * numberOfYear / 100
                int principal = 1000, rate=5, numberOfYear=4;

                System.out.println("Simple interest formula is " + (principal*rate*numberOfYear/100));



//Q4- Create a String and two Long variables. Print the sum and the multiplication of the long variables with the String on the console.

                String text = "This is a text";
                long d= 2345L;
                long e=1234556L;

                System.out.println(text + (d+e));       //text1236901
                System.out.println( text + d*e);        //text2895033820
                System.out.println(text+d+e);           //text23451234556



        //Example for char
        char a='A', b='B', c='C';
        System.out.println(a); //A
        System.out.println(a+1) ; //66

        System.out.println(a+b) ;  //65+66=131
        System.out.println(a+""+b); //AB

        System.out.println(a+""+b + c);  //AB67
        System.out.println('A' + 'B');  //131


            }
        }

