package Others.Topics.Enum;

public class Enum03 {

    enum Level{
        DUSUK, ORTA, YUKSEK

    }


    public static void main(String[] args) {

     Level seviye = Level.DUSUK;

     switch (seviye) {

         case DUSUK:
             System.out.println("Dusuk seviye");
             break;

         case ORTA:
             System.out.println("Orta seviye");
             break;

         case YUKSEK:
             System.out.println("Yuksek seviye");
             break;
     }






    }
}
