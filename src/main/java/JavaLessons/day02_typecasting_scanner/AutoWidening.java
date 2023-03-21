package JavaLessons.day02_typecasting_scanner;

public class AutoWidening {
    public static void main(String[] args) {



        byte num1 = 23;
        short num2 = 55;

        int num3 = num1 + num2 ;
        System.out.println("num3: " +num3);     // result is int 78

        double num4 = num1 * num2;  // result is double -->1265.0

        num4 = num2 / num1;
        System.out.println("num4 : " + num4);  //result was 2.391, num1 and num2 are int. result->2, num4 is double-->2.0


        double num5;
        num5 = (double)num2/num1;   //   55.0/23 = 2.391
        System.out.println("num5: " + num5);

        double num6 = (double)(num2/num1);  //2.0  -->result of num2/num1 is int = 2
        System.out.println("num6: " + num6);


        double num7 = num2/(double)num1;   //2.391304347826087
        System.out.println(num7);

    }

}
