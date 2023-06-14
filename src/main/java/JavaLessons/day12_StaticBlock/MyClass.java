package JavaLessons.day12_staticblock;

public class MyClass {

    static int num1;
    static String name = "Ole";



    public static void main(String[] args) {

        add();
        product(12);

    }

    public static void add() {                       //method
        num1++;
        int num2=6;
        char letter;                            //local variable
        System.out.println("Do addition to " + name );
        System.out.println(num1+num2);
    }

    public static void product(int num3){                   //method
        name = "Veli";
        int num2 = 7;                               //local variable
        System.out.println(name);
        System.out.println(num3*num1*num2);
    }

}
