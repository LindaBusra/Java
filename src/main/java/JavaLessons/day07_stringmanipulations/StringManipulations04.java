package JavaLessons.day07_stringmanipulations;

public class StringManipulations04 {
    public static void main(String[] args) {




        String str = "Java is easy.";

        boolean isExist = str.contains("va");
        System.out.println(isExist);

        boolean isExist1 = str.contains("X");
        System.out.println(isExist1);

        boolean startsWith = str.startsWith("J");
        System.out.println(startsWith);

        System.out.println(str.startsWith("Java"));   //true

        System.out.println(str.startsWith("a",9)); //true (9.karakterden sonra a ile basliyor)
        //skip first 9 characters

        System.out.println(str.startsWith("i", 5));
        //skip first 5 characters




//----------------endsWith-------------------------------------


        String s = "Do practice to be better";
        boolean rslt = s.endsWith("r");
        System.out.println(rslt);  //true
        System.out.println(s.endsWith("better"));



//----------------concat-------------------------------------


        //concat() method is some with the "+" in Java.

        System.out.println(s.concat("!"));  //Do practice to be better

        System.out.println("".concat("!").concat(s));
    }
}
