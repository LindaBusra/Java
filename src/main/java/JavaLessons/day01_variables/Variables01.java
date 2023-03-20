package JavaLessons.day01_variables;

public class Variables01 {
    public static void main(String[] args) {


    //Data type  Variable Name = Value ;
    int  myAge = 32;
    double priceOfShirt = 1.99;  //it uses for decimal values.

    System.out.println(myAge);

    System.out.println(Byte.MAX_VALUE);
    System.out.println(Byte.MIN_VALUE);
/*
  //Data Types
  1-byte:It is used for whole numbers.     -128 0  127
  The minimum value of byte is -128
  The maximum value of byte is 127
  Byte variables use 8 bits in memory.

  2-short:It is used for whole numbers.
  The minimum value of shorts is -32,768
  The maximum value of shorts is 32,767
  Short variables use 16 bits in memory.

  3-Integer:It is used for whole numbers.
  The minimum value of integers is -2,147,483,648
  The maximum value of integers is 2,147,483,647
  Integer variables use 32 bits in memory

  4-long:It is used for whole numbers.
  The minimum value of long is -9,223,372,036,854,755,808
  The maximum value of long is 9,223,372,036,854,755,807
  Long variables use 64 bits in memory.

When you select any data type the value must be in the range of the data type.
boolean (1 bit) - char (2 byte) - byte (1 byte) - short (2 byte) --integer (4 byte)--long (8 byte)
 */


        System.out.println("integer max value" + Integer.MAX_VALUE);
        int populationOfGermany = 800000000;
        System.out.println(populationOfGermany);

        //Not*** :
        int max = Integer.MAX_VALUE;   //2147483647
        int newNum = max + 1;   //-2147483648


        long populationOfTheWorld = 700000000000L;
        //long use very much place i memory so we don't use it if it is not necessary
       //java accepts long values as integer as default.  but if your value is greater than the maximum value of integers
        //you will get error. To fix that error you have to put "L" or "l" to the end of the number.

        long populationOfChina = 1400000;


        byte ageOfStudent = 23;
        System.out.println(ageOfStudent);


        short populationOfTheVillage = 23000;

        /* Data types about decimal values:
        1-float:It is used for decimal values (like 12.99)
        Float values use 32 bits in memory.
        When you create a "float" variable, you have to use "F" or "f" at the end of the value.

        2-double:It is used for decimal values.
        double uses 64 bits in memory.

        To safe memory using float is better. but in the real life nobody like it"  */


        float priceOfLaptop = 785.99F;
        double weightOfACell = 0.00001234;

        //double is mer sensitive.  java prefers to use doubles for decimals.


/*  Data Types Related with Numbers
boolean < char < byte < short < integer < long < float < double
1 bit      2bytes   1byte   2bytes 4bytes   8bytes  4bytes  8bytes

 2 more data types
 1-boolean: It is for "true" and "false" answers.
 boolean uses just 1 bit in memory.

 2-char:It is for just single character.
 char uses memory 16 bits=2 bytes.
 */


 boolean isRetired = true;
 boolean isOld = false;

 char initialOfFirstName = 'A';
 char bruker = '3';


 //primitive data type: If a variable contains just value, it is called primitive.
 // byte < short < int < long < float < double  and "boolean2" and "char" are primitive data types.


 String name= "Tom Hanks";
        System.out.println('a');
        System.out.println('a' + 1);  //97 + 1
        System.out.println('A' + 1);  //65 + 1


//String is non-primitive data type.


 // I M P O R T A N T !!!!!
/* what is the differences between primitive and non-primitive datatype?
1-Primitive data types" have just value but "non-primitive data types" have values and methods.
2-"primitive data types" were created by java, we cannot create any primitive data type.
But we can create non-primitive data types whenever we need.
3-"primitive data types" use just lower cases in their names.
but non-primitive data types starts with upper cases.
4-Usage of memory in "primitive data types" changes from data type to data type.
but all non-primitive data types use same amount of memory

 */



 /* Memory Usage in Java
 There are 2 types of memory in Java
 1-Stack Memory: Stores  i)primitive data   2)References (addresses) of Non-primitive data
 2-Heap Memory:Stores non-primitive data

  */





    }
}
