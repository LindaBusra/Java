package Batch159.day15_multidimensionalarrays;

public class MultiDimensionalArray03 {

    public static void main(String[] args) {

        //Example 1: Type code to find the sum of the maximum and minimum values in a multidimensional array
        //           { {5, 0}, {-2, 14}, {65, -12, 23} } ==> -12 + 65 = 53

        //1.Way:

        int [][] arr = { {5, 0}, {-2, 14}, {65, -12, 23} };

        int min = arr[0][0];
        int max = arr[0][0];

        for(int[] w: arr) {

            for(int u: w) {

                if(u<min) {
                    min =u;
                }

                if(u>max) {
                    max =u;
                }
            }
        }

        System.out.println("min: " + min + "  max: " + max);
        System.out.println("the sum of the maximum and minimum values : " + (min+max));
        System.out.println();



        //2.Way: Recommended

        int minNumber = arr[0][0];
        int maxNumber = arr[0][0];

        for(int[] w: arr) {

            for(int u: w) {

                maxNumber = Math.max(maxNumber, u);
                minNumber = Math.min(minNumber, u);
            }
        }

        System.out.println("min: " + minNumber + "  max: " + maxNumber);
        System.out.println("the sum of the maximum and minimum values : " + (minNumber+maxNumber));
    }
}
