package JavaLessons.day03_ifstatement;

import java.util.Scanner;

public class IfStatement16 {

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




    }
}
