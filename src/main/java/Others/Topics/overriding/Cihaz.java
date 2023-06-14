package Others.Topics.overriding;

import java.util.Scanner;

public class Cihaz {
    //ana sınıfımıza metot ve özelliklerimizi giriyoruz.
    String mesaj;
    String isim;
    public void gonder() {
        System.out.println("mesajınız gonderildi...");
    }
}

//extends anahtar kelimesi ile cihaz sınıfından miras alıyoruz
class telefon extends Cihaz {


    public void gonder () //metot override edildi.
    {
        System.out.println("Mesajınız gönderilemedi.");
    }

    //sub class'a (alt sınıf) yeni metot giriyoruz.
    public void goruntu()
    {
        System.out.println("Benim adım " + isim);
        System.out.println(mesaj);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        telefon tel = new telefon();//sub class (alt sınıf)'a ulaşmak için yeni bir nesne oluşturduk
        System.out.println("İsim giriniz.");
        String y = scanner.nextLine();

        //super class (süper sınıf) ulaşmak için bağlantı kuruyoruz.
        tel.mesaj = "Yarın isten erken cikmaliyim.";
        tel.isim = y;
        tel.goruntu();
        //metotları çağırıyoruz
        tel.gonder();


        //https://www.kodkampusu.com/javada-kalitim-inheritance/
    }
}
