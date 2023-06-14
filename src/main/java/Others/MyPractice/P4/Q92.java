package Others.MyPractice.P4;

import java.util.Scanner;

public class Q92 {
    public static void main(String[] args) {

        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("pin kodunuzu giriniz");
        String girilenPin = scan.next();
        String sistemPin = "cevcev82";

        for (int i = 2; i >= 1; i--) {
            if (!girilenPin.equals(sistemPin)) {
                System.out.println("pin kodunuz hatali");
                System.out.println(i+ "hakkiniz kaldi");
                girilenPin=scan.next();

            }else{
                System.out.println("giris basarili");
                break;
            }



        }
        if(!girilenPin.equals(sistemPin)){
            System.out.println("hakkiniz bitti.");
        }else{
            System.out.println("giris basarili");
        }

//diger yontem:

        //Scanner scan = new Scanner(System.in);
        String pin ="said.12345";
        int girisHakki = 4;

        System.out.println("*****Hosgeldiniz*****");
        while(true){
            System.out.print("pin kodu giriniz : ");
            String girilenPin2 = scan.nextLine();

            if (pin.equals(girilenPin2)){
                System.out.println("basarili giris yaptiniz..:)");
                break;
            }else{
                System.out.println("yanlis giris yaptiniz...");
                girisHakki--;
                System.out.println("kalan giris hakkiniz :"  + girisHakki);
            }if(girisHakki==0){
                System.out.println("giris hakkiniz kalmadi.. sim kartiniz bloke oldu..");
                break;
            }

        }
    }}