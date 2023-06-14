package Others.Topics.Random;
import java.util.Random;

public class Random_Class {


//bu sekilde siniflar olusturabilirim

    /*
1. Using Random.nextInt() method
If you need to generate a random character between some specific range, you can do so
using the nextInt() method from the Random class. The following code generates a random
character in the range A-Z. You can easily modify the code to generate a character in
the range a-z.
     */

        private static char randomCharForUpperCase() {
            Random r = new Random();
            return (char)(r.nextInt(26) + 'A');
        }



//If you need to generate values in the ranges a-z and A-Z, you can do something like:

        private static char randomChar() {
            int rand = new Random().nextInt(52);
            char start = (rand < 26) ? 'A' : 'a';
            return (char) (start + rand % 26);
        }




        //driver
        public static void main(String[] args) {
            char c = randomChar();
            System.out.println(c);



         /*   If you want to generate an alphanumeric random character or use any other
          specific character set, you can do as follows.  without making a class
          */

                    String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

                    Random r = new Random();
                    char ch = alphabet.charAt(r.nextInt(alphabet.length()));
                    System.out.println(ch);
                }

        }








