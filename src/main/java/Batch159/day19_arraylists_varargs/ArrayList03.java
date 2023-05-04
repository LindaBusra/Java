package Batch159.day19_arraylists_varargs;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList03 {
    public static void main(String[] args) {

        // Get as many grades as a teacher wants to enter, and find the number of students who pass the average.


        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> examGradeList = new ArrayList<>();


        do{

            System.out.println("Enter exam grades");
            examGradeList.add(scan.nextInt());
            System.out.println("Will you continue?  Y/N");
            char ch = scan.next().toLowerCase().charAt(0);

            if (ch == 'n') {
                break;
            }

            if(ch != 'y') {
                System.out.println("You must enter Y for continue or N for quit");
                char ch1 = scan.next().toLowerCase().charAt(0);
                if (ch1 == 'n') {
                    break;
                } else {
                    continue;
                }
            }

        }while(true);   //while (true) ==> Infinite loop
        //As long as we do not use break code, this loop will keep repaiting.

        System.out.println("examGradeList = " + examGradeList);

        //Calculate the average
        double sum = 0;
        for(int w : examGradeList){
            sum += w;// sum = sum + w;
        }
        double average = sum/examGradeList.size();
        System.out.println("average = " + average);

        //Calculate how many students are above average
        int numOfStdAboveAverage = 0;

        for(int w : examGradeList){
            if(w>average){
                numOfStdAboveAverage++;
            }
        }

        System.out.println("numOfStdAboveAverage = " + numOfStdAboveAverage);


        System.out.println("The exam grades are: " + examGradeList);
        System.out.println("The average of class is : " +  average);
        System.out.println("There is " + numOfStdAboveAverage + " students whose exam grades is greater than average " + average);

    }
}
