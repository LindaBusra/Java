package JavaLessons.day06_methods_recursion;

public class Methods12 {

    public static void main(String[] args) {

        int[][] x = { {1,2}, {3,4,5} };

        System.out.println(m(x));
    }


    public static  int m(int [][] x){

        int sum =0;


        for(int i=0; i<x.length; i++) {

            for(int j=0; j<x[i].length; j++) {

                sum += x[i][j];
            }
        }

        return sum;
    }


}




