package Others.MyPractice.Lambda.w3Scholls;

interface StringFunction {
    String run(String str);
}



public class Q2 {

    public static void main(String[] args) {

        //Create a method which takes a lambda expression as a parameter:

        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }
    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}