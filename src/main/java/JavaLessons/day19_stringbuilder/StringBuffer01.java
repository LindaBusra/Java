package JavaLessons.day19_stringbuilder;

public class StringBuffer01 {
    public static void main(String[] args) {



/*StringBuffer is another class to create Strings in Java.
StringBuffer is very similar with StringsBuilder Class, I mean both are mutable.

What is the difference between StringBuffer ans StringBuilder?

1-StringBuffer was created before StringsBuilder in Java.
2-StringBuffer is multi-thread" but StringsBuilder is not.
2-StringBuffer is using multi-thread characteristic because of that it is slower than  StringsBuilder.

Senarios:
1.I need immutable String -->String Class
2.I need mutable and not multi-thread -->StringBuilder
3.I need mutable and multi-thread -->StringBuffer

When you use multi-thread you need  to create an order for the threads. this called "synchronization

 */


        int a=10;
        int b=-5;
        boolean c=true;
        boolean d=false;
        System.out.println(~a);//-11 (minus of total positive value which starts from 0)
        System.out.println(~b);//4 (positive of total minus, positive starts from 0)
        System.out.println(!c);//false (opposite of boolean value)
        System.out.println(!d);//true









    }
}
