package Others.Topics.Questions;

import java.util.function.Function;

public class test3 {
    public static void main(String[] args) {

      Function<Integer, String> oddOrEven = x -> {   return x % 2 == 0 ? "even" : "odd"; };
        System.out.println(oddOrEven);


    }
}
