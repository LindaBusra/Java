package Others.Topics;

public class Bitwise {
    public static void main(String[] args) {

// initializing the values of a and b
        // https://www.geeksforgeeks.org/bitwise-operators-in-java/?ref=lbp

        int a=3; // 0+2+1 or 0011 in binary
        int b=6; // 4+2+0 or 0110 in binary

        // bitwise or
        int c= a | b;      //0111 -->4+2+1=7, normal ve islemi (sayilari alt alta yazdim)

        // bitwise and
        int d= a & b;       //0010-->2, normal veya islemi

        // bitwise xor
        int e= a ^ b;      // iki sayi farkli ise 1 verir, aksi durumda 0
                            //0101-->4+1=5

        // bitwise not
        int f= (~a & b)|(a &~b);
        int g= ~a & 0x0f;


        System.out.println(" a= "+ Integer.toBinaryString(a) );
        System.out.println(" b= "+ Integer.toBinaryString(b) );
        System.out.println(" a|b= "+ (a|b));
        System.out.println(" a&b= "+ (a&b));
        System.out.println(" a^b= "+ (a^b));
        System.out.println("~a "+ (~a));        //1100   bunu anlamadim, neden sonuc -4


    }
}
