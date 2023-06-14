package Others.Projects.UcusProjesi;

import java.util.Scanner;

public class JavaAirlines {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Welcome to JavaAirlines... \nChoose one of the route : B, C, D ");
        String city=scan.next().toUpperCase();
        System.out.print("Select your flight: \none way -->1 \ndouble direction-->2");
        int flyType=scan.nextInt();

        System.out.print("Enter your age : ");
        int age=scan.nextInt();
        double priceB=0.10*500;
        double priceC=0.10*700;
        double priceD=0.10*900;

        if(city.equals("B")  ||  city.equals("C")  ||  city.equals("D")){

            if(age>65){
                if (city.equals("B")){
                    if(flyType==1){
                        System.out.println("      ******     ");
                        System.out.println("Payment amount for your flight : "+priceB*0.7+" $");
                    }else if(flyType==2){
                        System.out.println("      ******     ");
                        System.out.println("Payment amount for your flight : "+(priceB*0.7*0.8)*2+" $");
                    }else{
                        System.out.println("You entered wrong data!");
                    }
                }else if (city.equals("C")){
                    if(flyType==1){
                        System.out.println("      ******     ");
                        System.out.println("Payment amount for your flight : "+priceC*0.7+" $");
                    }else if(flyType==2){
                        System.out.println("      ******     ");
                        System.out.println("Payment amount for your flight : "+(priceC*0.7*0.8)*2+" $");
                    }else{
                        System.out.println("You entered wrong data!");
                    }
                }else if (city.equals("D")){
                    if(flyType==1){
                        System.out.println("      ******     ");
                        System.out.println("Payment amount for your flight : "+priceD*0.7+" $");
                    }else if(flyType==2){
                        System.out.println("      ******     ");
                        System.out.println("Payment amount for your flight : "+(priceD*0.7*0.8)*2+" $");
                    }else{
                        System.out.println("You entered wrong data!");
                    }
                }

            }else if(age>12 && age<24){
                if (city.equals("B")){
                    if(flyType==1){
                        System.out.println("      ******     ");
                        System.out.println("Payment amount for your flight : "+priceB*0.9+" $");
                    }else if(flyType==2){
                        System.out.println("      ******     ");
                        System.out.println("Payment amount for your flight : "+(priceB*0.9*0.8)*2+" $");
                    }else{
                        System.out.println("You entered wrong data!");
                    }
                }else if (city.equals("C")){
                    if(flyType==1){
                        System.out.println("      ******     ");
                        System.out.println("Payment amount for your flight : "+priceC*0.9+" $");
                    }else if(flyType==2){
                        System.out.println("      ******     ");
                        System.out.println("Payment amount for your flight : "+(priceC*0.9*0.8)*2+" $");
                    }else{
                        System.out.println("You entered wrong data!");
                    }
                }else if (city.equals("D")){
                    if(flyType==1){
                        System.out.println("      ******     ");
                        System.out.println("Payment amount for your flight : "+priceD*0.9+" $");
                    }else if(flyType==2){
                        System.out.println("      ******     ");
                        System.out.println("Payment amount for your flight : "+(priceD*0.9*0.8)*2+" $");
                    }else{
                        System.out.println("You entered wrong data!");
                    }
                }

            }else if(age>=0 && age<=12){
                if (city.equals("B")){
                    if(flyType==1){
                        System.out.println("      ******     ");
                        System.out.println("Payment amount for your flight : "+priceB*0.5+" $");
                    }else if(flyType==2){
                        System.out.println("      ******     ");
                        System.out.println("Payment amount for your flight : "+(priceB*0.5*0.8)*2+" $");
                    }else{
                        System.out.println("You entered wrong data!");
                    }
                }else if (city.equals("C")){
                    if(flyType==1){
                        System.out.println("      ******     ");
                        System.out.println("Payment amount for your flight : "+priceC*0.5+" $");
                    }else if(flyType==2){
                        System.out.println("      ******     ");
                        System.out.println("Payment amount for your flight : "+(priceC*0.5*0.8)*2+" $");
                    }else{
                        System.out.println("You entered wrong data!");
                    }
                }else if (city.equals("D")){
                    if(flyType==1){
                        System.out.println("      ******     ");
                        System.out.println("Payment amount for your flight : "+priceD*0.5+" $");
                    }else if(flyType==2){
                        System.out.println("      ******     ");
                        System.out.println("Payment amount for your flight : "+(priceD*0.5*0.8)*2+" $");
                    }else{
                        System.out.println("You entered wrong data!");
                    }
                }

            }else if (age>=24 && age<=65){
                if (city.equals("B")){
                    if(flyType==1){
                        System.out.println("      ******     ");
                        System.out.println("Payment amount for your flight : "+priceB+" $");
                    }else if(flyType==2){
                        System.out.println("      ******     ");
                        System.out.println("Payment amount for your flight : "+(priceB*0.8)*2+" $");
                    }else{
                        System.out.println("You entered wrong data!");
                    }
                }else if (city.equals("C")){
                    if(flyType==1){
                        System.out.println("      ******     ");
                        System.out.println("Payment amount for your flight : "+priceC+" $");
                    }else if(flyType==2){
                        System.out.println("      ******     ");
                        System.out.println("Payment amount for your flight : "+(priceC*0.8)*2+" $");
                    }else{
                        System.out.println("You entered wrong data!");
                    }
                }else if (city.equals("D")){
                    if(flyType==1){
                        System.out.println("      ******     ");
                        System.out.println("Payment amount for your flight : "+priceD+" $");
                    }else if(flyType==2){
                        System.out.println("      ******     ");
                        System.out.println("Payment amount for your flight : "+(priceD*0.8)*2+" $");
                    }else{
                        System.out.println("You entered wrong data!");
                    }
                }

            }else{
                System.out.println("Please enter your age correctly");
            }

        }else System.out.println("You entered wrong data!");





    }
}
