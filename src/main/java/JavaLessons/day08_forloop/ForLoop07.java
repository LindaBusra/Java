package JavaLessons.day08_forloop;

public class ForLoop07 {

    public static void main(String[] args) {





//Example-1 Type all  even integers from 11 to 44 in the same line with a space between consecutive integers.

        for(int i=11; i<45; i++) {
            if(i%2==0) {
                System.out.print(i + " ");
            }
        }



//------------------------------------------------------------------------------------------------



//Example-2 Type odd integers from 68 to 13 in the same line with a space between consecutive integers.

        for(int i=68; i>12; i--) {
            if(i%2 != 0) {
                System.out.print(i + " ");
            }
        }



//------------------------------------------------------------------------------------------------


//Example 3-Type code to print unique in a String. Hello-->Heo


        String s = "Hello";

        for(int i=0; i<s.length(); i++) {

            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                System.out.print(s.charAt(i));
            }
        }



    }
}
