package Batch159.practice.practice03;

public class Try2 {

    //Question 2 of 10

    int a = 10;

    public static void main(String[] args) {


        Try2 t1 = new Try2();
        Try2 t2 = new Try2();

        t1.a = 12;
        t2.a = 13;

        System.out.println(t1.a);   //12
        System.out.println(t2.a);   //13




        //Question 3 of 10

        /*
        -Static variables or methods can be accessed by using just class name
        -We have to create object to access non-static variables or non-static methods
        -Other name of static variables is class variable and other name of instance variables is object variable
        -Static variables are shared by all objects but instance variables are not
         */
    }
}