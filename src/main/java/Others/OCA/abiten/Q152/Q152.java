package Others.OCA.abiten.Q152;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Q152 {


    public static void main(String[] args) {
        List<String> lst = Arrays.asList("A", "B", "C", "D");
        Iterator<String> itr = lst.iterator();
        while (itr.hasNext()) {
            String e = itr.next();
            System.out.println(e);
            if (e == "C") {
                break;

            } else {
                continue;
//                System.out.println(e);    //It does not runs after the continue command
            }

        }

    }}