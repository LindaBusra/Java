package Batch159.day17_arraylist;

public class ArrayList04 {

    public static void main(String[] args) {


        //How many "Sw" are there in this sentence?
        //What is the second occurrence of "Sw"?
        String str = "Sweet Sweat and other Sweat";

        int count = 0;

        for(int i=1; i<str.length(); i++) {

            String newTekst = str.charAt(i-1)+""+str.charAt(i);
            if(newTekst.equals("Sw")) {
                count++;

                if(count ==2) {
                    System.out.println("Second occurrence of \"Sw\" :" + (i-1));
                }
            }
        }
        System.out.println("There are " + count + " \"Sw\"  in sentence");
    }
}
