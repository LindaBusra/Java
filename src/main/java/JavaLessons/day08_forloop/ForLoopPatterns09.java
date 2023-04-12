package JavaLessons.day08_forloop;

public class ForLoopPatterns09 {
    public static void main(String[] args) {





    /*  Type this pattern

    0 1 2 3 4
    1 2 3 4 5
    2 3 4 5 6
    3 4 5 6 7
    4 5 6 7 8

    */



        int n=5;
        for(int i=0; i<n; i++) {

            for(int j=0; j<n; j++) {
                System.out.print(i+j +  " ");  //tek bosluk
            }
            System.out.println();
        }


        //or
        int b;   int row=5;
        System.out.println("this one");
        for(int i=1; i<=row; i++) {

            b=i;
            for(int j=1; j<=row; j++) {

                System.out.print(b-1 + " ");
                b++;
            }
            System.out.println();
        }


//--------------------------------------------------------------------------------------------


/*  Type this pattern

0 0 0 0 0
1 1 1 1 1
2 2 2 2 2
3 3 3 3 3
4 4 4 4 4

*/



        int nn=5;
        for(int i=0; i<nn; i++) {

            for(int j=0; j<nn; j++) {
                System.out.print(i +  " ");  //tek bosluk
            }
            System.out.println();
        }





}
}
