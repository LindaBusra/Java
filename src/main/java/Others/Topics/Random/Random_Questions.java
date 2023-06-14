package Others.Topics.Random;

import java.util.Random;

public class Random_Questions {
    public static void main(String[] args) {


 //Rastgele sayi urettik

//        Random random =new Random();
//        int sayi = random.nextInt();
//        System.out.println(sayi);



//        int sayi1 = random.nextInt(5)+40;
        //40 ile alt limit belirledik, 5 ile 40-41-42-43-44 sayilarindan birini secmesini stedik

//        int sayi2 = random.nextInt(5)-40;
        //-40'tan itibaren -40, -39, -38, -37 ve -36 sayilarindan birini verecek


        //float veya double bir değer almak istersek, degerler 0-1 arasinda olacak
//        float sayi3 = random.nextFloat();
//        double sayi4 = random.nextDouble();


//        //Ben üst limiti 1 değil de 100 yapmak istersem
//        Random random = new Random();
//        float sayi = random.nextFloat()*100;
//        System.out.println(sayi);
//
//
//        float sayi5 = (random.nextFloat()*10)+5;  //yazarsam Çıktısı 5.0 dahil olmak üzere 15.0‘a kadarki
//        // float değerlerden birisi rastgele seçilecek.



 //------------------------------------------------------------------


/*        2 zar aynı anda atılsın.
        zarların toplamı 5 veya 12 ise KAZANDINIZ mesajı verilsin.
        Kişinin 10 E04_02 hakkı olsun. NOT: bu koşul if ile halledilsin.  */


        Random random = new Random();

        int toplam = 0;
        int deneme = 1;

        while (toplam !=5 && toplam !=12)
        {
            int zar1 = random.nextInt(6)+1;
            int zar2 = random.nextInt(6)+1;

            toplam = zar1 + zar2;
            System.out.println(deneme+". E04_02 başarısız.");

            deneme++;

            if (deneme == 10)
                break;
        }
        System.out.println(deneme+". denemede KAZANDINIZ");



//------------------------------------------------------------------
        Random r = new Random();
        String alphabet = "123xyz";
        for (int i = 0; i < 5; i++) {
            System.out.println(alphabet.charAt(r.nextInt(alphabet.length())));
        } // prints 5 random characters from alphabet








    }
}



