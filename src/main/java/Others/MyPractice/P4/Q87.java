package Others.MyPractice.P4;

public class Q87 {
    public static void main(String[] args) {



// Example 1- Type code to reverse a string. Example: Tom Hanks==> sknaH moT

    String name ="Tom Hanks";

    for(int i=name.length()-1; i>=0; i--) {

        System.out.print(name.charAt(i));
    }

        System.out.println();



//-------------------------------------------------------------------------------------



// Example 2- Type code to check if a given integer is palindrome or not

        int firstNum = 12321;

        String n = String.valueOf(firstNum);

        String temp ="";


        for(int i=n.length()-1; i>=0; i--) {

            temp = temp + n.charAt(i);

        }


        if(temp.equals(n)) {

            System.out.println(Integer.valueOf(temp) + " is palindrome");
        } else {
            System.out.println("It is not palindrome");
        }





    }
}
