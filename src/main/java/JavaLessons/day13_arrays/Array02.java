package JavaLessons.day13_arrays;

import java.util.Arrays;

public class Array02 {

    public static void main(String[] args) {



 //Example 1: Create a String array and print the elements in alphabetical order
// on the console in different lines


        String[] name = {"Aile", "Vidar","Mary", "Terje", "Amalia"};


        Arrays.sort(name);


        for(String w:name) {
            System.out.println(w);
        }


        //Find spesific element in the array

        String find = "Einar";

        Arrays.sort(name);                              ////It puts element in alfabetical order
        System.out.println(Arrays.toString(name));

        System.out.println(Arrays.binarySearch(name, find));



//-------------------------------------------------------------------------------------------



//Example 2: Create a String array and print the elements in alphabetical order on the console in different lines


    String cities[] = new String[5];

    cities[0] = "Tokyo";
    cities[1] = "Berlin";
    cities[2] = "Istanbul";
    cities[3] = "Jacsonville";
    cities[4] = "Calgary";

    System.out.println(Arrays.toString(cities));    //[Tokyo, Berlin, Istanbul, Jacsonville, Calgary]


    Arrays.sort(cities);        //It puts element in alfabetical order
    System.out.println(Arrays.toString(cities));    //[Berlin, Calgary, Istanbul, Jacsonville, Tokyo]


    for(String w:cities) {

        System.out.println(w);
    }




    }
}

