package JavaLessons.day10_DoWhileLoop;

public class DoWhile02 {
    public static void main(String[] args) {



//while-loop--> zero execution is possible

        int i=1;

        while(i<1) {
            System.out.println("while loop");
            i++;
        }

//do-while

do{
    System.out.println("do-while loop");
    i++;
}while(i<1);



//--------------------------------------------------------------------


//infinite loops !!!!!!!!!!!!
//if you do mistake in increment part the loop will be infinite loop.
//Don't create infinite loop.

//        for(int p=1; p<10; p--) {
//            System.out.println(p + " ");
//        }
//
//        for(int p=1; p<10; ) {
//            System.out.println(p + " ");
//        }




//Note:By putting "true" inside the while parenthesis, we can create infinite loop and
//we can break the loop by the codes inside the loop body.

        int m=0;

        while(true) {
            System.out.println("Hi");
            m++;
            if(m==5) {
                break;
            }
        }

//-----------------------------------------------------------------------------


//Example-2-Printing numbers from 1 to 10 and their sums to the screen


        int n = 10;
        int toplam = 0;

        do{
            System.out.println("n= " +n);
            toplam = toplam + n;
            n--;
        }

        while(n>0);
        System.out.println("toplam " +toplam);

 //-----------------------------------------------------------------------



//Example-3- Example for break
int r=0;
        while(true) {                         //while condition is true
            System.out.println("Hi");
            r++;

            if (r == 5) {

                break;
            }
        }



    }
}
