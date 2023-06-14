package Others.javaQuestionBank_TechPro;

import java.util.ArrayList;

public class Side80_Lists {
    public static void main(String[] args) {

//1) Find the sum of all list elements in an integer list

//        ArrayList<Integer> number =new ArrayList<>();
//        number.add(1);
//        number.add(-5);
//        number.add(3);
//        number.add(2);
//        number.add(4);
//
//        int sum = 0;
//
//        for(Integer w: number) {
//
//           sum += w;
//        }
//
//        System.out.println("The sum of all list elements: " + sum);



//-------------------------------------------------------------------------------------------------------



//2) Find the sum of all list elements before the first occurrence of 13 in an integer list


//        ArrayList<Integer> number =new ArrayList<>();
//        number.add(1);
//        number.add(-5);
//        number.add(3);
//        number.add(13);
//        number.add(4);
//
//        int givenNumber =13;
//        int sum = 0;
//
//
//        //1.way
//        int index = number.indexOf(givenNumber);
//
//        for(int i=0; i<index; i++) {
//
//            sum += number.get(i);
//
//        }
//            System.out.println("the sum of all list elements before the first occurrence of " + givenNumber + " : " + sum);
//
//
//        //2.way
//
//        int summ = 0;
//        for(Integer w : number) {
//
//            if(w==givenNumber) {
//                break;
//            }
//            summ += w;
//        }
//        System.out.println("the sum of all list elements before the first occurrence of " + givenNumber + " : " + summ);



//-------------------------------------------------------------------------------------------------------



//3) Find the multiplication of all even list elements in an integer list

        ArrayList<Integer> number =new ArrayList<>();
        number.add(1);
        number.add(7);
        number.add(3);
        number.add(8);
        number.add(4);


        int mult = 1;

        for( Integer w: number) {

            if(w%2==0) {
                mult = mult * w;
            }
        }

        System.out.println("The multiplication of all even list elements: " + mult);


//-----------------------------------------------------------------------------------------------------

/*4) Check if elements are in descending order in a list
        Example: (Yellow, Blue, Red, Green) ==> Output: It is not in descending order
        (Yellow, Red, Green, Blue) ==> Output: It is in descending order   */

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Yellow");
        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");

        ArrayList<String> colors2 = new ArrayList<>();

        

// yarim kaldi




    }
}
