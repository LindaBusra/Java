package JavaLessons.day10_DoWhileLoop;

public class DoWhile07 {

    public static void main(String[] args) {



        //while loop

        int i=0;
        while(i<10) {                       //i>0-->infinitive

            System.out.println("java");

        i++;

        }
        System.out.println("i=" + i);           //10


//----------------------------------------------------------------------------------------

        //Find factorial with while loop

        int num = 5;
        int fact =1;

        while(num>0) {

            fact =  fact*num;
            num--;
        }
        System.out.println("Factoriyel: " + fact);



//-----------------------------------------------------------------------------------------------------


        int n = 10;

        do {

            System.out.print(n + " ");
            n--;

        }while(n>0);









    }
}