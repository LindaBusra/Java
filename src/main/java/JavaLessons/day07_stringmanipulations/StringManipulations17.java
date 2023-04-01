package JavaLessons.day07_stringmanipulations;

public class StringManipulations17 {
    public static void main(String[] args) {




//Example- Swap the integers, 1.way


        int a=12, b=23;

        System.out.println("Before swapping a = " + a +" and b = " + b);
        a = a+b;
        b = a-b;
        a = a-b;


        System.out.println("After swapping a = " + a +" and b = " + b);



//2.way :We used third variable

        int a1=12, b1=23;

        System.out.println("Before swapping a = " + a1 +" and b = " + b1);

        int temp = 0;
        temp = b1;
        b1 = a1;
        a1 = temp;
        System.out.println("After swapping a = " + a1 +" and b = " + b1);




    }
}
