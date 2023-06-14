package Others.OCA.abiten.Q160;

public class Q160 {

    public static void main(String[] args) {


        int	x;

/* insert code here */

        //A  output: ****
        x=3;
		do {
			System.out.print("*");
			x--;
		}while (x>=0);



        //B  output: *
//        x=0;
//        do {
//            System.out.print("*");
//            x++;
//        }while (x>=3);


        //C  output: *
//        x=0;
//        do {
//            System.out.print("*");
//            ++x;
//        }while (x>=3);



        //D  output: **
//        x=3;
//        do {
//            System.out.print("*");
//            x--;
//        }while (x != 1);


        System.out.println();

        //E  output: ****
        x=0;
        do {
            System.out.print("*");

        }while (x++<3);

    }

/*
Which two code fragments inserted at line 10 print ****?

A. Option A  +
B. Option B
C. Option C
D. Option D
E. Option E  +



 */

}

