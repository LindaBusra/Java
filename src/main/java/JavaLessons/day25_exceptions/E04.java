package JavaLessons.day25_exceptions;


public class E04 {

    public static void main(String[] args) {

        int r1 = convertStringToInt("123");
        System.out.println(r1 + 1);//124    //for check r1 is an integer or not.

        int r2 = convertStringToInt("abc");
        System.out.println(r2 + 1);  //NumberFormatException : When you use valueOf method and if you put a non-digit character into the String
        // you will get "NumberFormatException".


    }

    //Create a method to convert a String to an integer

    public static int convertStringToInt(String str) {          //it is unboxing---int-->Integer

        int i = 0;
        try {
            i = Integer.valueOf(str);
        } catch (NumberFormatException e) {
            System.out.println("A problem occurred while I convert the String to integer - " + e.getMessage());
            //"For input string: "abc""  ==>It is not understandable ==> It is not a good  message. Therefore, I added my message into the message as well.
        }
        return i;
    }


}