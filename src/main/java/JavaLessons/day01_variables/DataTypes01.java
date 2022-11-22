package JavaLessons.day01_variables;

public class DataTypes01 {

    public static void main(String[] args) {



        //Non-primitive Data:String
        String s = "Einar";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println();


        //Create a char variable and print it on the console
        //Every character has an integer value in IT area.Those values are called ASCII values
        //Note: If you use any char in mathematical operation, Java uses its ASCII value in the operation

        char f = 'G';
        System.out.println(f);      //G

        char c ='A';
        System.out.println(c+1);    //65+1=66

        //Type  code to find the ASCII Value of "!"
        char e = '!';
        System.out.println(e + 0);  //33
        System.out.println('!' + 0);


        //Type code to find the sum of the ASCII Values of 'X' and 'y' and '?'
        char a='X', b='y',d='?';
        System.out.println(a+b+d); //272
        System.out.println('X' + 'y' + '?');


    }
}
