package JavaLessons.day17_passbyvalue;

import java.util.Arrays;

public class C04_PassByValueArray {

    public static void main(String[] args) {

        int sayilar[]= {3,4,5,6};
        elemanDegistir(sayilar);

        System.out.println("eleman degiştir methodundan snra : " + Arrays.toString(sayilar));  // atama kalıcı oldu. 10-4-5-6 oldu.


        arrayiDegistir(sayilar);
        System.out.println("arrayi degiştir methodundan sonra : " + Arrays.toString(sayilar));  // Arrayin kendisi degişmedi. Yapısı,orjinali degişmedi.
        // 10-4-5-6  olarak kaldı
    }

    private static void arrayiDegistir(int[] sayilar) {  // Arrayin yapısını kendisini degiştiriyorum. Orjinalligini.
        // Arraye yeni bir uzunluk atadım,tamamı ile kendisini degiştirmek istedim
        sayilar=new int [6];
        System.out.println("arrayi degiştir methodunda : " + Arrays.toString(sayilar));  // içindeki elemanları degiştirdik.
        //  0-0-0-0-0-0
    }

    private static void elemanDegistir(int[] sayilar) {

        sayilar[0]=10;
        System.out.println("eleman degiştir methodu içerisinde: " + Arrays.toString(sayilar));   // 10-4-5-6 oldu. Elemanı degişti.



    }

}