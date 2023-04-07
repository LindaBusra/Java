package JavaLessons.day08_forloop;

public class ForLoop16 {

    public static void main(String[] args) {


//Example 3- Type code to check if a given String is Palindrome.
//String anna-->Reserved anna
//Integer 12321--Reserved 12321

        String before ="AnnA";
        String reverse = "";

        for(int i=before.length()-1; i>=0; i--) {

            reverse = reverse + before.charAt(i);
        }

        System.out.println(reverse);

        if(reverse.equals(before)) {
            System.out.println("it is palindrome");
        } else {
            System.out.println("It is not palindrome");
        }


    }
}
