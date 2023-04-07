package JavaLessons.day07_stringmanipulations;

public class StringManipulations19 {


    public static void main(String[] args) {




// Type code if a String has an uppercase initial and dot and the end



        String name = "Ali.";

        char first = name.charAt(0);
        char last = name.charAt(name.length() - 1);
        boolean isTrue =  (first >= 'A' & first <= 'Z') && (last == '.');

        if (isTrue)  {

            System.out.println(true);

        } else {
            System.out.println(false);
        }



//----------------------------------------------------------------------------------------------------------------------



//Type code to reserve s string --> "Tom Hanks" -->sknaH moT

        String text = "radar";
        String temp = "";

        for(int i=text.length()-1; i>=0; i--) {

            temp += text.charAt(i);
            System.out.println(text.charAt(i));
        }


        //Find the given text is palindrome or not.
        System.out.println(temp.equals(text) ?  "It is palindrome" :  "It is not palindrome");
        System.out.println();



    }
}
