package Batch159.day19_arraylists_varargs;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList01 {
    public static void main(String[] args) {


        //Example 1: Ask user to create an email address
        //           If the email is unused accept it as email address
        //           If the email is used give a message to user and create a unique email address for the user

        List<String> emailDB= new ArrayList<>();
        emailDB.add("abc@gmail.com");
        emailDB.add("bcd@gmail.com");
        emailDB.add("cde@gmail.com");
        emailDB.add("ac@gmail.com");
        emailDB.add("bd@gmail.com");


        Scanner input= new Scanner(System.in);
        System.out.println("Create an email address");
        String email=input.next();

        if (emailDB.contains(email)){
            System.out.println("This email is already in use, please take anyone of the followings...");

            LocalDate currentDate = LocalDate.now();
            String date= currentDate.toString().replaceAll("[^0-9]", "");
            System.out.println("current date :" + date);

            LocalTime currentTime= LocalTime.now();
            System.out.println("current time : " + currentTime);
            String time = currentTime.toString().substring(0,8).replaceAll("[^0-9]","");
//            String time= currentTime.toString().split("\\.")[0].replaceAll("[^0-9]", "");  //or split("\\.") cut from .

            String recommendedEmail= email.split("@")[0]+ date+ time+ "@"+ email.split("@")[1];
            System.out.println("recommendedEmail :" + recommendedEmail);

        }else{

            System.out.println("This email can be used");
            emailDB.add(email);

        }
        System.out.println(emailDB);




    }
}
