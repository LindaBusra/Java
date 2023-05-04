package Batch159.day19_arraylists_varargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList02 {

    public static void main(String[] args) {


        //Example 1: Ask user to enter an integer from 1 to 10
        //           If the number user entered exists in the Database(DB) change the number to "Bingo"
        //           If the number user entered does not exist in the DB add it into the DB
        //           If all records in the DB is "Bingo" give a message to the user like "You won!"

        List<String> dataBase= new ArrayList<>();

        dataBase.add("5");
        dataBase.add("8");
        dataBase.add("2");
        dataBase.add("9");

        //note:
        System.out.println(dataBase.get(1));            //8
        System.out.println(dataBase.indexOf("5"));      //0, dataBase.set(dataBase.indexOf("8"), "Win" ); change data


        Scanner scan = new Scanner(System.in); //We don't need to create object again and again in do-while loop


        int count = 0;

        do{
            System.out.println("Enter an integer from 1 to 10");
            String n = scan.next();
            int num = Integer.valueOf(n);

            if(num>10 || num<1) {
                System.out.println("Use the numbers from 1 to 10");
            }

            if(dataBase.contains(n)) {

                dataBase.set(dataBase.indexOf(n), "Bingo");
                count++;

            } else {
                dataBase.add(n);
            }

            if(count==dataBase.size()) {
                System.out.println("Won");
                break;
            }
        }while(true);

        System.out.println(dataBase);




    }
}
