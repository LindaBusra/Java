package JavaLessons.day07_stringmanipulations;

public class StringManipulations10 {
    public static void main(String[] args) {




    //------------------------replace()-----------------------------------------------


        String str = "Java is OOP";

        str.replace("O", "*");

        System.out.println(str.replace('O', '*'));  //Java is **P

        //CharSequence-->String, tekli karakter kullanacaksam char'li secenegi kullanirim
        //old ve new'deki ayni data turu olmali

        System.out.println(str.replace("Java", "*"));  //* is OOP




    //-------------------------------------------------------------------


    String st = "Ali is 13 years old, I think he seems 15.";
     //Example 1- Change all digits to "*" in the given String

    String newSt =  st.replaceAll("[0-9]", "*") ;   //Ali is ** years old, I think he seems **.

    System.out.println(newSt);


    //isaretleri (.  ,  !  ? ) degistirmek
    System.out.println(st.replaceAll("\\p{Punct}", "*"));

    //isaretleri (.  ,  !  ? ) disindaki herseyi degistirmek
    System.out.println(st.replaceAll("\\P{Punct}", "*"));

    System.out.println(st.replaceAll("[a-z]", ""));






    }
}
