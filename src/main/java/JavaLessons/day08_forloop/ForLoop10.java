package JavaLessons.day08_forloop;

public class ForLoop10 {
    public static void main(String[] args) {


//Example-1) Type code to print characters except m in a String




        String str = "Andromeda";


        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch != 'm') {
                System.out.print(ch);
            }
        }

        System.out.println();


        //2nd way

        for(int j=0; j<str.length(); j++) {

            if(str.charAt(j)=='m') {
                continue;
            } else {
                System.out.print(str.charAt(j));
            }
        }
    }
}






















