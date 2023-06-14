package JavaLessons.day31_lambdafp;

public class UtilsClass {



    public static void printInSameLineWithASpace(Object str) {

        System.out.print(str + " ");
    }



    public static boolean checkToBeEven(int a){
        return a%2 == 0;
    }


    public static boolean checkToBeOdd(int a){
        return a%2 != 0;
    }


    public static int getSquare(int  a){

        return a*a;         //or ==> "Math.pow(X, 2);"
    }


    public static int getCube(int a){

        return a*a*a;
    }

    public static double getHalf(int a){

        return a/2.0;
    }

    public static char getLastChar(String str){

        return str.charAt(str.length()-1);
    }

    public static char getFirstChar(String str){

        return str.charAt(0);
    }


    public static int getSumOfDigits(int x){

        int sum=0;
        while(x!=0){
            sum += x%10;
            x=x/10;
        }
        return sum;
    }
}
