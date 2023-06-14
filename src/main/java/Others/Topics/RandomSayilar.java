package Others.Topics;

import java.util.Random;

public class RandomSayilar {

    public static void main(String[] args) {

        Random randomNum = new Random();    //bu sekilde nesne olusturdum

//        int randomSayi = randomNum.nextInt();   //-2 milyar ile +2 milyar arasinda sayi uretir
//        System.out.println(randomSayi);


        int randomSayi = randomNum.nextInt(11);   //-sayi 0 ile n-1 arasinda uretilir        System.out.println(randomSayi);
 //       System.out.println(randomSayi);                 //0-10 arasi degr uretir


        int randomSayi1 = randomNum.nextInt(11)+1;   //0'dan baslayacakken 1'den baslar, kaydirma degeri denir buna
//        System.out.println(randomSayi);

        //parantez icindeki deger olcekleme faktoru (scaleing), +dan sonraki yer kaydirma miktari(shifting)

        int randomSayi2 = 3*randomNum.nextInt(11)+1;  //uretilen sayilari 3 ile capmis olduk
//        System.out.println(randomSayi2);

        double doubleSayi = randomNum.nextDouble();
//        System.out.println(doubleSayi);         //0-1 arasinda rasyonel sayi uretir

        double doubleSayi1 = randomNum.nextDouble()+1;   //1den baslamsini istersem
//        System.out.println(doubleSayi1);

        double doubleSayi2 = randomNum.nextDouble()*6+1;   //6 ile carpsin
        System.out.println(doubleSayi2);







//        burda sorun var!!!!!!!!!!!!!!!
//        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
//        String randomString = "";
//        int length = 5;
//
//        RandomSayilar rand = new RandomSayilar();
////        int length = rand.nextInt(15);  o zaman kac harfli olacagi da rastgele olur
//        char[] text = new char[length];
//
//        for (int i = 0; i < text.length; i++) {
//            text[i] = characters.charAt(rand.nextInt(characters.length()));
//            randomString += text[i];
//        }


    }
}
