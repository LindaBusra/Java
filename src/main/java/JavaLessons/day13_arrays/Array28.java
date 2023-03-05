package JavaLessons.day13_arrays;

public class Array28 {

    public static void main(String[] args) {


//where is "a" in "sunday" ?

        String sentence = "today is sunday and tomorrow is monday";   //find a in the sentence


        String str[] = sentence.split(" ");

        int countt = 0;
        for (int i = 0; i < str.length; i++) {

            if (str[i].contains("a")) {

                System.out.println("a is " + (str[i].indexOf("a") + ". character in the word " + str[i]));
                countt++;

            }
        }
        System.out.println("\nThere is " + countt + " \"a\" in the sentence");



//------------------------------------------------------------------------------------------------------------------




//  Type code to find array elements whose first and last characters are same


        String[] arr = new String[]{"alabama", "pick", "sos", "sets", "pex"};

        for(String w : arr) {

            if(w.substring(0,1).equals(w.substring(w.length()-1))) {

                System.out.print(w+ " ");


            }
        }


    }
}
