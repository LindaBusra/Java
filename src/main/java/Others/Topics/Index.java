package Others.Topics;

public class Index {
    public static void main(String[] args) {


//Example: Check if any character exists in a String or not

//1.way

        String tekst = "Ali Can";
        int check = tekst.indexOf("Ali");

        if (check == -1) {
            System.out.println("The caharcter is not exist");
        } else {
            System.out.println("The character is exists");
        }

//2.way

        boolean isContain = tekst.contains("X");
        if (isContain) {
            System.out.println("The caharcter is not exist");
        } else {
            System.out.println("The character is exists");
        }


        //Example 1

//        String str = "Cat, caterpillar";
//        int idx1 = str.indexOf("c");    //5
//        int idx2 = str.indexOf("cat");  //5
//        int idx3 = str.indexOf("s");    //if it does not exist= -1
//        int idx4 = str.indexOf("CAT");  //-1
//        int idx5 = str.indexOf("ter");  //7
//        int idx6 = str.indexOf("pars"); //-1
//
//        System.out.println("idx1:" + idx1 + " idx2:" + idx2 + " idx3:" + idx3 );
//        System.out.println("idx4:" + idx4 + " idx5:" + idx5 + " idx6:" + idx6 );
//
//        //fromIndex	An int value, representing the index position to start the search from
//
//        int idx7 = str.indexOf("a" , 3 );   //6  : the first "a" after index 3.
//        int idx8 = str.indexOf("at", 2);   //6
//        int idx9 = str.indexOf("at", 8);   //-1
//
//        System.out.println("idx7:" + idx7 + " idx8:" + idx8 + " idx9:" + idx9 );

// Example 2:

//        String str = "Cat, caterpillar";
//        int idx1 = str.lastIndexOf("a");    //14 : last index
//        int idx2 = str.lastIndexOf("at");   //6
//        int idx3 = str.lastIndexOf("s");    //-1
//        int idx4 = str.lastIndexOf("CAT");  //-1
//        int idx6 = str.lastIndexOf("pars"); //-1
//
//        System.out.println("idx1:" + idx1 + " idx2:" + idx2 + " idx3:" + idx3 );
//        System.out.println("idx4:" + idx4 + " idx6:" + idx6 );
//
//        int idx7 = str.lastIndexOf("a" , 3 );   //14   //3. indeksten sonraki en son a'nin en son gectigi yerin indeksi
//        int idx8 = str.lastIndexOf("a", 5);   //14
//        int idx9 = str.lastIndexOf("at", 2);   //6
//        int idx10 = str.lastIndexOf("at", 7);   //-1
//
//        System.out.println("idx7:" + idx7 + " idx8:" + idx8 + " idx9:" + idx9 + " idx10:" + idx10 );


// Example 3:

//          String str = "Cat, caterpillar";
//        String str1 = str.substring(0);     //0. indeksten itibaren yazinin kalani
//        String str2 = str.substring(3);     //3. indeksten otobaren (dahil) yazinin kalani
//        String str3 = str.substring(4);
//        String str4 = str.substring(15);
//        String str5 = str.substring(16);

//        System.out.println("str1:" + str1 + " str2:" + str2 + " str3:" + str3 + " str4:" + str4 + " str5:" + str5);

//        String str6= str.substring(5,8);  // cevap:cat -->5. indexten itibaren (dahil, 8'e kadar ama 8 dahil degil
//        String str7 = str.substring(3,4);  // cevap:,bosluk
//        String str8 = str.substring(5,5);  //sonuc yok
////    //  String str9 = str.substring(8,5);   //hata veriyor, 8 ve 5 arasini istedigi icin.
//
//        System.out.println("str6:" + str6 + " str7:" + str7 + " str8:" + str8 );


// Example 4:
        String str = "Cat, caterpillar";
        String str1 = str.toUpperCase();
        String str2 = str.toLowerCase();
        String str3 = str.substring(4).toLowerCase();  //bosluktan itibaren olur
        String str4 = str.substring(3, 8).toUpperCase();     //8 dahil degil
        String str5 = str.toUpperCase().toLowerCase();

        String strA = "Cat ";
        String str6 = strA.trim();  //bosluklari kesti
        String strB = " Cat";
        String str7 = strB.trim();
        String strC = " Cat ";
        String str8 = strC.trim();

        System.out.println("str1:" + str1 + " str2:" + str2 + " str3:" + str3 + " str4:" + str4 + " str5:" + str5);
        System.out.println("str6:" + str6 + " str7:" + str7 + " str8:" + str8);

        System.out.println(str4);


//------------------------------------------------------------------------------------------------------------------

//       Find the first occurrence of the letter "e" in a string, starting the search at position 5:

        String myStr = "Hello planet earth, you are a great planet.";
//                System.out.println(myStr.indexOf("e", 5));          //10   (5. indeksten sonraki e yni yeri 10 olur)

//------------------------------------------------------------------------------------------------------------------

// Sadece E04_02

//String E04_02= "merhaba canan";
//int i1 = E04_02.lastIndexOf("m");
//int i2 = E04_02.indexOf("c", 5);
//int i3 = E04_02.lastIndexOf("c", 5);        // anlayamadim !!!!!!!!!!
//
//        System.out.println(i1);
//        System.out.println(i2);
//        System.out.println(i3);


    }
}









