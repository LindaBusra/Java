package Others.Topics.Constructor.ForExample;

public class Ogretmen {


    String isim = "yeni ogretmen ismi";
    String soyisim = "Yeni ogretmenin soy ismi";
    int yas =0;
    String brans = "Genel";
    String universite = "ITU";

    public static void main(String[] args) {


        Ogretmen og1 = new Ogretmen();
        og1.brans ="Matematik";
        og1.isim ="ayse";

        og1.soyisim = "selam";

        og1.yas = 25;


        System.out.println(og1.isim + " " + og1.soyisim + " " + og1.universite + " " + og1.brans + " " + og1.yas);


//https://www.kodkampusu.com/javada-kalitim-inheritance/
    }

}
