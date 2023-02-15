package JavaLessons.day10_DoWhileLoop;

public class WhileLoops05 {
    public static void main(String[] args) {


//Question 1) Print the numbers from 100 to 50 (inclusive) on the same line with commas between them


        int num =100;

        while(num>50) {

            System.out.print(num + ", ");
            num--;
        }

        System.out.println(50);



// Question 2 ) Print the numbers between 10 and 30 (including 10-30) on the same line with commas between them.

        int num1 = 10;

        while(num1<30) {

            System.out.print(num1 + ", ");
            num1++;
        }
        System.out.println(30);








    }
}
