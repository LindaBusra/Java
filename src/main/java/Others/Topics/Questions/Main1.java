package Others.Topics.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Main1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(Arrays.asList("a", "b", "c"));
        for(String value :list) {
            if(value.equals("a")) {
                list.remove(value);
            }
        }
        System.out.println(list); // outputs [b,c]
    }
}
