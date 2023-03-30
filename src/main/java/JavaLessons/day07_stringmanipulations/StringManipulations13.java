package JavaLessons.day07_stringmanipulations;

public class StringManipulations13 {


    public static void main(String[] args) {



//Example 1 : Type code to find the order number of last accurrence of "Java" in a sentence.

        String r = "I like to study Java, learn Java, earn money, Java is easy.";

        int ab = r.lastIndexOf("Java");
        String newa = r.replaceFirst("like", "my");

        System.out.println(ab);
        System.out.println(newa);



//-------------------------------------------------------------------------------------------



//Example 2 : Type code to check if a character is unique in a String or not.
//"Hello"--> H is unique, l is not unique


        String m = "Hello";


        if(m.indexOf('H')==-1) {
            System.out.println("The character does not exist");
        } else if (m.indexOf('H')==m.lastIndexOf('H')) {
            System.out.println("The character is unique");
        } else {
            System.out.println("The character is not unique");
        }

//2- way
        String rst = m.indexOf('H')==-1 ? "The character does not exist" : (m.indexOf('H')==m.lastIndexOf('H') ?   "The character is unique" :   "The character is not unique") ;
        System.out.println(rst);


    }
}
