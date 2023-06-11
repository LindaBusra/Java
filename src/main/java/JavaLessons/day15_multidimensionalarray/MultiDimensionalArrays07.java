package JavaLessons.day15_multidimensionalarray;

public class MultiDimensionalArrays07 {
    public static void main(String[] args) {



//Java Program to demonstrate the addition of two matrices in Java


                int d[][]={{1,3,4},{3,4,5}};
                int b[][]={{1,3,4},{3,4,5}};

//creating another matrix to store the sum of two matrices
                int c[][]=new int[2][3];

//adding and printing addition of 2 matrices
                for(int i=0;i<2;i++){

                    for(int j=0;j<3;j++){

                        c[i][j]=d[i][j]+b[i][j];

                        System.out.print(c[i][j]+" ");
                    }
                    System.out.println();//new line
                }



//------------------------------------------------------------------------------



//      Program to print the duplicate elements of an array


        //Initialize array
        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};
        System.out.println("Duplicate elements in given array: ");
        //Searches for duplicate element
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }



    }
}
