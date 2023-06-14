package Others.javaQuestionBank_TechPro;

import java.util.Arrays;

public class Loops69_2 {
    public static void main(String[] args) {


//Question 29- Type a program to print the integers from 1 to 100 without using any loop


    printNumbers(100);          //with method printNumbers()


//-----------------------------------------------------------------------------------------------------

//Question 30- Each line of input contains one or several words separated with single spaces. Type code to
//reverse the order of words in each line of input, while preserving the words themselves. The
//lines of your output should not have any trailing or leading spaces.
//Example; Kemal Can Kuzu will be converted to Kuzu Can Kemal

        String str ="Kemal Can Kuzu";
        String space= " ";


        //how many space in str
        String a[] = str.split("");
        int count = 0;
        for(String w: a) {

            if(w.equals(" ")) {
                count++;
            }
        }

        System.out.println(count);


        //To sprit sentences to words

        String b[] = str.split(" ");
        System.out.println(Arrays.toString(b));



        for(int i=b.length-1; i>=0; i--) {
            System.out.print(b[i]);

            if (count > 0) {
                System.out.print(space);

            }
            count--;
        }



    }


    static void printNumbers(int n) {
        if(n > 0) {
            printNumbers(n - 1);
            System.out.print(n + " ");
        }
        return;
    }
}
