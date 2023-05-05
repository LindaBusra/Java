package Batch159.day19_arraylists_varargs;

public class Varargs01 {
    public static void main(String[] args) {     //String[] args -->parameters, if you put reel array in it, it calles argument


        System.out.println(add(3,5));
        System.out.println(add(3,5, 7));
        System.out.println(add(3,5, 7));
        System.out.println(addNew(3,5, 7, 9, 10));  //Arguments : actual data
        System.out.println(add(3));
        System.out.println(add());


    }

    /*
    1)Putting a parameter after varargs is a mistake
    2)Putting a parameter before varargs is okay.
    3)Putting multiple varargs as parameter is a mistake
    Note: Varargs must be used just once at the end

    Containers used in method parenthesis are called "Parameters"
    Actual data used in method parenthesis are called "Arguments"

     */

    //Create a method adds two integers
    public static int add(int a, int b) {       //put static keyword to be able to call it from main method
        return a+b;
    }

    //int v, int a, int b is parameters
    public static int add(int... v) {           // for  add(3,5, 7));-->v has [3,5,7] varargs works with arrays but it is flexible with size.
        int sum = 0;
        for(int w: v) {
            sum += w;
        }
        return sum;
    }


    public static int addNew(int c, int... v) {           // for  add(3,5, 7,8));-->c=3, v has [5,7,8] varargs works with arrays but it is flexible with size.
        int sum = 0;
        for(int w: v) {
            sum += w;
        }
        return c+sum;
    }

}
