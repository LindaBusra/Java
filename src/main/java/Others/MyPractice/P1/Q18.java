package Others.MyPractice.P1;

import java.util.Arrays;

public class Q18 {
    public static void main(String[] args) {


//Write a code that returns the duplicate chars in a String array.(interview Question)
//Input :
//
//String str=“Javaisalsoeasy”
//Output: [a, s]

        String str="Javaisalsoeasy";

        String arr[] = str.split("");
        Arrays.sort(arr);
        String temp ="";


        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i].equals(arr[j])) {
                    count++;
                } else {
                    i = j - 1;
                    break;
                }
            }
            if (count != 1) {
                System.out.println(arr[i] + " = " + count);
            }

        }
    }
}
