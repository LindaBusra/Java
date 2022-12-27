package JavaLessons.day17_passbyvalue;

public class PassByValue {

      public static void main(String[] args) {



        int shirt = 100;

        int veteranShirt = veteransDiscount(shirt);
        System.out.println(veteranShirt);   //80

        int seniorShirt = seniorsDiscount(shirt);
        System.out.println(seniorShirt);    //90

        int studentShirt = studentDiscount(shirt);
        System.out.println(studentShirt);   //95

        System.out.println(shirt);          //100

    }

    //main method is static, everything you used in main method must be static
    public static int veteransDiscount(int shirt){
        return shirt-20;
    }

    public static int seniorsDiscount(int shirt){
        return shirt-10;
    }

    public static int studentDiscount(int shirt){
        return shirt-5;
    }
}