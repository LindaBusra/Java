package JavaLessons.day27_exceptions;

public class E03 {

    public static void main(String[] args) {


//Create a method to print age

        try {
            printAge(-5);
        } catch (IllegalAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static  void printAge(int age)  {

        if(age<0) {

            throw new IllegalAgeException("Age can not be negative");
        }




    }
}
