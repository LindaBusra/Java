package Batch159.day02_variables;

public class Variables01 {

    //Primitive Data Types: boolean-char-byte-short-int-long-float-double
    //byte-short-int-long : for "whole numbers"
    //float-double : for "decimal numbers"
    //char is for "single characters"
    //boolean is for "true-false values"

    //char uses 16 bits (2 bytes) in memory
    //Char Data Type: char is for a single character. Like A, a, ?, 5 etc. When you use a value for "char"s, put it between single quates.

    public char initial = 'A';
    //java create a reserve area in memory which name is "initial".


    //byte data type: byte is for whole numbers. Like 23, 65, -32. Byte can have values from -128 to 127
    //byte uses 8 bits (1 byte) in memory

    //public byte age = 320;  it gives error

    public byte age = 45;   //for age


    //short data type: short is for whole numbers. Like 23, 145, 2987. Short can have values from -32768 to 32767
    //short uses 16 bits (2 bytes) in memory

    public short numberOfStudent = 5200;


    //int data type: int is for whole numbers. Like 23, 145, 29827, 230000000. int can have values from -2147483648 to 2147483647
    //int uses 32 bits (4 bytes) in memory

    public int populationOfCountry = 45000000;

    //long data type: int is for whole numbers. Like 23, 145, 29827, 230000000. long can have values from -9223372036854775808 to 9223372036854775807
    //int uses 64 bits (8 bytes) in memory
    //if the value of a "long variable" is out of range of the "int", put "L" to the end of the value.

    public long populationOfTheWorld = 720000000000L;       //put l or L , if it is out of range of integer
    public long profit = 23000000L;       //Java accept it like int as default, if it is in range of integer


    //float data type: float is for decimal values. 2.34, 5.234 etc  //less sensitive (we have less decimal)
    //float uses 32 bits (4 byte) in memory

    public float priceOfShirt = 12.99F;  //Java as default accept all decimal numbers as double. But if I write F, I insist of it is float.


    //double data type: double is for decimal values. Like 3.2456778  //more sensitive

    public double weightOfCell = 0.0000000000234;
    //double uses 64 bits (8 byte) in memory


    public static void main(String[] args) {

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
    }
}
