package Others.MyPractice.P4;

import java.util.Arrays;
import java.util.Collections;

public class Q74 {

    public static void main(String[] args) {


   /* Create a function that takes an array and the difference between the largest
  and the smallest numbers.   */

        Integer arr[]={12,8,54,43,8,-1};
        Integer smallest= Arrays.stream(arr).sorted().findFirst().get();
        Integer largest= Arrays.stream(arr).sorted(Collections.reverseOrder()).findFirst().get();
        System.out.println(largest-smallest);


        int min=arr[0];
        int max=arr[0];
        for (int w:arr){
            min=Math.min(min,w);
            max=Math.max(max,w);
        }
        System.out.println(max-min);
    }
}
