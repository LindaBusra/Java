package JavaLessons.day01_variables;

public class DataTypes {
    public static void main(String[] args) {



       /*What is the difference between "primitive" and "non-primitive" data types?
       1)primitive data types contain just values, non-primitive data types contain value+method
       2)primitive data types names use just lowercase characters, but non-primitive data type names use uppercase at the beginning
       3)primitive data types were created by java, developers can not create primitive data types.
       But non-primitive data types can be created by Java and by any developer
       4)non-primitive data types use same size area in memory but primitive data types use different size area in memory.

       boolean (1 bit) - char (2 byte) - byte (1 byte) - short (2 byte) --integer (4 byte)--long (8 byte) -float (4 byte) - double (8 byte)         */


        //primitive data types:boolean,char,byte,short,int,long,float,double

        // 1) boolean: boolean has 2 values which are true or false. A boolean variable uses just a bit in the memory
        boolean isRetired = false;
        boolean isOld = true;


        //2) char: char is for just a single character.It uses 16 bits(2 bytes) in memory

        char initial ='A';


        //3) byte: byte is for whole numbers between -128 and 127.It uses 8 bits(1 byte)in memory
        byte age = 14;
        byte mathGrade = 76;


        //4) short: short is for whole numbers between -32768 and 32767.It uses 16 bits(2 byte) in memory
        short numberOfStudentInASchool = 2134;


        //5) int: int is for whole numbers between -2,147,483,648 and 2,147,483,647.It uses 32 bits(4 bytes) in memory
        int annualProfitOfApple = 2000000000;


        //6) long:Long is for whole numbers between -9,223,372,636,854,755,898 and 9,223,372,636,854,755,897.It uses 64 bits(8 bytes) in memory
        // Do not forget to put "L" to the end of the value in the long data type
        long populationProfitOfTheWorld = 700000000L;


        //7) float: float is for decimals.It uses 32 bits in memory.
        //Do no forget to put "F" or "f" to the end of the value in float data type
        //In float, decimal part can have up to 7 digits
        float priceOfShirt = 12.99f;


        //8)double: double is for decimals. It uses 64 bits in memory.
        //In double, decimal part can contain up to 16 digits
        double weightOfACell =0.00001230004;



    }
}
