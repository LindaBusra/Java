package JavaLessons.day14_arrays_foreachloop;

import java.util.Arrays;

public class Array39 {
    public static void main(String[] args) {



//Example 1-   [0, 2, 3, 0, 12, 0] put the zeros to the end

        int a[] = {0,2,3,0,12,0};

Arrays.sort(a);     //0,0,0,2,3,12

int b[] =new int[a.length];
int i=0;

for(int j=a.length-1; j>=0; j--) {

    b[i] = a[j];
    i++;

}
        System.out.println(Arrays.toString(a));     // [0, 0, 0, 2, 3, 12]
        System.out.println(Arrays.toString(b));     // [12, 3, 2, 0, 0, 0]



//----------------------------------------------------------------------------------------------------------------



//Example 2-Type code to check is a spesific element or not.


        int crr[] = {-12, 25, 5};   //check if 23 exists in the array or not

        int count=0;
        int find = 25;

        for(int w:crr) {

            if(w==find) {
                count++;
            }
        }

        if(count>0) {
            System.out.println(find + " exists " + count + " times in the array");
        } else {
            System.out.println( find + " does not exist in the array");
        }



//------------------------------------------------------------------------------------------------------------


 //     Consider the array, What is the value of s[ s[ 6 ] - s[ 5 ] ]


        int [] s = {7, 0, -12, 9, 10, 3, 6};
        System.out.println(s[ s[ 6 ] - s[ 5 ] ]);       //9




    }
}
