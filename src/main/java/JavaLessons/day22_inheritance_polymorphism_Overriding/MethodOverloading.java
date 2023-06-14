package JavaLessons.day22_inheritance_polymorphism_overriding;

public class MethodOverloading {


    public static void main(String[] args) {

        scorCount("Sigrund");
        scorCount(75);
        scorCount("Sigrund, 75");


    }


    public static void scorCount(String name, int score) {
        System.out.println(name  + " has score: " + score);
    }

    public static void scorCount(int score) {
        System.out.println("The score is " + score);
    }

    public static void scorCount(String name) {
        System.out.println( name  + " has a good score");
    }



}
