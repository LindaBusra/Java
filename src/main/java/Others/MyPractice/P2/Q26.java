package Others.MyPractice.P2;

import java.util.Scanner;

public class Q26 {

    public static void main(String[] args) {



 /*	 	Get a String and a character from user
	 	Count the number of characters between the first occurence and the last occurence of the given character in the String
	 	Do not count the space characters
	 	If the character which user selected is displayed just once in the String return -1
	 	If the character which user selected does not exist in the String return -1
	 	For example; "Java is easy" - 'a' ==> 3
	 	             "Java is easy" - 'w' ==> -1
	 	             "Java is easy" - 'e' ==> -1
	 */



        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String...");
        String st = scan.nextLine();

        System.out.println("Enter a character...");
        String letter = scan.next().toLowerCase();

        st = st.replaceAll("[^a-zA-Z]", "");

        String str[] = st.split("");

        int count = 0;

        for (int i = 0; i < str.length; i++) {

            if (str[i].equals(letter)) {

                count++;
            }
        }


        if (count == 1 || count == 0) {
            System.out.println("-1");
        } else {
            System.out.println(letter + " = " + count);
        }

    }
}


