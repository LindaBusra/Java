package Others.Topics.Enum;

public class Enum02 {

    enum Aylar{
        OCAK, SUBAT, MART, NISAN, MAYIS, HAZIRAN, TEMMUZ, AGUSTOS, EYLUL,
        EKIM, KASIM, ARALIK

    }

/*Bu verileri ekrana yazdirmak icn, driver sinifi icerisindeki ay adindaki degiskene atayarak enum
 degerlrine erisim sgaladim.


*/
public static void main(String[] args) {

    Aylar ay = Aylar.MAYIS;   //degr atama

    System.out.println(ay);

    System.out.println(ay.ordinal());       //INDEX NOSUNU VERDI
    System.out.println(ay.compareTo(Aylar.HAZIRAN));  // mayisin index degerinden haziranin index degerini cikariyor, 4-5=-1

    System.out.println(Math.abs(ay.compareTo(Aylar.HAZIRAN)));  //negatif degeri pozitfe cevirdim


/*Enum icindeki degerlere values() statik metodu ile ulasbailiriz.  values() metodu geriye bir dizi icerisinde
    Enum sabitlerinin degerini doner.  */

//ekrana yazdirdim

    Aylar aylarim[] = Aylar.values();    //dizi haline getirme

    for(int i=0; i<aylarim.length; i++) {
        System.out.print(aylarim[i] + " ");
    }
    System.out.println();



 //valueOf() metodu-->enum sabitini dondurur. bu turde bir enum sabiti dondurmek icin kullanilan tanimlayici
// ile tam olarak eslesmelidir.

    Aylar sectigimAy = Aylar.valueOf("OCAK");
    System.out.println(sectigimAy);
















}








}
