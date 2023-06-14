package Others.MyPractice.P4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q80_rpt {

    public static void main(String[] args) {

                /*
        Write a code that returns the duplicate chars in a String array.
        (interview Question)
        Input :
        String str=“Javaisalsoeasy”
        Output: [a, s]
         */


        //1.way
        String str = "Javaisalsoeasy";
        String arr[] = str.split("");


        ArrayList<String> list = new ArrayList<>();

        for(int i=0; i<arr.length; i++){

            for(int j=i+1; j<arr.length; j++) {

                if(arr[i].equals(arr[j]) && !list.contains(arr[j])) {
                    list.add(arr[i]);
                }
            }
        }

        System.out.println(list);






        //2.way
        char srr[] = str.toCharArray();

        System.out.println(Arrays.toString(srr));

        ArrayList<Character> output = new ArrayList<>();

        for (int i = 0; i < srr.length; i++) {
            for (int j = i + 1; j < srr.length; j++) {

                if (srr[i] == srr[j] && !output.contains(srr[j])) {

                    output.add(srr[j]);
                }
            }
        }
        System.out.println(output);


    }}
