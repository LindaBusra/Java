package Others.MyPractice.P1;

import java.util.ArrayList;
import java.util.Arrays;

public class Q16 {

    public static void main(String[] args) {

            /*
	  If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
	  type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
	*/

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList( 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 ));
        ArrayList<Integer> list2 = new ArrayList<>();

        int count = 0;

        while (list1.size()>0) {
            int sum = 0;

            for(int i=0; i<count+1; i++) {

                sum = sum + list1.get(0);
                list1.remove(0);
            }
            list2.add(sum);
            count++;

        }
        System.out.println(list2);


    }
}
