package JavaLessons.day04_nestedif_switch;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {



//If user enters 9 the code will print September, October, November, December
// If user enters 5 the code will print May, June, July, August, September, October, November, December


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter month number");
        byte monthNum = scan.nextByte();

        switch ( monthNum) {
            case 1:
                System.out.println("January");   //if there is no break
            case 2:
                System.out.println("February");
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
            case 5:
                System.out.println("May");
            case 6:
                System.out.println("June");
            case 7:
                System.out.println("July");
            case 8:
                System.out.println("August");
            case 9:
                System.out.println("September");
            case 10:
                System.out.println("October");
            case 11:
                System.out.println("November");
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month number");

        }



//------------------------------------------------------------------------------

        // Ask user to enter country name among "America, England, Germany,
        // Turkey, India, Peru, Spain, Bulgaria, Albania, France"
        //
        // Type code to print abbreviation of the countries. "US, UK, DE, TR, IN,
        // PE, ES, BG, AL, FR"


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the country name");
        String country = scanner.nextLine().toLowerCase();


        switch(country) {  //inside the switch parenthesis you can use just int, byte, short, char and string data types.
            //boolean, long, float, double can not use in switch statements.

            case "america":
                System.out.println("US");
                break;
            case "england":
                System.out.println("UK");
                break;
            case "germany":
                System.out.println("DE");
                break;
            case "turkey":
                System.out.println("TR");
                break;
            case "india":
                System.out.println("IN");
                break;
            case "peru":
                System.out.println("PE");
                break;
            case "spain":
                System.out.println("ES");
                break;
            case "bulgaria":
                System.out.println("BG");
                break;
            case "albania":
                System.out.println("AL");
                break;
            case "france":
                System.out.println("FR");
                break;
            default:
                System.out.println("No information about this country");
        }


    }
}
