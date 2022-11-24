package JavaLessons.day01_variables;

public class Variables04 {

    public static void main(String[] args) {


/*  Syntax of valueOf()

String.valueOf(boolean b)
String.valueOf(char c)
String.valueOf(char[] data)
String.valueOf(double d)
String.valueOf(float f)
String.valueOf(int b)
String.valueOf(long l)
String.valueOf(Object o)
 */



// convert double to string
        double x = 90.45;

        System.out.println(String.valueOf(x));
        System.out.println(String.valueOf(x) + 1);          //90.451



// convert numbers to strings
        int a = 8;
        long l = -2343564L;
        float f = 25.4f;
        double d = 103.204d;


        System.out.println(String.valueOf(a));  // "8"
        System.out.println(String.valueOf(l));  // "-2343564"
        System.out.println(String.valueOf(f));  // "25.4"
        System.out.println(String.valueOf(d));  // "103.204"


//---------------------------------------------------------------------------------------

        char c = 'J';
        char ch[] = {'J', 'a', 'v', 'a'};

        // convert char to string
        System.out.println(String.valueOf(c));  // "J"


        // convert char array to string
        System.out.println(String.valueOf(ch));  // "Java"


//---------------------------------------------------------------------------------------


//Subarray of a char Array to String

        char ch1[] = {'p', 'r', 'o', 'g', 'r', 'a', 'm'};
        int offset = 3;         //initial offset of the subarray
        int length = 4;         //the length of the subarray


        // subarray {'o', 'g', 'r', 'm'} is converted to string
        String result = String.valueOf(ch1, offset, length);

        System.out.println(result);  // "gram"


    }
}
