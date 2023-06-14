package Others.javaQuestionBank_TechPro;

public class Lopps69_1 {


    public static void main(String[] args) {

// Type a program to print the integers from 1 to 100 without using any loop

        printNumbers(100);


}


    static void printNumbers(int n) {
        if (n > 0) {
            printNumbers(n - 1);        //en son n yerine 2 koydu, n-1 yani 1 icin method calisti. ekrana 1 yazdi.
            System.out.print(n + " ");

        }
        return;
    }

}
