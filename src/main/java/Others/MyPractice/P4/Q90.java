package Others.MyPractice.P4;

public class Q90 {

    public static void main(String[] args) {


//Which of following options have same output with the program?

        //a
        for(char i='a'; i<'d'; i++) {

            System.out.print(i + " ");          //a b c
        }


        //b
        System.out.print('a' + 'b' + 'c');      //294


        //c
        System.out.print('a' + " " +  'b' + " " + 'c' + " ");       //a b c



        //d
        char ch = 'a';

        while(ch<'d') {

            System.out.print(ch + " ");         //a b c

            ch++;

        }

        //e
//       System.out.print('a ' + 'b ' + 'c ');      //compile time error

    }
}
