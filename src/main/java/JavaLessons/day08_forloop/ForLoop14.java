package JavaLessons.day08_forloop;

public class ForLoop14 {

    public static void main(String[] args) {



// Example 3- Type code to print characters before "m" in a String

        String city2 = "Luxembourg";

        char given = 'm';

        for (int i = 0; i < city2.length(); i++) {

            char ch = city2.charAt(i);

            if (ch == given) {
                break;
            }

            System.out.print(ch);
        }



    }
}
