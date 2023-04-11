package JavaLessons.day02_typecasting_scanner;

import java.util.Scanner;

public class Scanner04 {

    public static void main(String[] args) {



//Example 1 -Get the width and the length of rectangle forum user and calculate the area


        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of rectangle?");
        double length1 = input .nextDouble();
        System.out.println("What is the width of rectangle?");
        double width1= input .nextDouble();

        System.out.println("The area of rectangle is " + (length1*width1));


//----------------------------------------------------------------------------


/*Example 2- Ask user to enter width, height and the leghth of a rectangular
prism and then calculate the total surface area? Area=2(ab+bc+ac)  Volume=a.b.c      */


        Scanner scan = new Scanner(System.in);
        System.out.println("What is the length, width and height of rectangular prism");
        Double length = scan.nextDouble();
        Double width= scan.nextDouble();
        Double height= scan.nextDouble();

        System.out.println("The total surface area of rectangular prism is " + (2*length*width+2*length*height+2*width*height));
        System.out.println("The volume of rectangular prism is " + width*length*height);


    }
}
