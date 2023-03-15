package JavaLessons.day03_ifstatement;

import java.util.Scanner;

public class IfStatement15 {

    public static void main(String[] args) {


/* TASK :
        Get the number of products and price of the product purchased from the user
        ask if user has customer card or not
        if there is a customer card and buy greater than 10 products, discount 20% otherwise discount 15%
        if there is not a customer card and buy greater than 10 products, discount 15% otherwise discount 10%
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter how many products that you bought?");
        double numP = scan.nextDouble();
        System.out.println("Please enter price of product");
        double priceP = scan.nextDouble();
        System.out.println("Have you a customer card?");
        char card = scan.next().toLowerCase().charAt(0);
        Double totalP = 0.0;


        if(card == 'y') {

            if(numP>10) {
                priceP = priceP*0.80;
                totalP = numP*priceP;
                System.out.println("You have 20% discount. Total price that you need to pay : " + totalP);

             } else if (numP>0 && numP <=10){
                priceP = priceP*0.85;
                totalP = numP*priceP;
                System.out.println("You have 15% discount. Total price that you need to pay : " + totalP);
            } else {
                System.out.println("Invalid input of number of products");
            }

        } else if (card == 'n') {

            if(numP>10) {
                priceP = priceP*0.85;
                totalP = numP*priceP;
                System.out.println("You have 15% discount. Total price that you need to pay : " + totalP);
            } else if (numP>0 && numP <=10){
                priceP = priceP*0.90;
                totalP = numP*priceP;
                System.out.println("You have 10% discount. Total price that you need to pay : " + totalP);
            } else {
                System.out.println("Invalid input of number of products");
            }

        } else {
            System.out.println("Invalid input");

        }


    }
}
