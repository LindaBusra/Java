package JavaLessons.day13_arrays;

public class Array11 {
    public static void main(String[] args) {


//Question-1

    int arr[] ={1,3,5};
    int x = 0;

    for(int w:arr) {

        x = x+w*w;
    }

        System.out.println(x);   //35

//---------------------------------------------------------------------------------------------


//Question-2

        int arr2[] = {1,3,5,7,9};

        for(int w: arr2) {

            if (w<4) {
                continue;
            }
            System.out.print(w + " ");  // 5 7 9
        }


//---------------------------------------------------------------------------------------------



//Question-3

        int arr3[] = {1, 3, 5, 7, 9};

        for (int w : arr3) {
            System.out.print(w + " ");          //1 3 5

            if (w > 4) {
                break;
            }
        }


//------------------------------------------------------------------------------------------------------


//Question-4

        int[][] arr4= {{1,2}, {3}, {4,5,6}};

        for(int w[] : arr4) {

            for(int z : w) {
                System.out.print(z + " ");
            }
        }



//------------------------------------------------------------------------------------------------------

//Question-5


        int[][] arr5= {{1,2}, {3}, {4,5,6}};
        int k= 0;

        for(int w[] : arr5) {

            for(int z : w) {
                k = k + z;
            }
        }
        System.out.println(k);


    }}

