package Batch159.practice.practice03;

public class Static {

    static int counter = 0;
    int age = 0;

    public Static(){
        counter++;
        age++;
    }


    public static void main(String[] args) {

        Static obj1 = new Static();
        Static obj2 = new Static();
        Static obj3 = new Static();

        System.out.println(obj1.counter);
        System.out.println(obj2.counter);
        System.out.println(obj3.counter);

        System.out.println();

        System.out.println(obj1.age);
        System.out.println(obj2.age);
        System.out.println(obj3.age);
    }
}
