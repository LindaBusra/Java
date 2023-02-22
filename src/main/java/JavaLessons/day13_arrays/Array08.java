package JavaLessons.day13_arrays;

public class Array08 {

    public static void main(String[] args) {


//Print the list elements if the number of characters is less than 4.


        String str[] = { "Tom", "Ole", "Reimund", "Vidar", "Einar", "Sigrun"};


        for(String m : str) {

            if(m.length()<4) {

                System.out.print(m + " ");
            }
        }
        System.out.println();           //Tom Ole



//-----------------------------------------------------------------------------------------------



//Print the list elements if you see "Vidar" stop printing

        String str1[] = { "Tom", "Ole", "Reimund", "Vidar", "Einar", "Sigrun"};

        for(String w : str1) {

            if(w.equals("Vidar")) {
                break;
            }
            System.out.print(w + " ");          //Tom Ole Reimund
        }
        System.out.println();



//-----------------------------------------------------------------------------------------------



//Print the list elements except "Einar" if there is

        String str2[] = { "Tom", "Ole", "Reimund", "Vidar", "Einar", "Sigrun"};

        for(String w:str2) {

            if(w.equals("Einar")) {
                continue;
            }
            System.out.print(w + " ");          //Tom Ole Reimund Vidar Sigrun
        }
        System.out.println();



//-----------------------------------------------------------------------------------------------

    }
}
