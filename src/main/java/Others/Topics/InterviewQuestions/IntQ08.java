package Others.Topics.InterviewQuestions;

import java.util.*;

public class IntQ08 {

    	/*
	 	Create a list by getting the list elements from user
	 	If there is duplicated elements remove them from the list
	*/

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter list elements, to stop entrance press '*'");
        String str = "";
        List<String> myList = new ArrayList<>();

        while (!str.equals("*")) {

            str = scan.next();
            if (!str.equals("*")) {        //or if (!str.equals("*") && !myList.contains(str))
                myList.add(str);

            }
        }

        System.out.println("Your list before: " + myList);


        //If they ask you to remove duplicated elements from a collection tell them I convert
        //the collection to set

        Set<String> listSet = new HashSet<>(myList);
        System.out.println("Your list after removing: " + listSet);
    }




}