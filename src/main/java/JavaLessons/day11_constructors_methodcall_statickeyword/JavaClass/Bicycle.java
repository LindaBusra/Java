package JavaLessons.day11_constructors_methodcall_statickeyword.JavaClass;



public class Bicycle {


    private int gear=4;     //state or field


    public void braking(){

        System.out.println("Working of braking");
    }


    public static void main(String[] args) {

        Bicycle b1 = new Bicycle();

        System.out.println(b1.gear);
        b1.braking();
    }
}
