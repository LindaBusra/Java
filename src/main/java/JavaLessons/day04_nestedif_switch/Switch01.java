package JavaLessons.day04_nestedif_switch;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {



//swich statement does the same with if-else if, it has just different syntax.
// You cannot use long, double, float and boolean in switch statements



//Task : Get the number of days from user and print the name of the day
//For example; 1 ==> Sunday, 2 ==> Monday, etc.


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter day number");
        byte dayNumber = scan.nextByte();

          //1. way if-else

        if(dayNumber==1)  {
            System.out.println("it is Sunday");
        } else if (dayNumber==2)  {
            System.out.println("it is Monday");
        } else if (dayNumber==3)  {
            System.out.println("it is Tuesday");
        } else if (dayNumber==4)  {
            System.out.println("it is Wednesday");
        } else if (dayNumber==5)  {
            System.out.println("it is Thursday");
        } else if (dayNumber==6)  {
            System.out.println("it is Freday");
        } else if (dayNumber==7)  {
            System.out.println("it is Saturday");
        } else {
            System.out.println("invalid number");
        }


        //2. way: "switch statement"

        switch (dayNumber) {
            case 1:
                System.out.println("it is Sunday");
                break;
            case 2:
                System.out.println("it is Monday");
                break;
            case 3:
                System.out.println("it is Tuesday");
                break;
            case 4:
                System.out.println("it is Wednesday");
                break;
            case 5:
                System.out.println("it is Thursday");
                break;
            case 6:
                System.out.println("it is Freday");
                break;
            case 7:
                System.out.println("it is Saturday");
                break;
            default:
                System.out.println("invalid number");   //son kisim oldugundan break yazmaya gerek yok
        }




    }
}
