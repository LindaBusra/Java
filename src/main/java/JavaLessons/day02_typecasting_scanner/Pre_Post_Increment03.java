package JavaLessons.day02_typecasting_scanner;

public class Pre_Post_Increment03 {

    public static void main(String[] args) {



//Question 1- Print final value of a, b, c, d on the console

        int a = 5;
        int b = 2;
        int c;
        int d;

        c = ++b;    //c=3, b=3
        d = a++;    //d=5, a=6
        c++;        //c=4;

        System.out.println("a: "+a+"\nb: " + b + "\nc: " + c + "\nd: " + d);



//-------------------------------------------------------------------------------------------------


////Question 2- What is the output?

        int num1=9;
        int num2=num1++;

        if(num2<10)    {
            System.out.println(num2 + " Hello World");
        } else {
            System.out.println(num1 + "Hello Universel");
        }


//-------------------------------------------------------------------------------------------------


//Question 3- What is the result of e+f+g+h ?


        int e = 10;
        int f = e + 1;

        f += 5;
        int g =  f++;
        int h = ++e;

        System.out.println(e + f + g + h);


    }

}
