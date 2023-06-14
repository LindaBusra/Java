package Others.Topics.OverloadingExample;

public class Q01_SumOfFirstNumberWithAllNumsMultiplies {

    public static void main(String[] args) {

  /*

  -method overloading is adding parameters to the same method name.
  -int question-->How do you cahnge the parameter of a method:
  -I can add different parameters and change the number of parameters
  Create a method that adds given Integers except the first one and multiplies the sum by the first integer. a*(b+c+d+f)

   */


myMethod(7,4,6,-7,100);  //721

myMethod(2.4, 5.6,7,9, 78.88);

myMethod(2.4, 5.6,7,9, 78.88);



    }

    public static void myMethod(int a, int ...numbers) {
        int sum = 0;

        for(int w:numbers) {
                sum += w;
        }
        System.out.println(sum*a);
    }

    public static void myMethod(double a, double ...numbers) {
        double sum = 0;

        for(double w:numbers) {
            sum += w;
        }
        System.out.println(sum*a);
    }


    public static void myMethod(int a, double ...numbers) {
        double sum = 0;

        for(double w:numbers) {
            sum += w;
        }
        System.out.println(sum*a);
    }
}
