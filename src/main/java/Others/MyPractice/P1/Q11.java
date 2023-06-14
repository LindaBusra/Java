package Others.MyPractice.P1;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Q11 {


    /*
	 	Create a list by getting the list elements from user
	 	If there is duplicated elements remove them from the list
	*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String list elements. For quick enter \"*\"");


        ArrayList<String> arr = new ArrayList<>();
        String input = "";

        while(! input.equals("*") ) {

            input = scan.next();

            if (!input.equals("*")) {
                arr.add(input);

            }
        }


        ArrayList<String> arr2 = new ArrayList<>();

        for(int i=0; i<arr.size(); i++) {

            if( ! arr2.contains(arr.get(i))) {

                arr2.add(arr.get(i));
            }
        }

        System.out.println("Your list is : " + arr2);
    }
}
