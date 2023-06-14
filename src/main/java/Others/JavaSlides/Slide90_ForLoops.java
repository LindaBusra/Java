package Others.JavaSlides;

public class Slide90_ForLoops {
    public static void main(String[] args) {

// 1) Write a program to print counting numbers from 10 to 57 on the console by using for-loop

        for(int i = 10; i<=57; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\n");

// 2) Write a program to print even counting numbers from 100 to 43 on the console by using for-loop.

        for(int i = 100; i>=43; i--) {
            if(i % 2 == 0) {
                System.out.print( i + " ");
            }
        }
        System.out.print("\n");

// 3) Write a program to print odd counting numbers from 200 to 33 on the console by using for-loop

        for(int i = 200; i>=33; i--) {
            if(i % 2 != 0) {
                System.out.print( i + " ");
            }
        }
        System.out.print("\n");

// 4)Write a program to add counting numbers from 23 to 57 by using for-loop.
//Print the sum on the console

        int sum = 0;
        for(int i=23; i<=57; i++) {
            sum = sum + i;
        }
        System.out.println("total: " + sum);
        System.out.print("\n");

// 5)Write a program to multiply counting numbers from 7 to 15 by using for-loop.
//Print the multiplication on the console

        int mltply = 1;
        for(int i=7; i<=15; i++) {
            mltply = mltply * i;
        }
        System.out.println("multiplication is: " + mltply);
        System.out.print("\n");


// 6)Write a program to print counting numbers which are less than 200 and divisible by 5
//On the console by using for-loop.
//note:Any number you can use for counting things: 1, 2, 3, 4, 5, ...

for(int i=1; i<200; i++) {
    if(i % 5 == 0) {
        System.out.print(i + " ");
    }
}




    }
}
