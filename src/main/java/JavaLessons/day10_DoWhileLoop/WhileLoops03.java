package JavaLessons.day10_dowhileloop;

public class WhileLoops03 {
    public static void main(String[] args) {



 // Example 1-   Create multiplication table


        int e =3;
        int m =1;

        while(m<11) {
            System.out.println(e + "X" + m + "="  + e*m);
            m++;
        }


//------------------------------------------------------------------------------------------



/* Example 2- Type code for this pattern

543
54
5

  */


        int row=3;

        for(int i=0; i<row; i++) {

            for(int j=0; j<row-i; j++) {

                System.out.print(5-j);
            }
            System.out.println();
        }


//or

        for(int i=1; i<=5; i++) {
            for(int j = (5-i); j>1; j--) {
                System.out.print(i+j);
            }
            System.out.println();
        }




    }
}
