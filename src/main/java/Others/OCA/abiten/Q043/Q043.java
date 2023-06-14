package Others.OCA.abiten.Q043;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q043 {

    public static void main(String[] args) {
        String[] arr = {"Hi", "How", "Are", "You"};
        List<String> arrList = new ArrayList<>(Arrays.asList(arr));
        if (arrList.removeIf((String s) -> {  return s.length() <= 2; })) {         // if it is <=2 remove it, then print the others
            //System.out.println(s +" removed"); //s causes compilation error


            //it works
            if (arrList.removeIf((String s) -> { return s.length() <= 2;  })) {
                System.out.println(arrList + " removed");
            }
        }

    }}