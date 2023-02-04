package JavaLessons.day03_ifstatement;

import java.util.Scanner;

public class IfStatement10 {

    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);

        System.out.println("Enter the initial of day name please");
        String name = input.next().toLowerCase();
        char newName = name.charAt(0);


        if(newName =='m'){
            System.out.println("Monday");
        } else if (newName == 't'){
            System.out.println("Tuesday , Thursday");
        }  else if (newName == 'w'){
            System.out.println("Wednesday");
        } else if (newName == 'f'){
            System.out.println("Friday");
        }  else if (newName == 's'){
            System.out.println("Saturday , Sunday");
        } else {
            System.out.println("Invalid");
        }


//-----------------------------------------------------------------



        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name : ");

        // Take string data from the user
        String name1 = scan.next();

        // Check the input value equal to 'Jolly' or not
        if(name1.equals("Jolly"))
        {
            System.out.print("You have achieved the first price");
        }
        // Check the input value equal to 'Janifer' or not
        else if(name1.equals("Janifer"))
        {
            System.out.print("You have achieved the second price");
        }
        // Check the input value equal to 'Jony' or not
        else if(name1.equals("Jony"))
        {
            System.out.print("You have achieved the third price");
        }
        else
        {
            System.out.print("Try for next time");
        }
        //Close the scanner object
        scan.close();





    }
}
