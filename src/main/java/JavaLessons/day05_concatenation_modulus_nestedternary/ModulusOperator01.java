package JavaLessons.day05_concatenation_modulus_nestedternary;

public class ModulusOperator01 {
    public static void main(String[] args) {



//      Modulus operator: % is called modulus operator in java.
//      it returns the remainder in a division operation

//A % B --> Where A is the dividend and B is divisor


        int a = 19;     //dividend

        int b = 8;      //divisor

        int k = a % b;  // Mod
        System.out.println(k);


        double c = 7.5, d = 2.2, remainder;
        remainder = c % d;
        System.out.println("Remainder: " + remainder);


        int e = 19;
        int f = 2;
        int q = e / f;
        int r = e % f;

        System.out.println("Quotient: " + q);
        System.out.println("Remainder: " + r);



        int num1,num2,result;
        num1=26;
        num2=15;
        System.out.println("num1=26; num2=15");
        result=num1%num2;
        System.out.println("The result after modulus operation is : "+result);


        int userInput = 32232;
        System.out.println("Is the number even?: " + isEvenNumber(userInput));

        isEvenNumber(userInput);

    }



    public static boolean isEvenNumber(int userInput){
        if(userInput%2 == 0){
            System.out.println("Input is an even number");
            return true;
        }else {
            System.out.println("Input is an odd number");
            return false;
        }
    }

}