package JavaLessons.day10_DoWhileLoop;

public class DoWhile07 {

    public static void main(String[] args) {



        //Print 10 times Java on the console by using while loop

        int i=0;
        while(i<10) {                       //i>0-->infinitive

            System.out.println("java");

        i++;

        }
        System.out.println("i=" + i);           //10


//----------------------------------------------------------------------------------------

        //Find factorial of 5 with while loop

        int num = 5;
        int fact =1;

        while(num>0) {

            fact =  fact*num;
            num--;
        }
        System.out.println("Factorial: " + fact);


        //or
        int num1 = 5;
        int fact1 =1;
        while(fact1<5) {

            num1 *= fact1;
            fact1++;
        }
        System.out.println("Factorial: " + num1);



//-----------------------------------------------------------------------------------------------------


        int n = 10;

        do {

            System.out.print(n + " ");
            n--;

        }while(n>0);









    }
}