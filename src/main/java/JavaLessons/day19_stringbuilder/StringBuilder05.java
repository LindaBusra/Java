package JavaLessons.day19_stringbuilder;

public class StringBuilder05 {

    public static void main(String[] args) {



        //How to learn capasity in a StringBuilder

        StringBuilder sb3 = new StringBuilder();
        sb3.append("Jackson");      //j a c k s o n -->after using append length metod give me 7
        sb3.append("Mexico");       //j a c k s o n M e X i c o
        sb3.append("The USA");      //j a c k s o n M e X i c o T h e -->java add 16 more character, and 2 more   (2 times previous capacity+2 more)

        int numOfChars = sb3.length();
        System.out.println(numOfChars);     //0

        int cap = sb3.capacity();
        System.out.println(cap);    //16


        StringBuilder sb4 = new StringBuilder(6);   //we can aasigi  the lengt like that. extend it is possible for java.
        sb4.append("LearnJava");
        sb4.deleteCharAt(0);  //earnJava

        StringBuilder sb5 = new StringBuilder(6);
        sb5.append("LearnJava");
        sb5.substring(5,9);  //Java. but!!!!
        System.out.println(sb5); //output:"LearnJava"  because, substring is for String, not for String builder
        //the originavalue dont be updated

        sb5.insert(0, "You");
        System.out.println(sb5);  //YouLearnJava
        sb5.setCharAt(8,'L');
        System.out.println(sb5);        //YouLearnLava


        ///if you exceed the existing capasity, java will increase the capacity
        //Like: 2*Existing Capacity + 2;
    }
}
