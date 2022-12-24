package JavaLessons.day15_multidimensionalarray;

public class MultiDimensionalArrays02 {
    public static void main(String[] args) {



//Print the elements which have "a" from a 2 dimensional String array.

        String arr[][]     = { {"learn", "java", "it"}, {"is", "easy"} };

        for(String m[] : arr) {

            for(String n : m) {

                if(n.contains("a")) {

                    System.out.print(n + " ");
                }
            }
        }

        System.out.println();



//---------------------------------------------------------------------



//Create an integer multidimensional array,  then find the sum of the elements

        int brr[][] = { {12, 54}, {3, 2, 7}, {21} };


        int sum = 0;
        for(int[] w : brr) {

            for(int n : w) {
                sum = sum+n;
            }
        }

        System.out.println("sum of the elements: " + sum);            //99




//-----------------------------------------------------------------------------------------





























    }
}
