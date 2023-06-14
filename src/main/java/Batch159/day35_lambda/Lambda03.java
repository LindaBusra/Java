package Batch159.day35_lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda03 {

    //Same questions with package day34, but here we tried to use just functional programming.


    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        //with structural programming
        printEvenElements(nums);
        System.out.println();


        //with functional programming
        printEvens(nums);
        System.out.println();

        printSquareOfDistinctOddElements(nums);
        System.out.println();

        System.out.println(findSumOfCubeOfDistinctEvens(nums));
        System.out.println();

        System.out.println(findMax1(nums));
        System.out.println();
        System.out.println(findMax2(nums));
        System.out.println();
        System.out.println(findMax3(nums));
        System.out.println();


        System.out.println(findMin1(nums));
        System.out.println();
        System.out.println(findMin2(nums));
        System.out.println();
        System.out.println(findMin3(nums));
        System.out.println();


        System.out.println(findMultiplication(nums));
        System.out.println();


        System.out.println(isLessThanSpecificNumber(nums, 140));
        System.out.println();


        System.out.println(isNoneNegative(nums));
        System.out.println();


        System.out.println(isAnyElHasThreeDigits(nums));

        //in question, it says find, so we can use a method with return type like int
        //in question, it says print, so we can use a method with void return type, and use System.out.printLn

    }

    //Example 1: Create a method to print even elements in an integer list

    //1.Way: Use "Structural Programming"
    public static void printEvenElements(List<Integer> myList){
        for(Integer w: myList) {

            if(w%2==0) {
                System.out.print(w + " ");
            }
        }
    }


    //2.Way: Use  "Functional Programming"
    public static void printEvens(List<Integer> myList) {

        myList.
                stream().
                filter(Utils::checkIsEven).
                forEach(Utils::printInTheSameLineWithSpaces);
        //convert list (horizontal) to stream-->stream()->the elements puts in vertical structure
        //I convert to stream, because stream() has many methods
        //for printing every element forEach()
        //to make filtering filter(), if condition is true, select the element
        //this methods are %100 error free, so I want to use functional programming, Lambda
    }


    //Example 2: Create a method to print square of distinct (unique) odd elements
    public static void printSquareOfDistinctOddElements(List<Integer> myList){
        myList.
                stream().
                distinct().
                filter(Utils::checkIsOdd).
                map(Utils::getSquare).
                forEach(Utils::printInTheSameLineWithSpaces);
        //distinct() it gives unique elements
        //map() is for changing/updating existing elements
    }



    //Example 3: Create a method to find the sum of the cube of the different even elements in a list
    public static int findSumOfCubeOfDistinctEvens(List<Integer> myList){

        return  myList.
                stream().
                distinct().
                filter(Utils::checkIsEven).
                map(Utils::getCube).        //If you use a calculation just a couple of times that is why I did not create a method for it in Utils class
                reduce(Math::addExact).get();  //I used reduce() method with single parameter, so I complained, so I used get().  //reduce(0, (t, u)->t+u);  t=0, u= 1728  t+u=1728-->  t=1728, u=2744  t+u=4472-->t=4472  u= 1000  t+u=5472-->t=5472 u=64  t+u= 5536
        //reduce(starting value, the elements you will add, the result),  u takes the value from stream, t is i start 0, after that it takes the t+u
        //it names is reduce, because when we come form to map(), it was 4 elements, but the result we have just an elements -->5536, many values become just a value
    }



    //Example 4: Create a method to find the element whose value is the maximum
    //1.Way:
    public static int findMax1(List<Integer> myList) {

        //I used distinct() because we dont need to compare with the same numbers again and again
        return myList.stream().distinct().reduce(Math::max ).get();
    }

    //2.way:
    public static int findMax2(List<Integer> myList) {

        return myList.stream().distinct().reduce(myList.get(0),Math::max );
    }


    //3.way:
    public static int findMax3(List<Integer> myList) {

        return myList.stream().distinct().sorted(Comparator.reverseOrder()).findFirst().get();
        //get(): to convert Optional<Integer> to regular integer, I used after reduce(), get() method

    }




    //Example 5: Create a method to find the element whose value is the minimum
    //1.Way:
    public static int findMin1(List<Integer> myList){

        return myList.
                stream().
                distinct().
                sorted().               //after sorted(), to get first element, I use findFirst()
                        findFirst().get();      //get(): to convert Optional<Integer> to regular integer

    }


    //2.way:
    public static int findMin2(List<Integer> myList){

        return myList.stream().distinct().reduce(myList.get(0), Math::min);
    }


    //3.way:
    public static int findMin3(List<Integer> myList){

        return myList.stream().distinct().reduce(Math::min).get();
    }



    //Example 6: Create a method to find the multiplication of the elements less than 15 and even

    public static int findMultiplication(List<Integer> myList){

        return myList.stream().
                filter(Utils::checkIsEven).
                        filter(t-> t<15).
                reduce(Math::multiplyExact).get();
    }



    //Example 7: Create a method to check if all elements are less than 140 or not.

    public static boolean isLessThanSpecificNumber(List<Integer> myList, int num){

        return myList.stream().allMatch(t->t<num);   //allMatch()-->gives you true if this condition is true for all elements
    }




    //Example 8: Create a method to check if no element is negative or not.
    public static boolean isNoneNegative(List<Integer> myList) {

        return myList.stream().noneMatch(t-> t<0);  //noneMatch()-->gives you true, if this condition is not true for all elements
        //t<0 condition is false for all elements in the list. if noneMatch returns false for all elements, you will get true

    }


    //Example 9: Create a method to check if any element has 3 digits  (it means at least oe of them)
    public static boolean isAnyElHasThreeDigits(List<Integer> myList) {

        return myList.stream().anyMatch(t->t<1000 && t>99);
    }

}

