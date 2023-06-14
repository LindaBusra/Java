package Batch159.day35_lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda04 {



    public static void main(String[] args) throws IOException {

        readTextFile();
        System.out.println(checkSpecificWordExistInAllLines("Lambda"));
        System.out.println(checkSpecificWordExistInAllLines("."));

        System.out.println(getWordsInListDistinctly());
        System.out.println(getWordsLengthLessThanSpecificLength(6));
        System.out.println(getTheTotalNumOfLetters());

    }

    //Example 1: Go to LambdaTextFile and print the text in the file on the console

    public static void readTextFile() throws IOException {

        //Files reading the test file line by line.   FileInputStream read character by character
        Files.
                lines(Paths.get("src/main/java/Batch159/day35_lambda/LambdaTextFile.txt")).
                forEach(System.out::println);
    }


    //Example 2: Go to LambdaTextFile and check if all lines have "Lambda" word

    public static boolean checkSpecificWordExistInAllLines(String word) throws IOException {

        return Files.
                lines(Paths.get("src/main/java/Batch159/day35_lambda/LambdaTextFile.txt")).
                allMatch(t->t.contains(word));

    }

    //Example 3: Get the words ends with 'e' in a list distinctly


    public static List<String> getWordsInListDistinctly() throws IOException {

        return Files.
                lines(Paths.get("src/main/java/Batch159/day35_lambda/LambdaTextFile.txt")).  //we have stream here
                map(t->t.split(" ")).        //I have to change line to word, so I use map(). No I have arrays in the stream
                flatMap(Arrays::stream).            //flatMap() breaks the Array structure in the stream. I  want to break array structure, and change to stream. every element puts in a stream
                map(t->t.replaceAll("[^A-Za-z]", "")).
                filter(t->t.endsWith("e")).
                distinct().
                collect(Collectors.toList());   //put the word in a list.

    }



    // Example 4: Get the words whose length is less than 6 put them in a list in lowercase and reverse order.

    public static List<String> getWordsLengthLessThanSpecificLength(int length) throws IOException {

      return  Files.
                lines(Paths.get("src/main/java/Batch159/day35_lambda/LambdaTextFile.txt")).  //1-then have 4 line in it. (look at text file)
                map(t->t.split(" ")).   //2-every line change to words array. Line elements changed to array.
                flatMap(Arrays::stream).        //3-I break array structure. Now I have a stream with words
                map(t->t.replaceAll("[^A-Za-z]", "")).
                filter(t->t.length()<length).
                map(t->t.toLowerCase()).
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());

    //if you access a method by using class name it is static method.

     }

    //Example 5: Create a method to find total number of all the letters used in the text file.

    public static int getTheTotalNumOfLetters() throws IOException {

        return Files.lines(Paths.get("src/main/java/Batch159/day35_lambda/LambdaTextFile.txt")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                map(t->t.replaceAll("[^a-zA-Z]", "")).
                map(t->t.length()).
                reduce(Math::addExact).     //this method added all the numbers in the stream
                get();       //to convert Optional Integer to regular Integer


    }

}
