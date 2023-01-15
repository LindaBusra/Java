package JavaLessons.day02_typecasting_scanner;

public class Pre_Post_Increment06 {

    public static void main(String[] args) {


//Question 1-What will be the output of the following program?
        int i = 11;

        i = i++ + ++i;       //11 + 13

        System.out.println(i);   //24



//Question 2-What is the output of the following program?

        int a=11, b=22, c;

        c = a + b + a++ + b++ + ++a + ++b;
        //11 + 22 + 11 +  22 + 13 + 24

        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);



//Question 3-What is the output of the following program?

        int k=0;

        k = k++ - --k + ++k - k--;


        System.out.println("k : " + k);




    }
}
