package JavaLessons.day03_ifstatement;

import java.util.Scanner;

public class IfStatement26 {

    public static void main(String[] args) {


  /*
  Ask user to enter his weight and height. Calculate body index of the user.
  To calculate body mass index use "bodyMassIdx = weight / squareOfHeigth" formula.
   ** 1) body mass inx less than 18.5 ==> "You are weak".
   ** 2) bodyMassInx between 18.5 -25 ==> Your weight is ideal
   ** 3) bodyMassIndex between 25-30 ==> You are fat
   **4) bodyMassIndex greater than 30 ==> Obese

  */
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter your weight (kg)");
        double weight = scan.nextDouble();
        System.out.println("Enter your height (m)");
        double height = scan.nextDouble();

        double bmi = weight / (height*height);

        System.out.println("You body index is: " + bmi);

        if(bmi<18.5) {
            System.out.println("You are weak");
        } else if (bmi>= 18.5 && bmi<= 25) {
            System.out.println("Your weight is ideal");
        } else if (bmi>25 && bmi<=30 ) {
            System.out.println("You are fat");
        } else if(bmi>30){
            System.out.println("Obese");
        } else {
            System.out.println("Enter valid values for weight and height");
        }

    }
}
