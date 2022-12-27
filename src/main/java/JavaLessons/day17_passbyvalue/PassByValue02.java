package JavaLessons.day17_passbyvalue;

public class PassByValue02 {
    public static void main(String[] args) {


        double price = 100;         //Pass by Value

        discountForVeteran(price);
        discountForSeniors(price);

        System.out.println(price);



    }

    public static void discountForVeteran(double price) {
        price = price * 0.80;
        System.out.println("Price for Veteran:" + price);
    }

    public static void discountForSeniors(double price) {
        price = price * 0.90;
        System.out.println("Price for Seniors: " + price);
    }
}
