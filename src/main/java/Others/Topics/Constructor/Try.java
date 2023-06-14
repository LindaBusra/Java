package Others.Topics.Constructor;

public class Try {

    static int a= 10;           //it has static keyword. It atteches to Class.

    //There is no any instance variable, so I don't  attach any variable to the object

    public static void main(String[] args) {

        Try t1 = new Try();
        Try t2 = new Try();

        t1.a = a+2; //t1.a -->go to the t1 object, and go to the a,  and increase a, 2
        t2.a = a+3;

        System.out.println(t1.a);       //15
        System.out.println(t2.a);       //15






    }
}
