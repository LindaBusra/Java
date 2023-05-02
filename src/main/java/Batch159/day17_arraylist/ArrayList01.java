package Batch159.day17_arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList01 {

    public static void main(String[] args) {


        //Example 1: Type code to check if the elements in a String ArrayList are in alphabetical order or not
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Tampa");
        cities.add("Albany");
        cities.add("Jacksonville");

        System.out.println(cities);

        ArrayList<String> newCities = new ArrayList<>();
        newCities.addAll(cities);
        System.out.println("New cities: " + newCities);

        Collections.sort(cities);
        //sort() method puts the list elements in "alphabetical order" if the elements are String.
        //sort() method puts the list elements in "ascending order" if the elements are numbers
        //  "alphabetical order" and "ascending order" are called "Natural Order"

        System.out.println("New cities after sorting alphabetical order: " + newCities);

        if(cities.equals(newCities)) {
            System.out.println("Elements are in alphabetical order");
        } else {
            System.out.println("Elements are not in alphabetical order");
        }







    }
}
