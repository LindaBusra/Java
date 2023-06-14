package Others.MyPractice.P4;

import java.util.Arrays;

public class Q95 {
    public static void main(String[] args) {



        //Find the smallest element and greatest negative element in an integer array
//Example:  {-12, 18, -5, 23, -2}  -->Smallest positive is 18, greatest negative is -2

        int[] a = {-12, 18, -5, 23, -2};


        Arrays.sort(a);     // -12 -5 -2 18 23

        int greatestN = a[0];
        int smallestP = a[a.length-1];          //23

        for(int w: a) {

            if(w>0) {

                smallestP = Math.min(smallestP,w);


            } else if(w<0) {

                greatestN = Math.max(greatestN, w);


            }
        }

        System.out.println("Greatest negative is: " + greatestN + ", Smallest positive is: " + smallestP);



    }
}
