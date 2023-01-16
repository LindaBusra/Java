package JavaLessons.day18_datetime_class_vararrgs;

public class Varargs01 {
    public static void main(String[] args) {

/*
1) If you want to make number of parameters flexible in a method use "varargs"
2) To create a varargs "Data Type + ... + space + a name for the varargs"
3) "Varargs" use Arrays behind. When you work with varargs you may think you are working with Arrays.
4) "Varargs" can accept zero or more elements
5) Can I use another regular parameter after "varargs" ? No, because"varargs" can not be made full,
second parameter will be unreachable. It will give error.
"varargs" must be last parameter everytime.
6) Can I use another regular parameter before varargs? Yes, you can use many regular parameters before "vararags"
7) Can I use multiple "varargs" parameter in a method?



 */
        System.out.println(add(3,5));       //8

        System.out.println(add(3,5,2));     //10

        System.out.println(add());          //0

        System.out.println(add(3));         //3


    }
    //Create a method adds n integers

    public static int add(int ... a) {       //int... you dont need write 1, 2 , 3 int a, int b, int c

        int sum = 0;
        for(int w:a) {
            sum = sum +w;
        }
        return sum;



    }

  //  public static int add(int b, int... a)        //b=2,     3,4,5... in varargs




}
