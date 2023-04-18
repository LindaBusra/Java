package Batch159.day02_variables;

public class Variables02 {

    //Non-primitive data types: They can be created by Java, like String, Arrrays, Scanner...
    //                          They can be created by developers like Variables01, Variables02..
    //Non-primitive data types are infinitely many.

    //String  data type: String is for multiple characters. Put the value between double quotes.
    public String name = "Tom Hanks";   //Java creates a reserve area in the memory, in start it is "null" in the container as default. .
                                        //When I write "Tom Hanks" java writes this value in the container and assign it to "name"

    //What is the difference between "primitive data types" and "non-primitive data types"?
    //1)primitive data types created by Java, developers cannot create primitive data types
    //  but non-primitive data types can be created by both Java and developers
    //2)primitive data type names start with lower cases, non-primitive data type names start with upper cases.
    //3)primitive data types are just 8, non-primitive data types are infinitely many.
    //4)primitive data types are stored in "Stack Memory", non-primitive data types are stored in "Heap Memory"
    //  Note: "Stack Memory" stores i)primitive data types and ii)addresses(reference) of non-primitive data types
    //        "Heap Memory" stores non-primitive data types
    //5*)non-primitive data types have methods together with the value, but primitive data types do not have methods
    //  primitive data types have just value.

    //Why we need address for non-primitive data types, because Heap memory is huge, so it is difficult to find it.

    public int num = 45;
    public String city = "Miami";

    //"main method" works first in an application, like an engine in a car.
    //Every application needs a "main method", if you do not have "main method" application cannot run.

    //"void" is one of the "return type" in a method.
    //If a method does not produce a new data make the "return type" void.

    //How to create a "main method"?   void is return type, it does not produce a new data -->return tyep void
    public static void main(String[] args) {                    //main + tab,  or psvm + tab
        String countryName = "Germany";
        System.out.println(countryName.toUpperCase());
        System.out.println(countryName.length());

        int num = 130;
        Integer number = num;
        System.out.println(number.byteValue());


        //Example 1: Create two short variables and print their sum on the console
        short s1 = 12;
        short s2 = 45;
        System.out.println("s1 + s2" + (s1+s2));


        //Example 2: Create two variables for prices and print their sum on the console
        double shirtPrice= 12.99;
        double shoesPrice= 124.99;
        System.out.println(shirtPrice + shoesPrice);//137.98

        //Example 3: Create a variable for students age and another variable for population of a country.
        //Print their difference on the console.

        byte age = 45;
        int populationOfCountry = 5000000;
        System.out.println(populationOfCountry - age);
        //if you use different data types in a mathematical operations, the result will be in the largest data type.
        //   4 / 1.2 -->double,   2.4F* 5 -->float
        //if you use same data types in a mathematical operations, the result will be in the data type.
        //  6/2 -->int,   6/5 --> int  (Result is double but to convert double to int Java removes the decimal part so 1.2 will be 1)

        System.out.println(6/5);    //1
        System.out.println(6/5.0);  //1.2

        System.out.println((2+4.6)/3-4*2);      //-5.800000000000001
        System.out.println((2+4.6F)/3-4*2);      //-5.8  less sensitive

        //Note:Order of operations in Math  i)Do the operations in the parenthesis
        //                                  ii)Do multiplications and divisions
        //                                  ii)Do additions and subtractions









    }


}



