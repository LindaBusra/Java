package JavaLessons.day03_ifstatement;

import java.util.Scanner;

public class IfStatement12 {

    public static void main(String[] args) {



//What is the score?

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Score");
        String inputScore = input.next();                // inputScore can be number and also any letters.
        if (!inputScore.matches("[0-9]+")) {       // checking inputScore is number . if inputScore is number <else> code run . Google it (in java Validation input be number)

            /*
            As per Java regular expressions, the + means "one or more times" and \d means "a digit".
            String regex = "[0-9]+";
            String regex = "\\d+";
             */
            System.out.println("Not a number! Enter only number");
        }
        else {
            int score = Integer.parseInt(inputScore) ;        // string inputScore convert to int score then math logic can be work. otherwise java give error.  google it (in java string to int)

            if (score >= 50 && score <= 100) {
                System.out.println("oleey you pass!");
            }
            else if (score < 50 && score >= 0) {
                System.out.println("ooops, you fail. may be next time");
            }
            else {
                System.out.println("Invalid score. try again");
            }
        }


    }
}
