package JavaLessons.day02_typecasting_scanner;

public class TypeCasting {
    public static void main(String[] args) {



/* Type casting; converting a number primitive data type to another number primitive data type.For ex;
while using data type convert as 'byte' convert to 'int'. Normally it is byte but it will behave like
 byte. (You can't change char or boolean data types, as they are not numeric data types).

byte - short - int - long - float-double

boolean     char        byte        short       int         long       float        double
1 bit       2 byte      1 byte      2 byte      4 byte      8 byte      4 byte      8 byte


For ex;
**If you convert small data type to large dat type it is called 'Auto widening'.
**If you convert large data type to small data type it is called 'Explicit Narrowing'.

     */


        short num1 =255;
        byte num2 = (byte) num1;
        System.out.println(num2);


        byte age= 12;
        int myAge = age;  // 12
        System.out.println(age);


        short populationOfVillage = 21000;
        int myPopulationOfVillage = populationOfVillage;  //21000
        System.out.println(myPopulationOfVillage);


        //Explicitly narrowing
        double x = 23.45;
        long y =(long)x;
        System.out.println(y);   //23



        //Example1- Create 2 integervariables and a string value.

        int i1 = 13, i2 = 21;
        String text = "Tom";
        System.out.println(i1 +i2+ text);   //34Tom
        System.out.println(text+  i2 * i1);   // Tom273
        System.out.println(i1 +text + i2);   // 13Tom21



        /*order of the operation in math:
        1-calculate the exponential
        2-Do the operations inside parenthesis
        3-Do multiplications and divisions
        4-Do add and subtractions
         */

        int result = 3-2*(5+2*3)/11;   //sonuc 1
        System.out.println("result is " + result) ;



//Type Casting

        /*    Autowidening
        java can put small data into larger data types automatically.
        When you put small data type into a large data type you can widen the samll
        data container into a bigger container data type */


//Auto-widening
        int m = 14000;
        System.out.println("m is " + m);

        double d = m;
        System.out.println("d is " + d);

        byte k = (byte) m;
        System.out.println("k is " + k);


//Expliciftly Narrowing : Java does not put large data types into small data types

        int n = 15;
        byte b = (byte) n;
        System.out.println(b);


        //Type Casting   numeric primitive data types:  byte<short<int<long<float<double

        //java can put small data types into large data types automatically.
        //When you put small data type into a large data type, you are widening the small try {
        //AutoWidening

        int nn = 14;
        double dd = nn;
        System.out.println(dd);  //14.0   Autowidening



        //Explicit narrowing: java does not put large data types into small data types.

        int mm= 15;
        byte bb = (byte)mm;





    }
}
