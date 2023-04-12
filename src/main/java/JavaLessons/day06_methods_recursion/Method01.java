package JavaLessons.day06_methods_recursion;

public class Method01 {

    public static void main(String[] args) {

// Create a method prints greetings by using the given name.
//user name : Emily--> Hi Emily
//greeting ("Emily");

        System.out.println(greetingUser("Emily"));
        greetingUser("Jack");   //not on the console

        greetingByName("Heidi");


}


    public static String greetingUser(String name) {

    return ("Hi " + name + "!");

    }


    public static void greetingByName(String name) {
        System.out.println("Welcome " + name);
    }
}
