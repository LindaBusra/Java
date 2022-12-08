package JavaLessons.day06_stringmanipulations_methods;

public class Method01 {
    public static void main(String[] args) {

        // Create a method prints greetings by using the given name.
//user name : Ali--> Hi Ali
//greeting ("Ali");

        System.out.println(greetingUser("Ayse"));

        }

    public static String greetingUser(String name) {

    return String.format("Hi " + name + "!");

    }
}
