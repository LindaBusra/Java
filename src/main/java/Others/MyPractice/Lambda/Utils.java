package Others.MyPractice.Lambda;

public class Utils {

    public static void printInSameLineWithSpace(Object o) {

        System.out.print(o + " ");

    }

    public static boolean checkToBeEven(int x) {

        return x % 2 == 0;
    }

    // public static boolean getMoreThanEight(int X){ return X > 8; }

    public static boolean checkToBeOdd(int x) {

        return x % 2 != 0;
    }

    public static int getSquares(int x) {
        return x * x;
    }


    public static void printElementWithAStar(Object a) {

        System.out.print(a + "*");

    }

    public static int getCube(int x) {

        return x * x * x;
    }

    public static double halfOfTheElements(int x) {

        return x / 2.0;
    }

    public static char getLastChar(String str) {

        return str.charAt(str.length() - 1);
    }

    public static char getFirstChar(String str) {

        return str.charAt(0);
    }


}