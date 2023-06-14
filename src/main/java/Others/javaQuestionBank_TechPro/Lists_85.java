package Others.javaQuestionBank_TechPro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists_85 {
    public static void main(String[] args) {



//7) Find the closest 2 integers in an Integer List
// Example: (12, 31, 15, 13, 54) ==> Output is 12 and 13

//        ArrayList<Integer> list = new ArrayList<>();
//
//        list.add(12);
//        list.add(31);
//        list.add(15);
//        list.add(13);
//        list.add(54);
//
//        System.out.println(list);       //before [12, 31, 15, 13, 54]
//
//        Collections.sort(list);
//        System.out.println(list);       //after sort [12, 13, 15, 31, 54]
//
//        int min = list.get(1)-list.get(0);
//
//
//
//        for(int i=1; i<list.size(); i++) {
//
//            min = Math.min(min, list.get(i)-list.get(i-1));     //find min difference
//        }
//
//
//        for(int i=1; i<list.size(); i++) {
//
//            if(min == list.get(i)-list.get(i-1))  {
//
//                System.out.println(list.get(i) + " " + list.get(i-1));      //print two closes numbers
//            }
//        }



//--------------------------------------------------------------------------------------------------------



//8) Increase the value of every element except 7 and 10 by 2 in a List
//        Example: (12, 31, 7, 13, 10) ==> Output is (14, 33, 7, 15, 10)



//        ArrayList<Integer> numbers = new ArrayList<>();
//
//         numbers.add(12);
//         numbers.add(31);
//         numbers.add(7);
//         numbers.add(13);
//         numbers.add(10);
//
//
//         int given1 = 7;
//         int given2= 10;
//
//         for(int w: numbers) {
//
//             if(w==given1 || w==given2) {
//                 continue;
//             }
//             numbers.set(numbers.indexOf(w), w+2);
//
//         }
//
//        System.out.println(numbers);




//9) Find the sum of all prices given in a String list
//Example: List<String> myList = new List<String>{'$12.99', '$23.60', '$54.45'}; ==> 91.04

//        List<String> myList = new ArrayList<>();
//
//        myList.add("$12.99");
//        myList.add("$23.60");
//        myList.add("$54.45");
//
//        double sum = 0;
//        for(String w:myList) {
//
//            Double price = Double.valueOf(w.replace("$", ""));
//
//            sum += price;
//
//        }
//
//        System.out.println("The sum of all prices: " + sum + "$");




//10) Find the sum of the least and the greatest price given in a String list
//Example: List<String> myList = new List<String>{'$12.99', '$8.25', '$23.60', '$54.45'}; ==> 62.70


    ArrayList<String> myList = new ArrayList<>();

    myList.add("$12.99");
    myList.add("$8.25");
    myList.add("$23.60");
    myList.add("$54.45");


    ArrayList<Double> db= new ArrayList<>();        //I need a new array


    for(String w: myList) {

        Double price = Double.valueOf(w.replace("$", ""));      //to delete $
        db.add(price);
    }


    Collections.sort(db);

    double min = db.get(0);
    double max = db.get(db.size()-1);

    System.out.println("The sum of the least and the greatest price : " + (min+max));










            }
        }
