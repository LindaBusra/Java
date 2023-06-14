package JavaLessons.day16_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List03 {
    public static void main(String[] args) {




// Arrays04 List

        List<String> isimler = new ArrayList<>();   // List<Object> isimler = new ArrayList<>();  dersem rakam vs de ekleyebilirim
        isimler.add("ali");
        isimler.add("veli");
        isimler.add("can");

        System.out.println(isimler);
        System.out.println(isimler.contains("veli"));   //iceriyor mu diye sordum.  true
        System.out.println(isimler.isEmpty());  //bos mu dedim, false dedi.
        System.out.println("index of veli" + isimler.indexOf("veli"));  //velinin indexsini sordum, 1

        List<Integer> rakamlar = new ArrayList<>();    //rakamlarla arraylist
        rakamlar.add(3);
        rakamlar.add(4);
        rakamlar.add(5);
        System.out.println(rakamlar);

        List<String> isimler2 = new ArrayList<>();      //ustteki arraylist'e ekleyecegim bir arraylist olusturdum
        isimler2.add("ayse");
        isimler2.add("zehra");
        isimler2.add("canan");

        isimler.addAll(isimler2);
        System.out.println(isimler);

        List<String> isimler3 = new ArrayList<>();  ////ustteki isimler araryin silecegim bir arary olusturdum simdi
        isimler3.add("ayse");
        isimler3.add("can");

        isimler.removeAll(isimler3);
        System.out.println(isimler);




    }
}
