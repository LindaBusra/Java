package Others.Topics.Enum;

public class Enum01 {

//enum (enumartors)
    public enum Seasons {
        WINTER, SUMMER, FALL, SPRING
    }
    public static void main(String[] args) {



        String browser = Seasons.WINTER.toString();
        Seasons brwsr = Seasons.WINTER;

        System.out.println(browser);

        switch(browser){
            case "WINTER":
                System.out.println("Snowboarding");
                break;
            case "SUMMER":
            case "SPRING":
                System.out.println("Fishing");
                break;
            case "FALL":
                System.out.println("Trekking");
                break;
            default:
                System.out.println("Undefined season");
        }



/*
Enum tipi, bir degiskene ontanimli sabit degerler tanimlama izin veren ozel java yapisidir.
Enum tanimladri, genelde bir kume icerisinde sabit sayida olan ve degismeyen degerler icin kullanilir
Java'da enum tanimlarken "enum" anahtar kelimesi kullanilir

Direk string olarak kabul ediyor. sabit degerler olduklari  icin buyuk  harfe  yazililrar

Enum tipki bir sinif gibi niteliklere ve yontemlere sahip olabilir.
Tek fark enum sabitlerinin genel, statik ve degistirilemez olmasidir.

Aylar, gunler, renkler gibi degismeyecek degerler de kullanilir

*/


        //https://www.youtube.com/watch?v=ercp3IFuZII  daha fazla ayrinti

    }

}
