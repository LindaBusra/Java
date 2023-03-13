package JavaLessons.day26_exceptions;

public class E19 {

    public static void main(String[] args) {


        Integer num = 10;

        try {
           String str = "ab12";
           num  += Integer.parseInt(str);

        } catch (NumberFormatException e) {

            System.out.println("It is not possible to convert this string to integer");
        }
        System.out.println(num);
    }
}

//It gives run time exception