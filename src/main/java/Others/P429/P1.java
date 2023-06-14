package Others.P429;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.*;

public class P1 {

    public static void main(String[] args) {



        TreeMap<String, Double> salaries = new TreeMap<>();
        salaries.put("Tom Hanks", 3000.00);
        salaries.put("Mary Star", 1000.00);
        salaries.put("Jimmy Jones", 5000.00);
        salaries.put("Kevin Bridgeman", 6000.00);


        //a-Ekran ciktisi ne olur?
        Map.Entry<String, Double> map5 = salaries.lowerEntry("Paris Hilton");
        System.out.println( map5);              //Mary Star=1000.0


        //b-Ekran ciktisi ne olur?
        NavigableMap<String, Double> map3 = salaries.subMap("Kevin Bridgeman",true, "Tom Hanks",false);
        System.out.println(map3);

        //c-Ekran ciktisi ne olur?
        SortedMap<String, Double> map1 = salaries.tailMap("Kevin Bridgeman");
        System.out.println(map1);


        System.out.println("------------------------------------------------------------------------------");


        Map.Entry<String, Double> map8 = salaries.ceilingEntry("Mary Star");
        System.out.println(map8);


        Map.Entry<String, Double> map6 = salaries.higherEntry("Mary Star");
        System.out.println("map6" + map6);


        System.out.println("------------------------------------------------------------------------------");


        NavigableMap<String, Double> map2 = salaries.tailMap("Kevin Bridgeman", false);
        System.out.println(map2);



        NavigableMap<String, Double> map7 = salaries.tailMap("Kevin Bridgeman", false);
        System.out.println(map7);


        System.out.println("------------------------------------------------------------------------------");

        Map.Entry<String, Double> map4 = salaries.lowerEntry("Mary Star");
        System.out.println(map4);


        Map.Entry<String, Double> map10 = salaries.higherEntry("Tom Hanks");
        System.out.println(map10);

        NavigableMap<String, Double> map22 = salaries.tailMap("Kevin Bridgeman", false);
        System.out.println(map22);

//--------------------------------------------------------------------------------------------------

        int sum = 0;

        for(int i=567; i<=600; i++) {

            sum +=i;
        }

        System.out.println("sum: " + sum);


//--------------------------------------------------------------------------------------------------

        //For döngüsü kullanarak 50 ile 60 dereceleri arasını fahrenheit cinsinden ekrana yazdırınız.


        int fahrenheit;


        System.out.println("from celcius to fahrenheit");
        for(int i=50; i<=60; i++) {

            fahrenheit = (int) (i*1.8)+32;
            System.out.println(fahrenheit + " ");
        }


//-------------------------------------------------------------------------------------------------------------------------------


       // Size verilen bir String'deki 'c' den onceki characterleri yazdiriniz.   America ==> Ameri

        String m = "America";

        int index = m.indexOf("c");

        System.out.println(m.substring(0,index));


//-------------------------------------------------------------------------------------------------------------------------------


        /*

        Size verilen bir String'deki sesli harflerin sayisini bulan kodu yaziniz.

"Java ogrenince para kazanmak kolay, ogrenmeyince ne kolay ki.";

sesli harfler ==> a-e-i-o-u A-E-I-O-U
         */

        String list = "Java ogrenince para kazanmak kolay, ogrenmeyince ne kolay ki.";

        String list1 = list.toLowerCase();

        int count = 0;

        for(int i=0; i<list1.length()-1; i++) {

            if(list1.charAt(i)=='a' || list1.charAt(i)=='e' || list1.charAt(i)=='i' || list1.charAt(i)=='o' || list1.charAt(i)=='u' ) {

                count ++;
            }
        }

        System.out.println("sesli harf sayisi : " + count);




        //Bir sayının tam bölenlerini ve tam bölenlerinin toplamını bulun.

        int num=20;
        int summ = 0;

        for(int i=1; i<=20; i++) {

            if(num %i==0) {

                System.out.println(i+ " ");
                summ += i;
            }

        }

        System.out.println("Tam bolenlerin toplami: " + summ);



        //--------------------------------------------------------------------------------------------------

        //Bir String multidimensional array'de icinde "a" olan elemanlari consol'e yazdiriniz.

        String brr [ ] [ ] = { {"learn", "java", "it"}, {"is", "easy"} };



        for(String[] w : brr) {

            for(String n : w) {

                if(n.contains("a")) {
                    System.out.println(n);
                }
            }
        }


        //--------------------------------------------------------------------------------------------------

        //Bir String multidimensional array'de icinde "a" olan elemanlari consol'e yazdiriniz.

        String brr1 [ ]  = { "learn", "java", "it", "is", "easy" };

        int ch = 0;

        for(String w: brr1) {

            ch += w.length();
        }

        System.out.println(ch);


        System.out.println("\n Question with HashMap");
        HashMap<String, Integer> studentAge1 = new HashMap<>();
        studentAge1.put("Ali", 13);
        studentAge1.put("Tom", 21);
        studentAge1.put("Brad", 12);
        studentAge1.put("Ajda", 76);
        studentAge1.put("Cuneyt", 75);

        //Buna gore:

        studentAge1.put("Ayhan isik",null);
        System.out.println(studentAge1);



//Size verilen bir tam sayinin rakamlari toplamini ekrana yazdiran kodu yaziniz.
//sayimiz ==> "500"

        int number=500;

        int sumDigit=0;

        do{
            sumDigit += number%10;
            number = number/10;

        }while (number>0);

        System.out.println("The sum of digits: " + sumDigit);



        //Aşağıdaki şekli nested loop kullanarak oluşturun.

        System.out.println("\n Pattern sorusu");

        int rows=10;

        for(int i=1; i<=rows; i++) {

            System.out.print(i);
            for(int j=i; j<rows; j++) {

                System.out.print("*" );
            }
            System.out.println();
        }



//101 den 199 e kadar sayilarin toplamini veren kodu yaziniz.

        int number1 =101;
        int sum1=0;

        while(number1<200) {

            sum1 += number1;
            number1++;
        }

        System.out.println("the sum is: " + sum);



//----------------------------------------------------------------------------------------



        //Aşağıdaki şekli nested loop kullanarak oluşturun.

        System.out.println("\n Pattern sorusu");

        int rows1=10;

        for(int i=1; i<=rows1; i++) {


            for(int j=i; j<=rows1; j++) {

                System.out.print("*" );
            }
            System.out.println();
        }


//Verilen bir Listteki elemanlari tekrarsiz olarak yaziniz.
//            [2, 3, 2, 2, 5] ==> [2, 3, 5 ]

        System.out.println("\nList with unique elements");
        ArrayList<Integer>  unique= new ArrayList<>();
        unique.add(2);
        unique.add(3);
        unique.add(2);
        unique.add(2);
        unique.add(5);


        ArrayList<Integer>  unique1= new ArrayList<>();
        for(Integer w: unique) {
            if(!unique1.contains(w)){

                unique1.add(w);
            }
        }

        System.out.println(unique1);



        //"Aysegul" String'ini "A-y-s-e-g-u-l-" String'ine ceviren kodu yaziniz

        String ay ="Aysegul";
        String empty="";

        for(int i=0; i<ay.length(); i++) {

            empty += ay.charAt(i)+"-";
        }

        System.out.println("Yeni string :" +  empty);

//----------------------------------------------------------------------------------------

        //Aşağıdaki şekli nested loop kullanarak oluşturun.
        System.out.println("\n Pattern sorusu");


        int row=10;
        for(int i=10; i>=1; i--) {

            for(int j=i; j>=1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

//--------------------------------------------------------------------------------------------------


        //String bir Arrays04'de "Hanzel" ve "Hanzel" den onceki tum elemanlari ekrana yazdiriniz.
        //
        String arr1 [ ] = {"Betul", "Mustafa", "Hakan", "Hanzel", "Mete", "Mehmet"};


        for(String w:arr1) {

            if(!w.equals("Hanzel") ) {
                System.out.println(w);
            }

            if(w.equals("Hanzel")) {
                System.out.println(w);
                break;

            }

        }



//--------------------------------------------------------------------------------------------------


        //Size verilen bir cumledeki en uzun kelimeyi bulan kodu yaziniz.

        String  cumle = "Cahile söz anlatmak, deveye hendek atlatmaktan zordur.";
        String cumle1 = cumle.replaceAll("\\p{Punct}", "");



        String list2[] = cumle1.split(" ");
        int ilk=list2[0].length();





//--------------------------------------------------------------------------------------------------


//size verilen bir String'i ters ceviren kodu yaziniz.

        String ss ="merhaba";
        String sss[] = ss.split("");
        String temp1="";

        for(int i= sss.length-1; i>=0; i--) {

            temp1 += sss[i];
        }

        System.out.println(temp1);





//--------------------------------------------------------------------------------------------------


        //Size verilen String'de tekrarsiz characterleri ekrana yazdiriniz.
        //
        //"Hababam siniffi tatillddee."

        String str ="Hababam siniffi tatillddee.";
        String temp ="";

        String newStr[] = str.split("");

        for(String w:newStr) {

            if(!temp.contains(w)) {
                temp += w;
            }
        }

        System.out.println(temp);
        System.out.println("\n");

//--------------------------------------------------------------------------------------------------


       // Kullanicidan ismini aliniz ilk harfinin buyuk harf olup olmadigini kontrol ediniz.
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz:");
        String isim = scanner.next();

        boolean isBuyuk = isim.charAt(0)>='A' && isim.charAt(0)<='Z';
        System.out.println(isBuyuk);

//--------------------------------------------------------------------------------------------------

        System.out.println("\n1'den 5'e kadar olan sayıların kareleri");
 //1'den 5'e kadar olan sayıların karelerini ekrana yazdırıniz.

 for(int i=1; i<=5; i++) {

     System.out.println(i*i);
 }

//--------------------------------------------------------------------------------------------------

        LinkedList<String> myList = new LinkedList<>();
        System.out.println(myList);

        String a= "";
        System.out.println(a.isEmpty());
        System.out.println(a.isBlank());

        String ab= " ";
        System.out.println(ab.isEmpty());
        System.out.println(ab.isBlank());


//--------------------------------------------------------------------------------------------------


//java ile guzel dunya ==>cumlesinin aralarinda bosluk olmayacak sekilde yazdiran bir kod yaziniz.
        System.out.println("java \bile \bguzel \bdunya");


//-------------------------------------------------------------------------------------------
        System.out.println("\n sum of even numbers from 5 to 14 ");

        int toplam=0;

        for(int i=5; i<15; i++) {
            if(i%2==0 ){
                toplam += i;
            }


        }
        System.out.println(toplam);

//-------------------------------------------------------------------------------------------
        System.out.println("\n CharArray");

        /*
Char bir array olusturunuz.
Bu array'e 5 eleman ekleyiniz.
Bu array'deki sadece buyuk harfleri ekrana yazdiriniz.
         */

        char [] arr = { 'a', 'b', 'C', 'D', 'E'};

        for(char w:arr) {

            if(w>='A' && w<='Z') {
                System.out.println(w);
            }
        }

//-------------------------------------------------------------------------------------------
        System.out.println("\nIsimler Arrayi ");

//String bir Arrays04 olusturunuz ve "Hanzel" ve "Betul" haric tum elemanlari ekrana yazdiriniz.
//
String srr [ ] = {"Betul", "Mustafa", "Hakan", "Hanzel", "Mete", "Mehmet"};

for(String w: srr) {

    if(! w.equals("Hanzel") &&  ! w.equals("Betul") ) {

        System.out.println(w);
    }
}




//-------------------------------------------------------------------------------------------
        System.out.println("\n StudentAge");

        /*
    studentAge.put("Ali", 13);
    studentAge.put("Tom", 21);
    studentAge.put("Brad", 12);
    studentAge.put("Ajda", 76);
    studentAge.put("Cuneyt", 75);

    Buna gore:

    studentAge.put(null, 55);
    System.out.println(studentAge);
         */

        HashMap<String, Integer> studentAge = new HashMap<>();


        studentAge.put("Ali", 13);
        studentAge.put("Tom", 21);
        studentAge.put("Brad", 12);
        studentAge.put("Ajda", 76);
        studentAge.put("Cuneyt", 75);



        studentAge.put(null, 55);
        System.out.println(studentAge);


//-------------------------------------------------------------------------------------------
        System.out.println("\nfrom Counter class");

        Counter c1=new Counter();       //2

        Counter c2=new Counter();       //2

        Counter c3=new Counter();       //2





    }

    ////Öğrencilerin almış olduğu notların ortalaması hesaplayan bir ortalama methodu yazın. Notları dizi içerisinde tutup methoda diziyi gönderin.


    public static int notOrtalamasi(int ... a) {

        int sum=0;
        for(int w:a) {

            sum = sum + w;
        }

        return sum;
    }



}
