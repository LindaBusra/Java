package Others.Topics.my_resurs;

import java.util.Scanner;

public class YazilimBilimi {
    //student class ismi oldu
    public static void main(String[] args) {

        //1 VIDEODA JAVA [ Java Programlama Dersleri ]  Yazilim Bilimi
        //https://www.youtube.com/watch?v=V_ARcCii8Ms&t=867s


        //Java Programlama Dersleri1
//JRE: Java Rutine Environment
//JDK:Java Development Kit
//Gelistirme ortami veya IDE:Eclipse, NetBeans,IntellijIDE)

/*
boolean-->true or false,  1bit
char-->character          2byte
byte-->sayi               1 byte
short-->sayi              2 byte
int-->sayi                4 byte
long-->sayi               8 byte
float-->ondalik sayi      4byte
double-->ondalik sayi     8byte         */









        //------------------------------------------------------------------------------------
        // System.out.println("Hello World");
        //main methodu. public:main methodun java tarafindan erisilebilir oldugunu gosterir.
        //static:javanin obje olusturmadan main methodu gormesi icin bu gerekli
        //void:obje dondurmedigini gosterir.

        //------------------------------------------------------------------------------------
/*
        int a=32;
        double b=3.14;
        float c=3.14f;   // floatta mutlaka sayinin yanina f konur.
        char d='A';
        String test="Test1";
        boolean e= false;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c );
        System.out.println("d: " + d);
        System.out.println("e: " + e);
        System.out.println("Test1: " + test); */
//------------------------------------------------------------------------------------
      /*   int a = 20;
         int b=15;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/(double)b);   //ondalik sonuc versin diye
        System.out.println(a%b);     */
//------------------------------------------------------------------------------------
       /* int a=5;
        a=a+1;   //a 6 oldu
        a += 1;  //a 7 oldu simdi
        a++;  //a 8 oldu
        System.out.println(a);   */
//------------------------------------------------------------------------------------
        //kullanicidan input almak

        /* Scanner scanner = new Scanner(System.in);
    // bu islem yapilmadan once en uste bu dahil edilmeli  import java.util.Scanner;


        int a, b;
        System.out.println("sayilarinizi giriniz");
        a=scanner.nextInt();
        b=scanner.nextInt();
        System.out.println("girdiginiz sayilarin toplami: " + (a+b));  */
//------------------------------------------------------------------------------------
     /*   Scanner scanner = new Scanner(System.in);
        int a;
        System.out.println("lutfen yasinizi giriniz");

        a=scanner.nextInt();
        if(a<18) {
            System.out.println("oy kullanamazsiniz");
        }
        else {
            System.out.println("oy kullanabilirsiniz");
        }

        */





        int a =10;
        System.out.println("a'nin degeri " + a--);  // a'nin varolan degerini bastirdi, ama arka planda a'nin degeri degisti
        System.out.println("a'nin degeri " + a++);
        System.out.println(a);  // a burda 10


        System.out.println("sonuc " + (5 >= 3));        //sonuc true

//--------------------------------------------------------------------------------------------

        int not = 55;

        if (not>=70) {
            System.out.println("gectiniz");
        } else {
            System.out.println("kaldiniz");
        }












//  --------------------------------------------------------------------------------------

     /*   Scanner scanner = new Scanner(System.in);
        System.out.println("Islemi seciniz");
        int process = scanner.nextInt();
        if(process==1) {
            System.out.println("Process 1");
        } else if(process==2) {
            System.out.println("Process 2");
        } else if (process==3) {
            System.out.println("Process 3");
        }else {
            System.out.println("islem gecersiz");

    } */

//  --------------------------------------------------------------------------------------
        /*
        //Vucut kitle indeksine gore sonuc
        double bki=26.2; //beden kitle indeksi

        if(bki<25){
            System.out.println("Zayif");
        }
        else if(bki>=25 && bki<30) {
            System.out.println("normal kilolu");
        }
        else{
            System.out.println("Obez");
        }
*/
//  --------------------------------------------------------------------------------------
    /*   int op=3;

       switch (op) {
           case 1:
               System.out.println("Islem 1");
               break;
           case 2:
               System.out.println("ISlem 2");
               break;
           case 3:
               System.out.println("ISlem 3");
               break;
           default:
               System.out.println("Gecersiz Islem");   //bunun altinda break olabilir de olmayabilir de.cunku altinda baska ihtimal yok
       }
*/
//  --------------------------------------------------------------------------------------
/*   //While dongusu

    int i=0;
    while(i<10) {
        System.out.println("i'nin degeri " + i);
        i++;    // i+=2 dersem ikiser ikiser artar  i++;
    }

*/
//  --------------------------------------------------------------------------------------
    /*        //for dongusu


       for(int i=0; i<10; i += 2) {  //i++; dersem birer arttirir.
           System.out.println("i'nin degeri :" + i);
       }
*/

//  --------------------------------------------------------------------------------------

 /*  int i=0;
   while(true) {
       System.out.println("i'nin degeri: " + i);
       if (i == 5) {
           System.out.println("Sistemden cikiliyor");
           break;
       }
       i++;
   }

  */

//  -------------------------------------------------------------------------------

 /*       //Girilen Sayının Basamak Sayısını Bulma

        Scanner scan = new Scanner(System.in);
        int sayac = 0;

        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();

        while(sayi > 0) {
            sayi /= 10;        // sayi = sayi / 10;
            sayac++;
        }
        System.out.println("Girdiginiz sayinin basamak sayisi = " + sayac);
*/

//  -----------------------------------------------------------------------------

/*
//Asal sayi bulma-1.yol
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        int sayac = 0;
        int i = 2;

        while(i < sayi) {
            if(sayi % i == 0) {
                sayac++;
            }
            i++;
        }
        if(sayac == 0) {
            System.out.println(sayi + " Asal bir sayidir.");
        }
        else {
            System.out.println(sayi + " Asal bir sayi degildir.");
        }

*/
//  ----------------------------------------------------------------------------

/*
//Asal sayi bulma-2.yol
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        int sayac = 0;

        for(int i = 2; i < sayi; i++)
        {
            if(sayi % i == 0) {
                sayac++;
            }
        }
        if(sayac == 0) {
            System.out.println(sayi + " Asal bir sayidir.");
        }
        else {
            System.out.println(sayi + " Asal bir sayi degildir.");
        }
*/

//  ----------------------------------------------------------------------------

/*

 //Faktoriyel bulma

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");


        int sayi = scan.nextInt();
        int faktoriyel = 1;
        for (int i = 1; i <= sayi; i++)
        {
            faktoriyel *= i;
        }
        System.out.println(sayi + "! = " + faktoriyel);
*/

//  ------------------------------------------------------------------

/*
//Java Palindromik Kelime Bulma:Palindrom = Tersten okunuşu da aynı olan cümle, kelime ve sayılara denilmektedir.

        Scanner scan = new Scanner(System.in);
        int sayac = 0;
        System.out.print("Kelime giriniz: ");
        String kelime = scan.nextLine();
        String yenikelime = "";

        for(int i = (kelime.length()-1); i >= 0; i--)
        {
            yenikelime += kelime.charAt(i);
        }
        if(yenikelime.equals(kelime)) {
            System.out.println("Girilen kelime Palindrom bir kelimedir.");
        }
        else {
            System.out.println("Girdiginiz kelime Palindrom bir kelime degildir.");
        }
*/

//  ------------------------------------------------------------------

/*
        // Java Girilen Sayının Rakamlarının Karelerini Bulma

        Scanner scan = new Scanner(System.in);
        int toplam = 0;
        int rakam;

        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();

        while (sayi > 0) {

            rakam = sayi % 10;
            System.out.println(rakam + "' ın karesi = " + (rakam * rakam));
            toplam += (rakam * rakam);
            sayi /= 10;
        }
        System.out.println("Girilen sayinin karelerinin toplamı = " + toplam);
*/

        //  ------------------------------------------------------------------

// Java Çarpım Tablosu Oluşturma
            for(int i = 1; i <= 10; i++)
            {
                for(int j = 1; j <= 10; j++)
                {
                    System.out.println(i + "X" + j + "= " + (i * j));
                }
                System.out.println("\n");
            }

//1-1'den 100'e kadar olan cift sayilari ekrana yazdir.

//        for(int i=1; i<101; i++) {
//
//            if(i%2==0) {
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println();


//------------------------------------------------------------


//2- Negatif bir deger girilene kadar kullanicidan girisleri kabul eden ve girilen degerlerdenn
//tek sayilari toplayip ekranda gosteren programi yazin :)


//int i=0, sum=0;
//
//while(true){            //sonsuz dongu olusturmasi icin yazdim
//
//
//    Scanner scan= new Scanner(System.in);
//    System.out.println("Bir sayi giriniz");
//    int num = scan.nextInt();
//
//    if(num<0) {
//        System.out.println("Negatif sayi verdiniz, programdan ciktiniz");
//        break;
//    } else if (num %2 == 0) {
//        continue;
//
//    } else {
//
//    if(num != 0 ) {
//        sum = sum+ num;
//
//    } }
//
//} System.out.println("Girdiginiz tek sayilarin toplami " + sum);




//Verilen bir sayidaki 2'nin katlarinin toplamini bulmak

//int num=5;
//int sum = 0;
//
//for(int i=1; i<num; i++) {
//    sum = (int) (sum + Math.pow(2,i));
//}
//        System.out.println(sum);
//        System.out.println();




//faktoriyel hesaplama

//        int numb1 = 5;
//        int fact1 =1;
//
//        for(int i=1; i<=numb1; i++) {
//            fact1 = fact1*i;
//        }
//        System.out.println("factoriyel with for " + fact1);
//
//
//
//        int numb2 = 5;
//        int fact2 =1;
//
//        while(numb2>0) {
//            fact2 = fact2*numb2;
//            numb2--;
//        }
//        System.out.println("faktoriyel with while" + fact2);



//int sayi1=3, sayi2=4;
//
//        System.out.println(Math.pow(3,4));



//Kullanıcıdan (negatif bir sayı girinceye kadar) pozitif sayılar
// alarak bu sayıların ortalamasını ekrana yazdıran bir program yazınız.

        int number, sum=0, count=0;


        do{
            Scanner scan= new Scanner(System.in);
            System.out.println("Bir sayi giriniz");
            number = scan.nextInt();

            if(number<0) {
                break;
            }
            sum = sum + number;
            count++;

        }while(true);
        System.out.println("Girilen sayilarin ortalamasi = " + sum/count);

//------------------------------------------------------------------------------------------





//   Example 3 : Type code to find the sum of the non-unique digits in an integer

//        int num = 123421;
//        String temp = "";
//       String numNew = String.valueOf(num);
//
//       for(int i=numNew.length()-1; i>=0; i--) {
//
//           if(numNew.indexOf(numNew.charAt(i)) != numNew.lastIndexOf(numNew.charAt(i)) ) {
//               temp = temp + numNew.charAt(i);
//           }
//
//       }
//
//        System.out.println("Non-unique digits in integer is :" + temp);
//
//
//        int nonUnique = Integer.valueOf(temp);
//
//       int reserve = 0;
//
//       for(int j=1221; j>0; j/=10) {
//
//           reserve = reserve + nonUnique%10;
//       }
//
//        System.out.println("the sum of the non-unique digits  " + reserve);






    }


}
