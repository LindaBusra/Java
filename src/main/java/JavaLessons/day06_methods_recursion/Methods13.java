package JavaLessons.day06_methods_recursion;

public class Methods13 {

    public static void main(String[] args) {

        //What is the biggest element in the array?

        int[][] x = {{2, 1}, {5, 7, 6}};

        System.out.println(m(x));
    }


    public static int m(int[][] x) {

        int result = 0;

        for(int i=0; i<x.length; i++) {

            for(int j=0; j<x[i].length; j++) {

                result = Math.max(result, x[i][j]);
            }
        }
        return result;
    }

}
