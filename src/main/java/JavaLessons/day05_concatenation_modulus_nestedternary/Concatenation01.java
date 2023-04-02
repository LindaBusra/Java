package JavaLessons.day05_concatenation_modulus_nestedternary;

public class Concatenation01 {
    public static void main(String[] args) {


 //Concatination: Joining Strings with each other or with other data types.
 //To do Concatination we have 2 options.
 //Use "+" sign. We can use this way with all data types
 //Use "concat()"  method. -->only string values. Inside the concat() parenthesis you can put just String



        String s = "Tom" ;
        String t =  "Hanks";

        int i = 12;
        int a = 5;
        char c = 'A';



        System.out.println(s + " " + t );   //Tom Hanks
        System.out.println( s + i + a);     //Tom125
        System.out.println( s + (i + a));   //Tom17
        System.out.println(i+a+s);          //17Tom



        System.out.println(i+s+a);          //12Tom5
        System.out.println("" + i + a + s);  //125Tom
        System.out.println(s + a*i);   //Tom60
        System.out.println(i + c +s);  //77Tom (first additional operation.. c=65)



        System.out.println(s + a*c);    //Tom325
        System.out.println(c + s + a);  //Atom5
        System.out.println(s+c+i);      //TomA12


        String m =50+30+"Amalie"+40+40; // 80Amalie4040
        System.out.println(m);//



        String s1="Tom ";
        String s2="Erik";
        String s3=s1.concat(s2);
        System.out.println(s3);         //Tom Erik



        System.out.println(s.concat(" ").concat(t)); //Tom Hanks


    }
}
