package Others.Projects.BankProject;


import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Options extends Account {
    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");


    Map<Integer,Integer>  data = new HashMap<>();


    boolean flag = true;

    public void login(){

        System.out.println("Welcome to ATM...");

        int counter = 0;

        do{
            data.put(12345, 1234);  //account number, pin number   person A
            data.put(23456,2345);   //person B
            data.put(34567,3456);   //person C
            data.put(45678,4567);   //person D

            try{
                System.out.println("Enter the account number");
                setAccountNumber(input.nextInt());
                System.out.println("Enter the pin number");
                setPinNumber(input.nextInt());
            }catch (Exception e) {
                System.out.println("You entered an invalid character(s)!");
                System.out.println("Please provide an integer to proceed or press Q to quit the system");
                input.nextLine();
                String exit = input.nextLine();

                if(exit.equalsIgnoreCase("q")) {
                    System.out.println("See you");
                    flag=false;
                    break;
                } else{
                    System.out.println("You entered integer you are going to login");
                    continue;
                }
            }
            int count=0;
            for(Map.Entry<Integer,Integer> w:data.entrySet()) {  //check key and value same time

                if(w.getKey().equals(getAccountNumber()) && w.getValue().equals(getPinNumber())) {
                    getAccountTypes();  //you can start your actions with any account
                } else {
                    count++;
                }
            }

            if(count==data.size()) {
                counter++;
                System.out.println("Account number or pin number is invalid!");
                System.out.println("Press any integer to proceed or press q to quit");

                String exit =input.nextLine();

                if(exit.equalsIgnoreCase("q")) {
                    flag=false;
                }
            }

            if(counter==3) {
                System.out.println("Your account has been blocked!");
                flag = false;
            }


        }while(flag);

    }


    public void getAccountTypes(){
        System.out.println("Select the account you want to access!");
        System.out.println("1:Checking account");
        System.out.println("2:Saving account");
        System.out.println("3:Quit");

        int option = input.nextInt();

        switch(option) {
            case 1:
                System.out.println("You are in checking account!");
                checkingOperations();
                break;
            case 2:
                System.out.println("You are in saving account!");
                savingOperations();
                break;
            case 3:
                flag=false;
                break;
            default:
                System.out.println("Invalid choice! Please select 1,2,3");
 //               getAccountTypes();
        }
    }


    public void checkingOperations(){
        do {

            optionsDisplay();


            int option = input.nextInt();
            if (option == 4){
                break;
            }
            switch (option){
                case 1:
                    System.out.println("Your checking balance is: "+moneyFormat.format(getCheckingBalance()));
                    break;
                case 2:
                    getCheckingWithdraw();
                    break;
                case 3:
                    getCheckingDeposit();
                    break;
                default:
                    System.out.println("Invalid option! Please select 1,2,3 or 4");
            }
        }while(true);
           getAccountTypes();
    }

    // get saving operations
    public void savingOperations(){

        do {

            optionsDisplay();

            int option = input.nextInt();
            if (option == 4){
                break;
            }
            switch (option){
                case 1:
                    System.out.println("Your saving balance is :" + moneyFormat.format(getSavingBalance()));
                    break;
                case 2:
                    getSavingWithdraw();
                    break;
                case 3:
                    getSavingDeposit();
                    break;
                default:
                    System.out.println("Invalid option! Please select 1,2,3 or 4");
            }

        }while(true);
        getAccountTypes();
    }




    public void optionsDisplay(){
        System.out.println("Select Options: ");

        System.out.println("1: View Balance");
        System.out.println("2: Withdraw");
        System.out.println("3: Deposit");
        System.out.println("4: Exit");
    }

}