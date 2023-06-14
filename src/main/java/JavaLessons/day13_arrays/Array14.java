package JavaLessons.day13_arrays;

public class Array14 {

    public static void main(String[] args) {


        //Java String toCharArray() method example

        String s1 = "Welcome to Javatpoint";
        char[] ch = s1.toCharArray();
        int len = ch.length;
        System.out.println("Char Arrays04 length: " + len);
        System.out.print("Char Arrays04 elements: ");
        for (int i = 0; i < len; i++) {
            System.out.print(ch[i]);
        }

        System.out.println();
    }
}
