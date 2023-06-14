package Others.Projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GreenMarket {

    public static List<String> products = new ArrayList<>();
    public static List<Double> prices = new ArrayList<>();

    public static List<String> productsOfBasket = new ArrayList<>();
    public static List<Double> basketKg = new ArrayList<>();
    public static List<Double> basketPrices = new ArrayList<>();


    public static void main(String[] args) {

/* Green Market shopping program.
*
* Step 1: Create lists containing products and prices.
*                     No Product Price
                     ==== ======= =========
                     00 Tomatoes 2.10 TL
                     01 Potatoes 3.20 TL
                     02 Pepper 1.50 TL
                     03 Onion 2.30 TL
                     04 Carrots 3.10 TL
                     05 Apples 1.20 TL
                     06 Bananas 1.90 TL
                     07 Strawberry 6.10 TL
                     08 Bowler 4.30 TL
                     09 Grapes 2.70 TL
                     10 Lemons 0.50 TL
* Step 2: Ask the user to select a product from the list according to the product number.
* Step 3: Ask how many kg you want to buy.
* Step 4: Add this product to the cart and print the cart.
* 5. Ask if he wants to buy another product.
* 6. If he wants to continue, direct him to the product selection section again.
* 7. If he wants to finish, go to the payment section and finish the program after the payment.
*/

        Scanner scan = new Scanner(System.in);
        products.addAll(Arrays.asList("Tomato","Potato","Pepper","Onion","Carrot",
                "Apple","Cherry","Peach","Melon","Grape","Lemon"));

        prices.addAll(Arrays.asList(2.1, 3.2, 1.5, 2.3, 3.1, 1.2, 1.9, 6.1, 4.3, 2.7, 0.5));

        String continueShopping ;
        double totalPrice = 0.0;



        do{
            listProducts();
            System.out.println("Choose your product by number:");
            int productNumber = scan.nextInt();

            System.out.println("Enter weight:");
            double kg = scan.nextDouble();

            addToBasket(productNumber, kg);
            totalPrice = Math.round(printBasket());
            System.out.println("Would you like to continue shopping::");
            continueShopping = scan.next();
        }while(continueShopping.equalsIgnoreCase("y"));
        odeme(totalPrice);

    }

    public static void listProducts(){

        System.out.println("PrNo\t\tProducts\t\t\tPrices");
        System.out.println("----\t\t--------\t\t--------");
        for(int i = 0; i< products.size(); i++){

            System.out.println(i +"\t\t\t" + products.get(i) + "\t\t\t" + prices.get(i));
        }
    }


    public static void addToBasket(int productNumber, double kg) {

        productsOfBasket.add(products.get(productNumber));
        basketKg.add(kg);
        basketPrices.add(prices.get(productNumber) * kg);
    }


    public static double printBasket(){

        double totalPrice = 0.0;
        double totalKg = 0.0;

        System.out.println("Product Name\t\tKg\t\tPrice");
        System.out.println("-----------------------------------");

        for(int i = 0; i< productsOfBasket.size(); i++) {
            System.out.println(productsOfBasket.get(i) + "\t\t\t\t" + basketKg.get(i) + "\t\t" + basketPrices.get(i));
            totalPrice += basketPrices.get(i);
            totalKg += basketKg.get(i);
        }

        System.out.println("-----------------------------------");
        System.out.println("Total:\t\t\t\t" + totalKg + "\t\t" + totalPrice);
        return totalPrice;
    }

    public static void odeme(double totalPrice){
        Scanner scan  = new Scanner(System.in);

        System.out.println("***********************************");
        System.out.println("************* PAYMENT ***************");
        System.out.println("TOTAL PRICE TO BE PAID:" + totalPrice);
//		System.out.printf("TOTAL PRICE TO BE PAID: %.2f", totalPrice);
        double nakit = 0.0;
        do {
            System.out.print("Please enter your money amount: ");
            nakit += scan.nextDouble();
            if(nakit < totalPrice) {
                System.out.println("Entered amount does not enough.");
                System.out.println((totalPrice - nakit) + " $ You need to deposit more.");
            }
        }while(nakit < totalPrice);

        double restOfMoney = nakit - totalPrice;
        if (restOfMoney > 0) {
            System.out.println("Rest of money:" + restOfMoney);
        }
        System.out.println("WE WAIT AGAIN");
    }
}