package JavaLessons.day03_ifstatement;

import java.util.Scanner;

public class IfStatement24 {


    public static void main(String[] args) {



// Ask user height and weight and find the BMI


        Scanner scan = new Scanner(System.in);
        System.out.println("What is your weight (kg):");
        double weight = scan.nextDouble();
        System.out.println("What is your hight (m):");
        double hight = scan.nextDouble();

        double bmi = weight/(hight*hight);

        if(bmi<0) {
            System.out.println("Invalid BMI value");
        } else if (bmi>=0 && bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi>=18.5 && bmi <= 24.9) {
            System.out.println("Normal weight");
        } else if (bmi>=25 && bmi <=29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obesity = BMI of 30 or greater");
        }
    }
}
