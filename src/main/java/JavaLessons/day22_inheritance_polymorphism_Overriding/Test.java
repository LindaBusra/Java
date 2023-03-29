package JavaLessons.day22_inheritance_polymorphism_Overriding;


public class Test {


    int a = 1, b = 2;

    public Test(int a, int b){
        a = a;
        b = b;
    }



    public void print(){
        System.out.print(a+" "+b);
    }


    public static void main(String[] args){
        Test t = new Test(10,20);
        t.print();
    }
}