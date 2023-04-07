package JavaLessons.day08_forloop;

public class ForLoop03 {
    public static void main(String[] args) {



//Example 1- Type all integers which are divisible by 4 and not divisible by 6 from 120 to 11
//in the same line with a space between consecutive integers.

        for(int i=120; i>10; i--) {
            if(i%4==0 && i%6!=0) {
                System.out.print(i + " ");
            }
        }



//------------------------------------------------------------------------------------------------



//Example 2-  What is the output of this code?

        int result = 0;

        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                result += 10;
            } else {
                result += i;
            }
        }
        System.out.println("result: " + result);   //17



//------------------------------------------------------------------------------------------------


//Example 3-Java Example that prints the number of a specified character in a text.


        String str = "There are same Java examples here.";


        char ch = 'e';
        int num = 0;


        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)=='e') {
                num++;
            }
        }
        System.out.println("The number of specified character:" + num);


    }
}
