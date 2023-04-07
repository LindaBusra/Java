package JavaLessons.day07_stringmanipulations;

public class StringManipulations10 {
    public static void main(String[] args) {




    //------------------------replace()-----------------------------------------------


        String str = "Java is OOP";

        str.replace("O", "*");

        System.out.println(str);    // no change because of line 14, because we did not assign it to str

        System.out.println(str.replace('O', '*'));  //Java is **P

        System.out.println(str.replace("Java", "*"));  //* is OOP




    //-------------------------------------------------------------------


    String st = "Jack is 13 years old, I think he seems 15.";
     //Example 1- Change all digits to "*" in the given String

    String newSt =  st.replaceAll("[0-9]", "*") ;   //Jack is ** years old, I think he seems **.

    System.out.println(newSt);


    //    \\p{Punct} means change all punctuation marks (.  ,  !  ? )
    System.out.println(st.replaceAll("\\p{Punct}", "*"));

    //    \\P{Punct} means different from all punctuation marks  (.  ,  !  ? )
    System.out.println(st.replaceAll("\\P{Punct}", "*"));

    System.out.println(st.replaceAll("[a-z]", ""));





    }
}
