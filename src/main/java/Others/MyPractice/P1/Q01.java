package Others.MyPractice.P1;

public class Q01 {


    public static void main(String[] args) {



//1-Write a program to calculate the sum of first 10 natural number.

        int sum=0;

        for(int i=1; i<11; i++) {
            sum =sum+i;
        }

        System.out.println("the sum of first 10 natural number:" + sum);



//--------------------------------------------------------------------------------------------------------------------



//2-Create a multiplication Table

        for(int i=1; i<11; i++) {

            for (int j = 1; j < 11; j++) {

                System.out.println(i + " X " + j + " = " + i * j);
            }
            System.out.println();

        }



//--------------------------------------------------------------------------------------------------------------------



//3-Type code to find sum of the numbers from 3 to 12, except 5

        int sumt = 0;
        int num = 3;


        do {

            if(num!= 5) {

                sumt += num;
            }
            num++;
        }while(num<13);

        System.out.println("sum of the numbers: " + sumt);



//--------------------------------------------------------------------------------------------------------------------





    }
}
