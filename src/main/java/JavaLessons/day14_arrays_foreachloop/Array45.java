package JavaLessons.day14_arrays_foreachloop;

public class Array45 {

    public static void main(String[] args) {


//Example 1-  Count the number of words starts with "w" in the String


        String str1 =  "Count the number of words starts with \"j\" in the String";
        String arr[] = str1.split(" ");

        int count= 0;

        for(String w : arr) {
            if(w.startsWith("w") || w.startsWith("W")) {
                count++;
            }
        }

        System.out.println( count + " words starts with \"w\" in the sentence");

        if(count==0) {
            System.out.println("There is not a word in that sentence");
        }
    }
}
