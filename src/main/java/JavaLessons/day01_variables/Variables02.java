package JavaLessons.day01_variables;

public class Variables02 {

    public static void main(String[] args) {

        String name; //This is declaration
        boolean isSheStudent;
        int score;
        double average;

        name = "John"; // This is assignment
        isSheStudent = true;
        score = 85;
        average = 78.3;

        int level = 1;

        level = 2;
        level =3;
        System.out.println(level); // After you do declaration, you can assign it many times

        // I am creating integer variable whose name is age

        int age = 12;

        // I am creating a char variable whose name is initial
        char initial = 'A';

        // Let's print the values of age and initial variables on th console

        System.out.println(age); // 12
        System.out.println(initial);

        //not
        System.out.println("-----------------");
        char ch = 66;
        System.out.println(ch);             //B
        System.out.println(ch + "cde");     //Bcde
        System.out.println(ch + 'c');       // 66 + 99 = 165
        System.out.println(ch + 3);         //69



        char chh = 98;   //b

        System.out.println(chh);  //b
        System.out.println(chh + 1);  //99
        System.out.println(chh + 'c'); //98+99 = 197
        System.out.println(chh + "d"); // bd


        char chr = 'A';
        System.out.println(chr);     //A
        System.out.println(chr +1);  //66
        System.out.println(chr + 'B');   //65+66=131
        System.out.println(chr + "B");       //AB
        System.out.println('A');        //A


        //not
        byte a = 127;
        System.out.println(Byte.MAX_VALUE); //127
        // byte b = a + 1;  //cast to 'byte'
        byte b = (byte) (a +1);

        System.out.println(b);      //-128
        System.out.println(b + 1);  // -128 + 1 = -127
        System.out.println(a+1);    //128


        // create 3 integer variables, assign values to them, print them on the console one by one
        // a) Print them on the console
        // b) Print the sum of the console one by one
        // c) Print the sum of the 3 integers by a label at the beginning. Example: 'The sum is 39'

        int i01 = 15, i02 = 9, i03 = 6;
        System.out.println(i01);
        System.out.println(i02);
        System.out.println(i03);

        System.out.println("The sum is " +(i01+i02+i03));



        // We need concatenation operation to add string and integer.
        System.out.println("The sum is: "+ i01 + i02 + i03); // "The sum is: "+1596
        System.out.println("The sum is: "+( i01 + i02 + i03));

        int sum = i01+i02+i03;
        System.out.println("The sum is " + sum); // This is better than previous one.



        //Create 2 integer variables and print their multiplication on the console with a label

        int x = 5, y =3;

        System.out.println("The multiplication is : " + (x*y));
        System.out.println("The multiplication is : " + x*y);
        System.out.println(20 + x*y);  //35
        System.out.println(20/ x*y);  //12

        /*
            Order of Operations in Math
            1) Do the operations inside the parenthesis first
            2) Do multiplication and division
            3) Do addition and subtraction
        */



  //Example - swap

        String a1 = "water";
        String b1 = "Kool-aid";
        String temp1 = "null";

        System.out.println(a1 + " " + b1);

        temp1 = a1;
        a1 = b1;
        b1 = temp1;

        System.out.println(a1 + " " +b1);




    }
}
