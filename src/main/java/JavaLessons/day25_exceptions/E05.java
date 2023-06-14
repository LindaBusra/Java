package JavaLessons.day25_exceptions;


public class E05 {

    public static void main(String[] args) {


        char r1 = getCharacter("Java", 0);
        System.out.println(r1);//J

        char r2 = getCharacter("Java", 9);  //StringIndexOutOfBoundsException : If you use non-existing index for a String,
        System.out.println(r2);
        // you will get "StringIndexOutOfBoundsException"
    }


    //Create a method to get any character from a String

    public static char getCharacter(String str, int idx){

        char ch =' ';  //'X' if you want you can put any character instead of ' '
        try {
            ch = str.charAt(idx);
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("A problem occurred - " + e.getMessage());  //A problem occurred - String index out of range: 9
        }
        return ch;
    }



}