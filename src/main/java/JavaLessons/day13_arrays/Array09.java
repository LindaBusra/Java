package JavaLessons.day13_arrays;

import java.util.Arrays;

public class Array09 {

    public static void main(String[] args) {


//Put each word to an array as an element


        String words = "I go to school";
        String array [] = words.split(" ");
        System.out.println(Arrays.toString(array));

        String name = "Sevval#Mustafa#Suat#Fatmanur";
        String nameArray [] = name.split("#");
        System.out.println(Arrays.toString(nameArray));

        String sentence = "Learn Java earn money";
        String arrSentence [] = sentence.split(" ");
        System.out.println(Arrays.toString(arrSentence));


        //I go to school and I talk to friends and I talk to teachers
        //Please separate each sentence from "and" put them in an array.
        String sent = "I go to school and I talk to friends and I talk to teachers";
        String arr [] = sent.split("and");
        System.out.println(Arrays.toString(arr));


      //Please split this one into its letters
        String name1 = "FatmaSeher"; //[F,a,t,m,a,S,e,h,e,r]
        String nameArray1 [] = name1.split(""); //String
        System.out.println(Arrays.toString(nameArray1));



        //Please split this name into a char array.         convert array to charArray

        String name2 = "FatmaSeher";
        char[] name2New = name2.toCharArray();

        System.out.println("Char array => " + Arrays.toString(name2New));



//--------------------------------------------------------------------------------------------



/*      Please split the dates and get day, month and the year separately on the console
        day : 25
        month : 02
        year : 2022
         */


        String date = "25/02/2022";
        String dateArray [] = date.split("/");
        System.out.println(Arrays.toString(dateArray));

        System.out.println("Day: " + dateArray[0]);
        System.out.println("Month: " + dateArray[1]);
        System.out.println("Year: " + dateArray[2]);

       //2.way:
        System.out.println("Day: " + date.split("/")[0]); //25
        System.out.println("Month: " + date.split("/")[1]); //02
        System.out.println("Year: " + date.split("/")[2]); //2022








    }
}
