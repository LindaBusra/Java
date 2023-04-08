package JavaLessons.day08_forloop;

public class ForLoopPatterns04 {

    public static void main(String[] args) {



/* Example 1 - Type code for this pattern

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

 */


        int row = 5;

        for(int i=0; i<row; i++) {

            for (int j = 1; j <= i + 1; j++) {

                System.out.print(j + " ");
            }
            System.out.println();
        }





/* Example  -Type code by using for loop for this pattern


        1
        2 1
        3 2 1
        4 3 2 1
        5 4 3 2 1          */


        int row1 =5;

        for(int i=1; i<=row1; i++) {
            for (int j = i; j >=1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();

        }


        //or
        for(int i=0; i<row; i++) {

            for(int j=i+1; j>0; j--) {

                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
