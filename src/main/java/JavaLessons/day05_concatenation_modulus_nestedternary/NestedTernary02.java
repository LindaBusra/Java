package JavaLessons.day05_concatenation_modulus_nestedternary;

public class NestedTernary02 {
    public static void main(String[] args) {



 //Ternary does the same with "if else" by using more simple syntax

//If an integer is positive print "The integer is positive" otherwise
// print "The integer is not positive"
        // variable = condition ? expression1 : expression2;


    int i = 12;
    System.out.println(i>0 ? "The integer is positive" : "The integer is not positive" );

    //or
    String result = i>0 ? "The integer is positive" : "The integer is not positive";
    System.out.println(result);


//----------------------------------------------------------------------------


    int age = 20;

    System.out.println((age >= 18) ? "You can vote" : "You cannot vote");


//--------------------------------------------------------------------------


    char operator = '+';
    int num1 = 8;
    int num2 = 7;

    // using variables in ternary operator
    int result1 = (operator == '+') ? (num1 + num2) : (num1 - num2);
    System.out.println("result is: " + result1);



// Type a program to print the ninimum of 2 doubles on the console. use ternary

    double x = 12.3;
    double y = 21.5;

    System.out.println(x<y ? x : y);



    }
}
