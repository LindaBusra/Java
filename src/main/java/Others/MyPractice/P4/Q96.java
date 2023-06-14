package Others.MyPractice.P4;

public class Q96 {
    public static void main(String[] args) {


//Type code to print digits just in the decimal part of the given
// decimal number with an asterix. For example; 75.4238 ⇒ *4*2*3*8


    //my solution
    double num = 75.4238;

    String num1 = String.valueOf(num);

    int indexDat = num1.indexOf(".");


    String num2 = num1.substring(indexDat+1 );

            System.out.println(num2);

    for(int i=0; i<num2.length(); i++) {

        System.out.print("*" + num2.charAt(i));
    }
        System.out.println();


//2.way

    double n = 75.4238;
    String str = String.valueOf(n);

    String s = "";

    String decPart = str.split("\\.")[1];  //. when we split it with "." we have to use \\ before it.

//when we use "." in split() method use it "\\."

        int i = 0;
    do{
        String r = decPart.substring(i, i+1);
        s = s + "*" + r;

        i++;

    }while(i<decPart.length());

        System.out.println(s);










    }
}
