package Batch159.day23_constructors_accessmodifiers;

public class Try {

    static int a = 11;
    int d = 15;

    public Try(){


        System.out.println("From Try Constructor");
    }

    public static void main(String[] args) {

        Try obj = new Try();

        int b = 12;

        System.out.println(b);
        System.out.println(a);
        System.out.println(obj.d);

    }



    static{

        int c =28;
        a = 13;

        System.out.println("Static block" + a);
        System.out.println("c " + c);
    }

}