package JavaLessons.day01_variables;

public class JavaMath {
    public static void main(String[] args) {


//        The Math.max(x,y) method can be used to find the highest value of x and y:

        int a = Math.max(5, 10);
        System.out.println(a);      //10


//        The Math.min(x,y) method can be used to find the lowest value of x and y:

        int b = Math.min(5, 10);
        System.out.println(b);      //5


//        The Math.sqrt(x) method returns the square root of x:

        Math.sqrt(64);
        System.out.println(Math.sqrt(64));  //8


//        The Math.abs(x) method returns the absolute (positive) value of x:

        Math.abs(-4.7);
        System.out.println(Math.abs(-4.7)); //4.7



//        Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):

        Math.random();

        System.out.println(Math.random());      // 0 to 100

        int randomNum = (int)(Math.random() * 101);  // from 0 to 100
        System.out.println(randomNum);

        int randomNum1 = (int)(Math.random() * 101+1);  // from 1 to 100
        System.out.println(randomNum1);





    }
}
