package JavaLessons.day17_passbyvalue;

import java.util.ArrayList;
import java.util.List;

public class C05_PassByValueList {

    public static void main(String[] args) {

		/*
		 bir list oluşturalım.
		 sora list elemanlarını degiştir methodu yazıp orada list elemanlarından bazılarını degiştirelim.
		 method void olsun.
		 main methoda döndükten sonra yeniden listi yazdıralım
		 */

        List<String> harfler=new ArrayList<>();

        harfler.add("A");
        harfler.add("B");
        harfler.add("C");

        listElemanlarDegistir(harfler);

        System.out.println("maİN mETHODA DONUNCE LİST : " + harfler);  // Obje olunca işin içinde objenin kendisini degiştiremeyiz
        // Ama bazı elemanlarını degiştirebiliriz. Yani listenin bazı elemanlaını degiştirebilirz.
        // Ama listenin kendisini degiştiremeyiz.


        listDegistir(harfler);// Methodda yen deger atadıgım halde harfler listesi degişmedi.
        System.out.println("Liste yeni list atadıkan sonra Main methoda dönünce List : "+ harfler);
        // Java da list ve array gibi objeler içinde Pass By Value geçerlidir. Yani farklı bir methodda array veya liste yeni deger ataması
        // yaparsanız orjinal array veya list degişmez.

        // Liste eleman eklemek veya çıkarmakla degişmez.


    }

    private static void listDegistir(List<String> harfler) {   // methodda yeni deger atardgım halde harfler listesi degişmedi
        // elemanlarını yazmadık. listenin kendisini yazdık ama degiştiremedik
        // aşagıdakinde ise elemanları degiştirdik.

        harfler=new ArrayList<>();

        System.out.println("Liste yeni deger atayınca: "+ harfler);// Boş list oldu. Yeni deger atayınca.


    }

    private static void listElemanlarDegistir(List<String> harfler) {

        harfler.set(0, "D");     // İşin içinde obje olunca obje degişmez ama objenin elemanlarını degiştirebilirz.
        // Listenin kendisi degişmez ama elemanları degişir.

        System.out.println("METHODDA DEGİŞTİRDGİMİZ LİST : " + harfler);

    }

}
