package Others.Topics.Random;

import java.util.ArrayList;
import java.util.List;

public class RandomGenerator {

    public static void main(String[] args) {



        /* Create a class : RandomNameGenerator
         * Step1: Ask user to enter his/her name //john walker
         * Step2: Delete the spaces in the username//johnwalker
         * Step3: Check if the username is already taken//list("sam","johnmary","johnwalker","johnwalker523463146")
         * Step4: If there the username is not taken, then print: This username is available
         * Step5: If the username is already taken, then print This username is already taken
         * Step6: Then generate a random number, add to the name, and Print the new username
         */

        //Create a list
        List<String> userList=new ArrayList<>();
        userList.add("Johnwalker");
        userList.add("johnmarry");
        userList.add("samwalton");
        userList.add("juliebrow");

        String myName = "johnwalker";
        for(String name:userList) {
            if(name.equalsIgnoreCase(myName)){
                System.out.println("This username is already taken");
                break;
            }else {
                System.out.println("This username is available");
                break;
            }
        }
    }
}
