package Others.Topics.Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignmnet {
    public static void main(String[] args) {


         /* - Type code to ask user to enter the int elements and add elements into the list
        - Ask user to enter the elements to remove, then remove that element from list.
        - Ask user to enter the element to update, then update it.

  */
        Scanner scan =new Scanner(System.in);
        ArrayList<Integer>  numbers= new ArrayList<>();


        int i=0;
        while(true) {

            System.out.println("Enter your " + (i+1) + ". list element. If you will you can quit with Q");


            String a = scan.next();


            if(a.equalsIgnoreCase("Q")) {
                break;
            }
            numbers.add(Integer.valueOf(a));

            i++;

        }

        System.out.println("Your integer elements :" + numbers);



        System.out.println("Do you want to remove or update any elements. Yes:Y / No :N");
        String chose=scan.next();

        if (chose.equalsIgnoreCase("N")){
            System.out.println("Your actual integer elements list "+ numbers);


        }else {
            System.out.println("What do you want. R:remove / U:update");
            String selection=scan.next();

            if  (selection.equalsIgnoreCase("u")) {
                System.out.println("Which element will you update");
                int numberForUpdate =scan.nextInt();
                System.out.println("Type the new element");
                int newNumber =scan.nextInt();
                numbers.set(numbers.indexOf(numberForUpdate), newNumber );
                System.out.println("Your actual integer elements list: " + numbers);

            } else if (selection.equalsIgnoreCase("r")) {
                System.out.println("Which elements will you remove");
                int removeIt = scan.nextInt();

                numbers.remove(Integer.valueOf(removeIt));

                System.out.println("Your actual integer elements list: " + numbers);

            }else {
                System.out.println("Your actual integer elements: " + numbers);

            }
        }

    }
}
