package JavaLessons.day08_forloop;

public class ForLoop05 {
    public static void main(String[] args) {



//Example 1- Print characters from A to Z - print ASCII value

        for(char ch='A'; ch<='Z'; ch++) {
            System.out.print(ch + " ");
        }

        System.out.println();


        for(int i='A'; i<='Z'; i++) {           //ASCII value
            System.out.print(i + " ");
        }

        System.out.println();


//-------------------------------------------------------------------------------------------



//Example 2-Check the given number is prime number.


        int num =43;
        int count = 0;


        for(int i=2; i<num; i++) {

            if(num%i==0) {
                count++;
            }
        }


        if(count>0) {
            System.out.println(num + " is not prime number");
        } else {
            System.out.println(num + " is a prime number");
        }


    }
}
