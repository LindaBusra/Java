package Others.javaQuestionBank_TechPro;

import java.util.Arrays;

public class Loops_70 {
    public static void main(String[] args) {

/*
31) Each line of input contains one or several words separated with single spaces. Type code to
reverse the order of words except the first and the last words in each line of input, while
preserving the words themselves. The lines of your output should not have any trailing or
leading spaces. Example; Kemal Can Tan Han Kuzu will be converted to Kemal Han Tan Can
Kuzu
 */


//        String str ="Kemal Can Tan Han Kuzu";
//        String space= " ";
//
//
//        //how many space in str
//        String a[] = str.split("");
//        int count = 0;
//        for(String w: a) {
//
//            if(w.equals(" ")) {
//                count++;
//            }
//        }
//
//        System.out.println(count);
//
//
//        //To sprit sentences to words
//
//        String b[] = str.split(" ");
//        System.out.println(Arrays.toString(b));
//
//
//
//
//        //for print the sentences
//
//        //1-print first word
//        for(String w: b) {
//
//            if(w.equals(b[0])) {
//
//                System.out.print(w);
//                if (count > 0) {
//                    System.out.print(space);
//
//                }
//                count--;
//        } }
//
//        //2-print middle words
//        for(int i=b.length-2; i>=1; i--) {
//
//                System.out.print(b[i]);
//                if (count > 0) {
//                    System.out.print(space);
//
//                }
//                count--;
//            }
//
//        //3-print last word
//        for(String w: b) {
//            if (w.equals(b[b.length - 1])) {
//
//                System.out.println(w);
//                if (count > 0) {
//                    System.out.print(space);
//
//                }
//                count--;
//            }
//        }


//Omer'in cozumu
        String a = "Kemal Can Tan Han Kuzu";
        String arr[] = a.split(" ");
        String brr[] = new String[arr.length];
        int b = arr.length-2;
        for (int i = 0; i< arr.length; i++){
            if (i==0){
                brr[i]= arr[i];
            } else if (i==arr.length-1) {
                brr[arr.length-1] = arr[arr.length-1];
            }
        }
        for (int i = 1; i< arr.length-1; i++){

            brr[i] = arr[b];
            b--;
        }
        System.out.println(Arrays.toString(brr));
        String c = "";
        for (int i=0; i<brr.length; i++){
            c = c + brr[i] + " ";
        }
        System.out.println(c);






    }
}
