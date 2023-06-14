package Others.MyPractice.P4;

public class Q78 {

    public static void main(String[] args) {

        /* OK
		There is a lonely monkey in the island
		He needs to eat 4 bananas every day
		there are just 165 bananas in that island
		Create following variables and find how many days
		monkey can survive.
		Use do while loop, increment and decrement and if statements
		int numberOfBananas =165, survivalDays = 1;
		boolean monkeyAlive = true;
		*/


        int numberOfBananas =165, survivalDays = 1;
        boolean monkeyAlive = true;


        do{

            if(numberOfBananas>3) {

                numberOfBananas -= 4;
                survivalDays++;

            } else {
                monkeyAlive = false;
                break;
            }

        }while(monkeyAlive);


        System.out.println("Survival days: " + survivalDays);





    }
}
