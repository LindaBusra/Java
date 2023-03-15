package JavaLessons.day03_ifstatement;

import java.util.Scanner;

public class IfStatement14 {

    public static void main(String[] args) {



// Find how many "U" is there in sentences?


        String y = "FUTURE OF IT";

        //1.way

        int all=y.length();
        int withoutA=y.replaceAll("U","").length();

        System.out.println(all-withoutA);


        //2. yol

        int counter = 0;


        for(int i=0; i<y.length(); i++) {
            if(y.charAt(i)=='U') {
                counter++;
            }
        }
        System.out.println("U: " + counter );






    }
}
