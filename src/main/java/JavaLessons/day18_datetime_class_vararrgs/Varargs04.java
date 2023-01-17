package JavaLessons.day18_datetime_class_vararrgs;

public class Varargs04 {

    public static void main(String[] args) {



// Create a method that joins the given Strings
// input => "Please", "join", "the", "given", "words"
// output => "Please join the given words"

    display1("Please", "join", "the", "given", "words");


    }

    static void display1(String... values) {

        for (String s : values) {
            System.out.print(s + " ");
        }
    }


    static void forCharArray(String name) {

        char[] ch = name.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);

        }


    }
}