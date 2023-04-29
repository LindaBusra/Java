package Batch159.day14_arrays_foreachloop;

import java.util.Scanner;

public class Arrays02 {

    public static void main(String[] args) {


        //Example 1: Type code lets user enter many student names into an array.
        //           Whenever user wants he should be able to quit
        //           When I quit or complete I should be able see all elements on the console.


        //1.way:
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of the students you want to add...");
        int n = input.nextInt();
        String[] names = new String[n];

        for(int i=0; i<n; i++){

            System.out.println("Please enter " + (i+1) + ". student name, to quit press 'q'");

            String stdName = input.next();

            if(!stdName.equalsIgnoreCase("Q")){

                names[i] = stdName;

            }else{
                break;
            }
        }
        //[r, u, t, null, null, null, ...]
        for(String w : names){
            if(w==null){            //it will be faster, because in first "null" it stops to run
                break;
            }
            System.out.print(w + " ");
        }



        //2nd way:
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of the students you want to add...");
        int num = scan.nextInt();

        String st[] = new String[num];

        int start=0;

        while(start<num) {

            System.out.println("Enter a name");
            st[start] = scan.next();
            start++;

            if(start<num) {
                System.out.println("Will you continue? Y/N");
                char ansvar = scan.next().toLowerCase().charAt(0);

                if(ansvar=='y'){
                    continue;
                } else {
                    break;
                }
            }



        }

        for(String w: st){
            if(w==null){
                break;
            }
            System.out.println(w);
        }




    }
}
