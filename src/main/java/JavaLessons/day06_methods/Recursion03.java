package JavaLessons.day06_methods;

public class Recursion03 {


    //Use recursion to find factorial of  10.



    public static void main(String[] args) {

        int result = fact(10);

        System.out.println("10! = " + result);

    }



    static int fact(int n)
    {
        if (n == 1)
            return 1;
        else
            return n*fact(n-1);
    }

}