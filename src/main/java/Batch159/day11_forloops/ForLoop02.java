package Batch159.day11_forloops;

public class ForLoop02 {

    public static void main(String[] args) {

     /*
     Given a string str which only consists of characters 'A' and 'B', find the absolute difference
     between their number of occurrences.

     Input: "AAABAB"        Output:2
     Input: "AAAAAAAAB"     Output:7
     Input: "BB"            Output:2
      */

        String str = "AAAAAAAAB";
        int countA = 0;
        int countB = 0;

        for(int i=0; i<str.length(); i++) {

            if(str.charAt(i)=='A') {
                countA++;
            } else {
                countB++;
            }
        }

        System.out.println(Math.abs(countA-countB));

    }
}
