package JavaLessons.day02_typecasting_scanner;

public class Pre_Post_Increment01 {
    public static void main(String[] args) {

//Question1-

        int x=10;
        System.out.println(x++);    //  output: 10   x= 11
        System.out.println(++x);    //  output=12  x=12
        System.out.println(x--);    //output = 12  x=11
        System.out.println(--x);     //output = 10  x=10



//------------------------------------------------------------------------------------


//Question2- Print final value of num1, num2, num3, num4


        int num1 = 10;
        int num2 = num1 + 1;       //num2=11

        num2 += 5;          //num2=16
        int num3 =  num2++;    //num3=16   num2=17
        int num4 = ++num1;      //num4=11, num1= 11

        System.out.println(num1);  //11
        System.out.println(num2); //17
        System.out.println(num3); //16
        System.out.println(num4);  //



//------------------------------------------------------------------------------------


//Question 3- Print final value of a, b in the console

        int a = 15;
        int b = ++a;    //b=16   a=16
        b = --a;   //b=15  a=15

        b = a++;   //b=15  a=16

        b = a--; //b=16  a=15

        System.out.println("a:" + a + ", b:" + b );



    }
}

