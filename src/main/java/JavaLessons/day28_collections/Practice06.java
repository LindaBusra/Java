package JavaLessons.day28_collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Practice06 {


    public static void main(String[] args) {


        LinkedList<String> programs = new LinkedList<>();
        Scanner scan =  new Scanner(System.in);
        char choose;

        while(true){

            System.out.println("Write the programs that you want to use. Enter q for finish");
            String prog = scan.next();
            choose = prog.charAt(0);
            if(choose == 'q' || choose == 'Q') {

                break;
                }

            programs.add(prog);


        }


        //Make a list with the names of these programs. { PHP, SQL, HTML, C++, Java}
        // And print them on the console like that :  1a) Java 2b) C++ 3c) PHP 4d) HTML 5e) SQL


        System.out.println("The programs that you want to use in this jobb :");
        Iterator<String> itr1 = programs.iterator();

        int i=1;
        char chr = 'a';
        while (itr1.hasNext()) {

            System.out.print(i + "" + chr + ")" + itr1.next()+" ");
            i++;
            chr++;
        }
    }
}
