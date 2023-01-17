package JavaLessons.day19_stringbuilder;

public class StringBuilder03 {

    public static void main(String[] args) {



        //Knowledge: append(char ch) is used to append the string representation of the char argument
        // to the given sequence. The char argument is appended to the contents of this StringBuilder sequence.
        StringBuilder stb = new StringBuilder("Learn ");

        char[] ch = new char[] { 'J', 'A', 'V', 'A' };

        stb.append(ch);

        System.out.println(stb);


//--------------------------------------------------------------------


        StringBuilder sb = new StringBuilder("Learn");

        System.out.println("Before trim: " + sb.capacity());

        sb.trimToSize();

        System.out.println("After trim: " + sb.capacity());

//--------------------------------------------------------------------


        StringBuilder sb1 = new StringBuilder(9);

        System.out.println(sb1.length() + " - " + sb1.capacity());   //0-9



        StringBuilder sb2 = new StringBuilder();

        System.out.println(sb2.length() + " - " + sb2.capacity());  //0-16




        StringBuilder sb3 = new StringBuilder("Java");

        System.out.println(sb3.length() + " - " + sb3.capacity());      //4-20



        StringBuilder sb4 = new StringBuilder("StringBuilder");

        System.out.println(sb4.delete(3, 6).toString() + " - " + sb4.length());  //if I dont write toString it get compile time error.
        //because concanitation is for String.










//        String str = "Learn";
//        str = str + "Java";
//        System.out.println(str);


//        String str1 = "Learn";
//        System.out.println(str1 + "Java");


        String str = "Learn";

        join("Java");           //We have no assignment, so the output is Learn

        System.out.println(str);


    }
    public static String join(String str) {

        return str + "Java";

    }
    }

