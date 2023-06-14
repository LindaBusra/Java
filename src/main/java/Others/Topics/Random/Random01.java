package Others.Topics.Random;
import java.util.Random;

public class Random01 {

    public static void main(String[] args) {


//Random sayi alma
        Random r = new Random(); //random sınıfı
        int a = r.nextInt(10);   //0'den 9'a kadar deger uretir.
        System.out.println(a);


        int b = r.nextInt(10) + 1;   //10 dahil olsun baslasin istersem.
        System.out.println(a);


        int c = r.nextInt();   //-2147483648 ve +2147486647
        System.out.println(a);

// long l = r.nextLong(); float f = r.nextFloat(); double d = r.nextDouble();

        int sayi = (int) (Math.random() * 10);  //
        System.out.println(sayi);

/*
   Java’da random sayı üretmenin bir diğer yolu yolu da Math sınıfında bulunan Random
    metodudur.Fakat bu metod 0.0 ile 1.0 arasında değer üretir.
    10 ile çarpmamızın sebebi, 0 ile 1 arasında double türünde değer üretmesidir
 */


        // 50-99 arası random bi sayı almak için
        //       Random r = new Random();
        int min = 55, max = 90;
        int randInt = r.nextInt(max - min) + min;
        System.out.println(randInt);










/*  Question 10) Create a method which gives you a random alphabetical character in
myClass Class then
print the following by using the method.
Print "First Character" for 'A' and 'a'
Print "Second Character" for 'B' and 'b'
Print "Third Character" for 'C' and 'c'
Print "Forth Character" for 'D' and 'd'
Print "Other Characters" for all others
       */


       /*
       If you want to generate an alphanumeric random character or use any other
       specific character set, you can do as follows.
        */

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        String alphabetLower = alphabet.toLowerCase();

//        Random r = new Random();  //yukarda tanimli

        int indexForRand = r.nextInt(alphabetLower.length());

        char ch = alphabetLower.charAt(indexForRand);  //r.nextInt(alphabet.length()) : random index degeri

        System.out.println(c);

        switch (ch) {
            case 'a':
                System.out.println("First Character");
                break;
            case 'b':
                System.out.println("Second Character");
                break;
            case 'c':
                System.out.println("Third Character");
                break;
            case 'd':
                System.out.println("Fourth Character");
                break;
            default:
                System.out.println("Other Characters");


        }
    }
}