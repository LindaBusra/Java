package Others.MyPractice.P3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class q58 {


    public static void main(String[] args) {


                /*
        Given an integer array, return the array sorted lowest to highest.
        CHALLENGE: Write the Sort algorithm, don't use the .Sort() method provided to an array.
        arraySort([8, 13, 9, 12]) → [8, 9, 12, 13]
        */


        int a[] = {8, 13, 9, 12};

        for(int i=0; i<a.length; i++)

            for(int j=0; j<a.length; j++){

                if(a[i]<a[j]){

                    a[i]=a[i]+a[j];
                    a[j]=a[i]-a[j];
                    a[i]=a[i]-a[j];

                }
            }


        System.out.println("First way by using sorting algorithm");

        System.out.println(Arrays.toString(a));
        System.out.println("maximum element is "+a[a.length-1]);
        System.out.println("minimum element is "+a[0]);






//        System.out.println("Second way using Arrays.sort()...");
//
//        int b[] = {8, 13, 9, 12};
//        Arrays.sort(b);
//        System.out.println(Arrays.toString(b));
//        System.out.println("maximum element is "+b[b.length-1]);
//        System.out.println("minimum element is "+b[0]);
//
//
//
//
//        System.out.println("Third way using Collections.sort()...");
//
//        Integer c[]={8, 13, 9, 12};
//        List<Integer> list = Arrays.asList(c);
//        Collections.sort(list);
//
//        for(int i=0; i<c.length; i++){
//
//            c[i] = list.get(i);
//        }
//
//
//        System.out.println(Arrays.toString(c));
//        System.out.println("maximum element is "+c[c.length-1]);
//        System.out.println("minimum element is "+c[0]);

    }
}
