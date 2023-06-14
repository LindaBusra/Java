package Others.OCA.abiten.Q028;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Q028 {

    public static void main(String[] args) {


        String[] arr = {"Hi", "How", "Are", "You"};
        List<String> arrList = new ArrayList<>(Arrays.asList(arr));
        if (arrList.removeIf(s -> { System.out.print(s);
            return s.length() <= 2;
        }) ) { // < 2
            System.out.println(" removed");

            System.out.println(arrList);
        }
    }
}
