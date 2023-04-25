package Batch159.day09_nestedternary_switch;

public class Switch03 {

    public static void main(String[] args) {


        //Example 1: Type code to print "Vowel" for a, e,i,o,u and "Not vowel" for other letters

        String str = "b";

        switch (str.toLowerCase()) {

            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("Vowel");
                break;
            case "b":
            case "c":
            case "d":
            case "f":
            case "g":
            case "h":
            case "j":
            case "k":
            case "l":
            case "m":
            case "n":
            case "p":
            case "r":
            case "s":
            case "t":
            case "v":
            case "w":
            case "X":
            case "y":
            case "z":
                System.out.println("Not vowel");
                break;
            default:
                System.out.println("This is not letter...");

        }


    }
}
