package Batch159.day18_arraylist;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {


        //Example 1: Type code to find the number of different elements in an arraylist
        //           [2, 3, 1, 2, 1, 5, 3] ==> [2, 3, 1, 5] ==> 4

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(3);
        nums.add(1);
        nums.add(2);
        nums.add(1);
        System.out.println(nums);

        ArrayList<Integer> newNums = new ArrayList<>();

        for(Integer w: nums) {

            if(!newNums.contains(w)) {
                newNums.add(w);
            }
        }

        System.out.println(newNums.size());





        //Example 2: Type code to increase salaries in a list like if the salary is less than 10000
        //           increase it %20 otherwise increase it by adding 500
        ArrayList<Double> salaries = new ArrayList<>();
        salaries.add(9810.0);
        salaries.add(12450.0);
        salaries.add(15230.0);
        salaries.add(7500.0);
        salaries.add(10000.0);
        System.out.println(salaries);// [9810.0, 12450.0, 15230.0, 7500.0, 10000.0]



        //1.st way
        for(Double w : salaries){
            if(w<10000.0){
                salaries.set(salaries.indexOf(w), w*1.2);
            }else {
                salaries.set(salaries.indexOf(w), w+500);
            }
        }



        //2.way:
        ArrayList<Double> newSalaries = new ArrayList<>();

        for(Double w: salaries) {

            if(w<10000) {
                newSalaries.add(w*1.20);
            } else {
                newSalaries.add(w+500);
            }
        }

        System.out.println(newSalaries);



    }
}
