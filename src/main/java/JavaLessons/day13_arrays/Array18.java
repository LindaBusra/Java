package JavaLessons.day13_arrays;

public class Array18 {
    public static void main(String[] args) {


        //Find how many "a" are there in this array

        String[] characters = {"a", "b", "c", "d", "a", "b", "f", "a"};

        String find = "a";
        int counter=0;

        for(String w:characters) {

            if(w.equals(find)) {
                counter++;
            }
        }

        System.out.println("There is " + counter + " \"" + find + "\" in this array");


        //or

        int count = 0;
        String find1 = "a";

        for(int i =0; i<characters.length; i++) {

            if(characters[i].equals(find1)) {
                count++;

            }
        }
        System.out.println("There is " + counter + " \"" + find1 + "\" in this array");



    }
}
