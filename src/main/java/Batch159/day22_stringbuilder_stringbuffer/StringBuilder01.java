package Batch159.day22_stringbuilder_stringbuffer;

public class StringBuilder01 {

    public static void main(String[] args) {


        StringBuilder sb1 = new StringBuilder("Java");
        sb1.insert(1, "xxx");       //insert index 1 this text
        System.out.println(sb1);        //Jxxxava


        //insert text into another text
        sb1.insert(4, "abcde", 1,3 );   //set index 4, bc
        System.out.println(sb1);    //Jxxxbcava

        //reverse
        sb1.reverse();
        System.out.println(sb1);    //avacbxxxJ


        sb1.replace(5,8, "y");  //start index, end index, text
        System.out.println(sb1);        //avacbyJ


        //To convert StringBuilder to String
        String sb2 = sb1.toString();  //you change mutable Sting to immutable String. After you do some changes in a String, you will make it unchangeable.
        System.out.println(sb2);        //immutable

        //To convert String to StringBuilder
        StringBuilder sb3 = new StringBuilder(sb2);
        System.out.println(sb3);        //mutable


        //indexOf() gives the fist occurrence
        System.out.println(sb3.indexOf("a"));       //0

        //lastIndexOf() gives the last occurrence
        System.out.println(sb3.lastIndexOf("a"));   //2

        //IndexOf(String str, int formIndex) gives index, after the given index
        System.out.println(sb3.indexOf("a", 1));   //2

        System.out.println(sb3.indexOf("a", 3));   //-1 There is no "a" after 3. index


        System.out.println(sb3.lastIndexOf("a", 3));   //2
        System.out.println(sb3.lastIndexOf("a", 5));   //2
    }
}
