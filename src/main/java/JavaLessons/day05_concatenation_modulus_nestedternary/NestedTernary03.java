package JavaLessons.day05_concatenation_modulus_nestedternary;

public class NestedTernary03 {
    public static void main(String[] args) {




    int num=20;

    if(num%2==0) {
        System.out.println("number is even");
    } else {
        System.out.println("number is odd");
    }

        System.out.println(num%2==0 ? "number is evenr" : "number is odd");


//------------------------------------------------------------------------------------



    int num1 = 10;
    int num2 = 20;
    int result;

    result = (num1>num2) ? (num1+num2) : (num1-num2);

            System.out.println("result is " + result);


//----------------------------------------------------------------------



// Java program to find largest among two numbers using ternary operator

    int n1=10, n2=10, max ;

            System.out.println("first number is " + n1);
            System.out.println("second number is " + n2);

    max = (n1>n2) ? n1 : n2 ;

            System.out.println("max number is " + max);





    }


}




