package Batch159.day10_forloops;

public class ForLoops03 {

    public static void main(String[] args) {


        //Type code to print the unique digits in an integer. Example; 223878 ⇒ 37
        int number = 223878;

        String a = String.valueOf(number);

        for(int i=0; i<a.length(); i++) {

            if(a.indexOf(a.charAt(i)) == a.lastIndexOf(a.charAt(i))) {
                System.out.println(a.charAt(i));
            }
        }
    }
}
