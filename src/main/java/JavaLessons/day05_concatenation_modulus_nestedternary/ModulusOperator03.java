package JavaLessons.day05_concatenation_modulus_nestedternary;

public class ModulusOperator03 {

    public static void main(String[] args) {



        int seconds = 123456;

        printTime(seconds);

        System.out.println(isOdd(75));

    }

    public static void printTime(int seconds){

        int remainingSeconds = seconds % 60;

        int minutes = seconds / 60;

        int remainingMinutes = minutes % 60;

        int hours = minutes / 60;

        System.out.println("The required time is "  + hours + " hours " + remainingMinutes + " minutes and " + remainingSeconds + " seconds");
    }



    private static boolean isOdd(int number) {
        return number % 2 != 0;
    }
}
