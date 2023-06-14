package Others.MyPractice.P2;

import java.util.HashMap;

public class Q37 {

    public static void main(String[] args) {



//Question- Type a code  to find the duplicate values of an array of integer values.



        //Type a code  to find the duplicate values of an array of integer values.

        Integer[] arr = {10, 12, 14, 23, 46, 52, 12, 10, 67};


        for (int i = 0; i < arr.length; i++) {

            for (int k = i + 1; k < arr.length; k++) {

                if (arr[i] == (arr[k])) {

                    System.out.print(arr[i] + " ");
                }
            }
        }


//---------------------------------------------------------------------------------------------------------


//find with amount

        int a[] = {1,2,3,4,2,3};
        String temp ="";


        for (int i = 0; i < a.length; i++) {
            int count = 1;
            for (int j = i + 1; j < a.length; j++) {

                if (a[i]==a[j]) {
                    count++;
                }
            }

            if (!temp.contains(String.valueOf(a[i]))) {

                temp = temp + a[i] + ":" + count + ", ";
            }
        }
        System.out.println(temp);


//------------------------------------------------------------------------------------------------------


        //solution with HashMap


        Integer[] arr1 = {10, 12, 14, 23, 46, 52, 12, 10, 67};
        HashMap<Integer, Integer> counter = new HashMap<>();

        for (int i = 0; i < arr1.length; i++) {
            int counter1 = 1;
            for (int k = i + 1; k < arr1.length; k++) {
                if (arr1[i] == (arr1[k])) {
                    counter1++;
                    counter.put(arr1[i], counter1);
                }

            }

        }
        System.out.println(counter);


//------------------------------------------------------------------------------------------------------






}
}
