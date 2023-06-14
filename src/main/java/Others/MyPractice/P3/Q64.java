package Others.MyPractice.P3;

public class Q64 {

    public static void main(String[] args) {



     /*      int arr [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
  Find how many elements are there in the given array.  */



        int arr [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};

        NumberOfArray(arr);

    }




    public static void NumberOfArray(int list[][]) {

        int length = list.length;
        int elements = 0;

        for(int i=0; i<list.length; i++){

            elements += list[i].length;
        }

        System.out.println("There are :" + elements + " elements in this array");

    }
}
