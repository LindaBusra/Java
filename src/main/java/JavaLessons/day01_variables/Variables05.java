package JavaLessons.day01_variables;

public class Variables05 {

    public static void main(String[] args) {



//Create an integer variable and to double variables. then print their sum on the console.
//note:if you use different numeric data types in any math operation, the result will be in the largest data type.
        int num1= 21;
        double num2 = 12.99, num3 = 3.99;

        System.out.println("The sum is " + (num1+num2+num3)) ;

//Example: Create 2 float variables, 3 short variables, 2 double variables and print their sum on the console.

        float numFloat1 = 12.99f, numFloat2 = 5.76f;
        short numShort1 = 12, numShort2 = 23, numShort3 = 34;
        double numDouble1 = 23.45, numDouble2 = 123.09;

        System.out.println("The sum is " + (numFloat1+numFloat2+numShort2+numShort1+numShort3+numDouble1+numDouble2));

//Exampel-4 Create a char variable and integer variable and try to the addition operating with dem

        int number  = 10;
        char character = 'a';
        System.out.println(number+character);   // a=97 + 10 =107   !!!!!!!!!!!!!!!!!!!!!!!!



        int i1 = 10;
        char c1 = 'A';
        System.out.println(c1+i1);    // 65 +10 =75
//when you use any char in any math operation java uses the Ascii value of the char.

        //Example 5- Create a string variable and 2 integer variables and try to do addition operation with than

        String s = "Tom";
        int i =12, k=23;
        System.out.println(s+i+k);  //Tom1223
        System.out.println(s+(i+k)); //Tom35

        //Concatenation

//if you use "+" sign with a String, java will do concatenation operation.
        //in concatenation operation data will be joined.

    }
}
