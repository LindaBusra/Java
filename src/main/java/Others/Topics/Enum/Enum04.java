package Others.Topics.Enum;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Enum04 {

    public enum Sehirler{
        ISTANBUL, ANKARA, IZMIR, KUTAHYA, BOLU, RIZE, ARTVIN
    }

    public static void main(String[] args) {
        Sehirler sehrim =Sehirler.ISTANBUL;         //sehrim'e deger tanimladik
        System.out.println(sehrim);
        yasamSekli(Sehirler.ANKARA);

        Sehirler shr[] = Sehirler.values();
        System.out.println(Arrays.toString(shr));       //Dizi halinde yazdirma

        for(Sehirler t : shr) {                         //tek tek yazdirma
            System.out.print(t + " ");
        }

    }





public static void yasamSekli(Sehirler sehir) {
        if(sehir==Sehirler.ANKARA) {
            System.out.println("Tam memur sehri");
        } else if(sehir==Sehirler.ISTANBUL) {
            System.out.println("Yasanmasi zor");
        } else if (sehir==Sehirler.BOLU) {
            System.out.println("Guzel sehir");
        }


}


}
