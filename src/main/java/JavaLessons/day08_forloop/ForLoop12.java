package JavaLessons.day08_forloop;

public class ForLoop12 {
    public static void main(String[] args) {




//Example -  Type code to find sum of the digits of an integer

        int num = 584;

        int sumOfDigit = 0;

        for(int i=num; i>=0; i--) {

            sumOfDigit += num%10;
            num =num/10;
        }

        System.out.println("Sum of the digits: " + sumOfDigit);



//or

                int sumOfDigits = 0;

                for(int i=584; i>0; i=i/10) {
                    sumOfDigits = sumOfDigits + i%10;

                }
                System.out.println(sumOfDigits);



//if it was negative number :

        int num1 = -554;
        num1 = Math.abs(num1);
        int sumOfDigits1 = 0;


        for(int i=num1; i>0; i=i/10) {
            sumOfDigits1 = sumOfDigits1 + i%10;

        }
        System.out.println(sumOfDigits1);



//-------------------------------------------------------------------------------------------------------













    }
}
