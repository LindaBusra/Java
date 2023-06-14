package Others.Topics.Constructor;

public class Test {

    int y = 5;              //I wil attech instance variable to the object
    static int x = 7;       //static, attach it to the class


    public static void main(String[] args) {

        Test t1 = new Test();
        Test t2 = new Test();

        t1.x = 17;
        t1.y = 15;

        System.out.print(t1.x + " ");   //17
        System.out.println(t2.x);       //17

        System.out.print(t1.y + " ");   //15
        System.out.println(t2.y);       //5
    }


}
