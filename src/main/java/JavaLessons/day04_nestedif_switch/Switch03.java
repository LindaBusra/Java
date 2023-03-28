package JavaLessons.day04_nestedif_switch;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {



//Ask user to enter a character, if it is 'Vowel', if it is not a vowel print "Not vowel"

        Scanner input= new Scanner(System.in);

        System.out.println("Enter a letter to check if it is vowel or not");

        String ch = input.next().toLowerCase().substring(0,1);

        if(!ch.matches("[a-z]")) {
            System.out.println("Enter a letter not the other characters...");
        }



//solution with switch

        char ch1 = 'a';

        switch (ch1){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
            case 'b':
            case 'c':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                System.out.println("Not Vowel");
                break;
            default:
                System.out.println("Enter a letter not the other characters...");
        }



        //to solution is together now

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a letter to check if it is vowel or not");

        String str = scan.next().toLowerCase().substring(0, 1);

        if (!str.matches("[a-z]")) {
            System.out.println("type character please");
        } else {

            char ch2 = str.charAt(0);

            switch (ch2) {

                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("Vowel");
                    break;
                default:
                    System.out.println("Not wovel");

            }
        }

//------------------------------------------------------------------------------------------------


    /*Ask user to enter his weight and height(m). Calculate body index of the user. To calculate body mass
    index use "bodyMassIdx = weight / squareOfHeigth" formula. ** 1) body mass inx less than 18.5 ==>
    "You are weak". ** 2) bodyMaxInx between 18.5 -25 ==> Your weight is ideal ** 3) bodyMassIndex between
    25-30 ==> You are fat **4) bodyMassIndex greater than 30 ==> Obese

     */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a character");
        System.out.println("Enter your weight");
        double weight = scanner.nextDouble();
        System.out.println("Enter your height(m)");
        double height = scanner.nextDouble();

        double bodyMassIdx = weight/(height*height) ;
        System.out.println(bodyMassIdx);
        System.out.println("Your IBM is: " + bodyMassIdx );



        if(bodyMassIdx>0 && bodyMassIdx<18.5) {
            System.out.println("You are weak");
        } else if (bodyMassIdx>=18.5 && bodyMassIdx <= 25) {
            System.out.println("Your weight is ideal");
        } else if (bodyMassIdx>25 && bodyMassIdx < 30) {
            System.out.println("You are fat");
        } else if (bodyMassIdx < 30) {
            System.out.println("Obese");
        } else {
            System.out.println("invalid height or weight");
        }




    }

}
