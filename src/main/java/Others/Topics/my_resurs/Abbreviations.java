package Others.Topics.my_resurs;


import java.util.Scanner;

public class Abbreviations {
    public static void main(String[] args) {

//oop_: inheritance-polymorphism-capsulize-abstraction


//        List<Integer> list = new ArrayList<>(Arrays.asList(3, 5, 1, 2, 7, 9, 2, 3, 5, 7));

        //java ile guzel dunya ==>cumlesinin aralarinda bosluk olmayacak sekilde yazdiran bir kod yaziniz.
        System.out.println("java \bile \bguzel \bdunya");


//infinite loops-->sonsuza giren dongu. memory dolu olunca islem biter.


        char d = 'a';   //alfabetik mi?

//        // checks if c is an alphabet
//        if (Character.isAlphabetic(d))



        String text = "hello";
        char ar[] = text.toCharArray();     //convert to a String text2 to char array



//Close the scanner object
//       scan.close();



 //negatif sayiyi pozitife cevirmek
        int numara = -554;
        numara = Math.abs(numara);



//verilen integer degerini char'a donusturmek

        int m =65;
        char ne = (char)m; //A
        System.out.println(ne);


//verilen integer degerini String'e donusturmek
        int num = 12321;
        String fromNum = String.valueOf(num);


//        scan.useLocale(Locale.US);   //3.14 girince veya 3,14 girince hata vermesi durumunu duzeltmek icin. Locale kirmizi olursa import package diyecegiz

        //concat metodu
        String yazi = "Ali can";
        System.out.println(yazi.concat("!...").concat("Woowwww"));   //Ali can!...Woowwww

//binary'ye cevirmek

//        int a = 5;
//        System.out.println(Integer.toBinaryString(a));


//harfler sayilar ve alt tire isaretini kaldirmak

        String sst = "Ali can, 123_";
        System.out.println(sst.replaceAll("\\w", "")); //ekranda sadece virgul kalacak

        System.out.println("--------------------------------");



//------end Of the String----------------

        String str3= yazi.replaceAll("\\Z" , "*");
        System.out.println(str3);


 //-----------replace first---------------------

        System.out.println("----------replace first l to m");
        System.out.println(yazi.replaceFirst("l", "m"));


//------Start Of the String----------------

        System.out.println(yazi.replaceAll("\\A", "?"));


//concat metodu

        System.out.println("LAst index of a is: " + yazi.lastIndexOf("a"));   //Ali can!...Woowwww


//endsWith - startWith  (sadece string ile kullanilir, char yazilamaz icine)
        boolean isIt = (yazi.endsWith("Can")) ;
        System.out.println(isIt);
        boolean isIn = yazi.startsWith("Ali") ;
        System.out.println(isIn);


//su karakterden sonra bu kelime basliyor mu diye sorarsak (skip first 4 characters then check if the remining String is satarting with "c"
        System.out.println(yazi.startsWith("c",4));     //hangi yziyi aratiyorum, ve kacinci karakterden sonra
        System.out.println("--------------------------------------------------------------");


//Donusturme islemi
        String tekst = "$12.3";
        String newTekst = tekst.replace("$","");
        double x = Double.valueOf(newTekst);


//iki kelimeyi ayirma
        String name3 = "Tom Hanks";

        String firstName = name3.toUpperCase().split(" ")[0];
        String lastName = name3.toUpperCase().split(" ")[1];


//butun noktalama isaretlerini temizlemek -disindakileri temizlmek
        String str4 = "Wow!... Ali is 13 years old, and he is a university.";
        String strNew = str4.replaceAll("\\p{Punct}", "");


//butun noktalama isaretlerinin disindakilerini temizlmek
        String strNew2 = str4.replaceAll("\\P{Punct}", ""); //veya
        String strNew3 = str4.replaceAll("[^\\p{Punct}]", "");


        String pwd = "a1 !2  s def ";

        //Password must have  at least 8 characters different from space character
        boolean firstRule = pwd.replaceAll("\\s", "").length()>7;

        //Password must have at least 1 symbol
        boolean secondRule = pwd.replaceAll("[^a-zA-Z0-9]", "" ).length()>0;




        String str = "Ali is is 13 years old, I like Ali, Ali does not like me!...";

        //Example 1: How many punctutation marks are used in the given String
        // All punctuation marks: \\p{Punct}

        int res = str.replaceAll("\\P{Punct}", "").length();
        System.out.println(res);

        int res1 = str.replaceAll("[^\\p{Punct}]", "").length();
        System.out.println(res1);



// Absolute number:
        int number = -40;
        int newNumber = Math.abs(number);


//ikili/binary sisteme cevirmek
        int a = 5;
        System.out.println(Integer.toBinaryString(a));


String result2 = "busra";
        System.out.println(result2.startsWith("b"));   //true


//cumleyi keliemelre bolme...
        String name = "Tom Hanks";
        String iOfLastName = name.split(" ")[1].substring(0,1);
        //boslugu bulur, keser. iki String olur . Tom (index 0) ve Hanks(index1)

//cumledeki kelime sayisini bulma
String word= "I like to move it, move it";
int numOfWord = word.split(" ").length;  //how many word I have

//ilk ve son cumleyi yazdirdim
        String ab = "Welcome to my house";
        String first = ab.split(" ")[0];
        int lastWord = ab.split(" ").length;
        String last = ab.split(" ")[lastWord-1];

        System.out.println(first + " " + last);


//cumlede gecen son java'yi buldum... cumlede gecen ilk like kelimesini degsitirdim
        String r = "I like to study Java, learn Java, earn money, Java is easy.";
        int acb = r.lastIndexOf("Java");
        String newa = r.replaceFirst("like", "my");



//  int c1 = 'A';    ve  char c2 = 'A';     ikisi de gecerli, sonuclar data turune gore




//Stringi double'a cevirmek

//        String shirtPrice = "$ 12.99";
//        String bookPrice = "$ 35.99";
//
//        String shirt = shirtPrice.replace("$ ", "");    //12.99
//        String book = bookPrice.replace("$ ", "");      //35.99
//
//        double forShirt = Double.valueOf(shirt) ;
//        double forBook = Double.valueOf(book);
//
//        System.out.println(forShirt + forBook);  //48.98


 //integer degerini stringe cevirmek

//        int num3 = 123;
//
//        String s1 =String.valueOf(num3);
//        System.out.println(s1);
//        System.out.println(s1.length());


 /*
    Regex : Regular Expressions
    Regex represents a group of data.
    All digits:   [0-9]
    All lowercase letter: [a-z]
    All uppercase letter: [A-Z]
    All lowercase and uppercase letter: [a-zA-Z]
    All lowercase and uppercase letter: [a-zA-Z0-9]
    All characters different from digits : [^0-9]
    All characters different from vowels: [^aeiou]

    Space character \\s
    All characters different from space character \\S

    All digits:  \\d
    All characters different form digits \\D

    All upper and lowercase letters and digits and _: \\w
    Diffrent from All uppercase, lowercase letters and digits and _:\\W


    All punctuation marks:   \\p{Punct}
    Differnt from all puncttaion marks :  \\P{Punct}  or [^\p{Punct}]




     */

        //Split

        String fullName = "Tom Hanks";
        String iForName = fullName.trim().substring(0,1).toUpperCase();
        System.out.println("Initial of first name is: " + iForName);

        String iLastName = fullName.trim().toUpperCase().split(" ")[1].substring(0,1);
        System.out.println("Initial of last name is: " + iLastName);


        //basa karakter eklemek

        //        Prints !!!123-Start!!! on the console

        String s = "123-Start!!!";

        System.out.println(s.replaceAll("\\A", "!!!"));






        //basamak sayisi bulma
//        int sayi = 123;
//        int sayac = 0;
//
//
//        while(sayi > 0) {
//            sayi /= 10; // sayi = sayi / 10;
//            sayac++;
//        }
//        System.out.println("Girdiginiz sayinin basamak sayisi = " + sayac);



    //bir karakterden kac adet oldugunu bulma


        String y = "Merhaba dünya bu java örnekleri";
        int ac = y.length();
        int ad = y.replaceAll("a", "").length();
        int c = ac-ad;
        System.out.println(c);


        int count=0;

        for(int i=0;i<y.length(); i++) {

            if(y.charAt(i)=='a') {
                count++;
            }

        }
        System.out.println(count);





//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter Your Score");
//        String inputScore = input.next();                // inputScore can be number and also any letters.
//        if (!inputScore.matches("[0-9]+")) {       // checking inputScore is number . if inputScore is number <else> code run . Google it (in java Validation input be number)



//        if(w.startsWith("a"))




//            /*
//            As per Java regular expressions, the + means "one or more times" and \d means "a digit".
//            String regex = "[0-9]+";
//            String regex = "\\d+";
//             */


//          System.out.println("Enter the operation among +, -, *, /");
//          char operation = scan.next().charAt(0);




        //not:
//        Object checkNum = num%2==0 ? "even" : num+3;
//        System.out.println(checkNum);




//        String arr[] = str.split(" ");
//        System.out.println(Arrays.toString(arr));
//
//        Arrays.sort(arr, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.reverseOrder()));
//        System.out.println(Arrays.toString(arr));


        //to find mod with Math.floorMod();

        int f = Math.floorMod(16, 3);
        System.out.println(f);



        //reverse with StringBuilder
        String xx = "Java is easy";
        StringBuilder ss = new StringBuilder();
        ss.append(xx);

        System.out.println(ss.reverse());

    }
}
