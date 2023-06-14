package Others.Topics.Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("plz create your shopping list. To complete press q");
        List<String> items = new ArrayList<>();
        int i = 0;

        while(true ) {

               String product =  input.nextLine();

               if(product.equalsIgnoreCase("q"))  {
                   break;
               }
               items.add(product);
               i++;
            }


        System.out.println("Your list ready:");
        System.out.println(items);

        System.out.println("Do you want any updates/remove y/n");
        String finish=input.next();

        if (finish.equalsIgnoreCase("n")){
            System.out.println("You are ready to shopping"+ items);


        }else {
            System.out.println("What do you want. R:remove  U:update A:add");
            String selection=input.next();

            if (selection.equalsIgnoreCase("a")){
                System.out.println("Adding element");
                String newElement=input.next();
                items.add(newElement);
                System.out.println("Your new list is: " + items);

            } else if (selection.equals("u")) {
                System.out.println("Which one will you update");
                String toUpdate=input.next();
                System.out.println("Type new one");
                String updated=input.next();
                items.set(items.indexOf(toUpdate),updated );
                System.out.println("Your new list is: " + items);

            } else if (selection.equals("r")) {
                System.out.println("Which one will you remove");
                String removed=input.next();

                items.remove(removed);
                System.out.println("Your new list is: " + items);

            }else {
                System.out.println("Your new list is: " + items);








                }

        }

    }}
















