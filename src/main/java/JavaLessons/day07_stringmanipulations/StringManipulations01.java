package JavaLessons.day07_stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {




//Print the first and last character of the given String on the console-->Jy

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scan.nextLine();
        char firstChar = str.charAt(0);
        char lastChar = str.charAt((str.length()-1));

        System.out.println("" + firstChar +  lastChar);




//if you use char data type in a maths operation, java uses ASCII values. not the characters.
//When you put "" at the beginning it will be concatenation operation,
//and you will get string   [java starts from the left]


// 2.Way : By using substring()

        String text = "Java is Java";
        System.out.println(text.substring(0,1));  //first character
        System.out.println(text.substring(text.length()-1));  //last character

//Substring(a,b)-->a:inclusive, b:exclusive

        System.out.println(text.substring(3,9));




//-------------------------------------------------------------------------------------------


    String st ="I like lion, horse, laptop and cat";
        System.out.println(st.substring(7,11) + " " + st.substring(13,18) + " " + st.substring(31));

   int a = str.indexOf("lion") ;
   int b = str.indexOf("horse");
   int c = str.indexOf("cat");

        System.out.println(st.substring(a,a+4) + " " + st.substring(b,b+5) + " " + st.substring(c,c+3)  );


  }
}
