package JavaLessons.day08_forloop;

public class ForLoop17 {

    public static void main(String[] args) {



//Example 1- Type code to check if a given Integer is Palindrome.
//Integer 12321--Reserved 12321

        int num = 12321;
        String fromNum = String.valueOf(num);

        String spare = "";

        for(int i=fromNum.length()-1; i>=0; i--) {

            spare =spare + fromNum.charAt(i);
        }

        if(fromNum.equals(spare)){
            System.out.println("it is palindrome");
        } else {
            System.out.println("It is not palindrome");
        }





//Example-2-Type code to find the sum of the  digits of an Integer

        int number = 753;
        int sumOfDigits = 0;

        for(int i =number; i>0; i= i/10) {

            sumOfDigits = sumOfDigits + i%10;
        }

        System.out.println("Sum of digits " + sumOfDigits);



    }
}
