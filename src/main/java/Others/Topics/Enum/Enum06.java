package Others.Topics.Enum;

public class Enum06 {

    enum Sinavlar{

        SINAV1(0.25),
        SINAV2(0.20),
        SINAV3(0.15),
        FINAL(0.40);

     double yuzde;

        Sinavlar(double y) {

            yuzde = y;
        }
    }

    public static void main(String[] args) {


        //sadece finalin yuzdesi
        System.out.println(Sinavlar.FINAL.yuzde);


        //ogrencinin notlari
        int not1=50;
        int not2=30;
        int not3=40;
        int final4 =50;


       //ortalama bulmak istersem

        System.out.println("ort: " +( not1*Sinavlar.SINAV1.yuzde + not2*Sinavlar.SINAV2.yuzde + not3*Sinavlar.SINAV3.yuzde + final4 * Sinavlar.FINAL.yuzde));




    }

}
