package JavaLessons.day15_multidimensionalarray;

public class MultidimensionalArrays04 {

    public static void main(String[] args) {



//Example - Find the maximum in a 2 dimensional array.

        int number[][] = { {5,0}, {-2,4}, {65,-12,230}};

        int max = number[0][0];

        for(int[] w : number) {

            for(int n : w) {
                max=Math.max(max, n);

            }
        }

        System.out.println("The max number is " + max );



// max=Math.max(max, n) -->max() method selects the maximum value of the given two numbers

//or we can solve with help of -->int x = Integer.MIN_VALUE;


    }
}
