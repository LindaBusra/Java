package JavaLessons.day07_stringmanipulations;

import java.util.Scanner;

public class StringManipulations18 {

    public static void main(String[] args) {


        //Get the initial from full name.(Middle Name is out of scope).
        //Tom Hanks ==> TH

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name please");
        String full = scan.nextLine();

        String fullNew = full.trim().toUpperCase();

        int a= fullNew.lastIndexOf(" ");

        String iFirst = fullNew.split(" ")[0].substring(0,1);
        String iLast = fullNew.substring(a+1, a+2);


        System.out.println(iFirst + iLast);




        //2. way

        String fullName= "      Tom Hanks  ";

        String initialOfFirstName= fullName.trim().substring(0, 1).toUpperCase();
        System.out.println("The initial is: " + initialOfFirstName); //T

        //trim() method removes the spaces just from the beginning and from the end.It does not touch spaces in
        //the middle.
        //substring(startingIndex, endIndex) method is used to get a specific part of a string.
        //starting index is inclusive, ending index is exclusive.

        String initialOfLastName= fullName.trim().split(" ")[1].substring(0, 1).toUpperCase();

        System.out.println("InitialOfLastName: " + initialOfLastName);
        System.out.println(initialOfFirstName+initialOfLastName);//TH

    }
}
