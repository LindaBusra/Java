package JavaLessons.day02_typecasting_scanner;

public class Pre_Post_Increment07 {

    public static void main(String[] args) {



        //Question 1
        int x = 0;
        while(x++ <10) {


        }

        String message = x > 10 ? "Greater than" : "Less than" ;
        System.out.println(message + ", " + x);










        //Question 2

        int m = 9, n = 15;

        while(m-- > 5) {
            n--;
            --m;
        }

        System.out.println(m +  n);



    }



}
