package JavaLessons.day30_hashtable_iterators;

import java.util.*;

public class TreeMap01 {
    public static void main(String[] args) {

  /*
        1-TreeMap puts the entries in "Natual Order" according to the "Keys". When you created a tree map, it pull all entries
        in natural order by using keys.
        2-TreeMap is the slowest Map.
        3-TreeMap is not "thread-safe", and is not "synchronized"

        HashMap, HashTable, TreeMap

        //If you need key values structure you should use Maps. You will store student information, you will need maps.
        //Map types:HashMap, HashTable, TreeMap
        //You should be familiar with their characteristics and their methods.


   */


        TreeMap<String, Integer> countryPopulations = new TreeMap<>();
        countryPopulations.put("USA", 400000000);
        countryPopulations.put("Germany", 85000000);
        countryPopulations.put("Turkey", 81000000);
        countryPopulations.put("Afghanistan", 30000000);
        countryPopulations.put("Turkey", 82000000);
        System.out.println(countryPopulations);



        //If the "Key" inside the ceilingEntry() method parenthesis is the same with any key inside the treeMap, you will get the entry itself
        //If the "Key" inside the ceilingEntry() method parenthesis is before any key, it returns the next entry.

        Map.Entry<String,Integer> abc = countryPopulations.ceilingEntry("P");  //in national, after de W there is Turkey. it gets key and value
        //Ceiling means next element.
        System.out.println(abc);

        System.out.println(countryPopulations.ceilingKey("S"));    //Germany-->it gets just key



        NavigableSet<String> keyInDescendingOrder = countryPopulations.descendingKeySet();
        System.out.println(keyInDescendingOrder);                   //[USA, Turkey, Germany, Afghanistan]


        NavigableMap<String,Integer> mapInDescendingOrder = countryPopulations.descendingMap();
        System.out.println(mapInDescendingOrder);                   //{USA=400000000, Turkey=81000000, Germany=85000000, Afghanistan=30000000}

        System.out.println("-----------");

        System.out.println(countryPopulations.floorKey("S"));  // it brings just previous key name

        Map.Entry<String,Integer> def = countryPopulations.floorEntry("S");   //it gives me previous one.
        System.out.println(def);

        Map.Entry<String,Integer> def1 = countryPopulations.floorEntry("Germany");   //it gives me previous one.
        System.out.println(def1);    //if it is same, it give me Germany



        //lowerEntry("Germany") method gives the previous entry under every condition but floorEntry("Germany") method gives the same entry for the existing keys.
        //lowerEntry("Germany") method is like "<", floorEntry("Germany") is like "<="
        Map.Entry<String,Integer> ghi = countryPopulations.lowerEntry("Germany");
        System.out.println(ghi);        //It give me previous one   Afghanistan=30000000


        SortedMap<String,Integer> subMap1 =  countryPopulations.subMap("Afghanistan", "Turkey");   //From to.  but last one exclusive
        System.out.println(subMap1);

        SortedMap<String,Integer> subMap2 =  countryPopulations.subMap("Afghanistan", false, "Turkey", true);   //by false, I said make Afghanistan exclusive
        System.out.println(subMap2);                //{Germany=85000000, Turkey=81000000}

        SortedMap<String,Integer> tallMap1 =  countryPopulations.tailMap( "Turkey");   //start form that, to the end
        System.out.println(tallMap1);

        NavigableMap<String,Integer> tallMap2 =  countryPopulations.tailMap( "Turkey", false);   //start form that (but exclusive), to the end
        System.out.println(tallMap2);


    }



}
