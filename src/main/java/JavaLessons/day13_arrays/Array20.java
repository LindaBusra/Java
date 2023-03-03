package JavaLessons.day13_arrays;

public class Array20 {
    public static void main(String[] args) {



//Find how many "a" in this array?

        String str ="Java, I like Java?";

        //1.way

        String str1 [] = str.split("");

        int count= 0;
        String find ="a";

        for(String w:str1) {

            if(w.equals(find)) {
                count++;
            }
        }

        System.out.println("There is " + count + " \"" + find + "\" in this sentences") ;



        //2.way

        String find1 ="a";
        String str2 [] = str.split(find1);

        int countOfA = str2.length-1;


        System.out.println("There is " + countOfA + " \"" + find1 + "\" in this sentences") ;



        //3.way

        String str3[] =str.split("");

        int howMany=0;
        String ch = "a";

        for(int i=0; i<str3.length; i++) {

            if(str3[i].equals(ch)) {
                howMany++;
            }
        }

        System.out.println("There is " + howMany + " \"" + ch + "\" in this sentences") ;





    }
}
