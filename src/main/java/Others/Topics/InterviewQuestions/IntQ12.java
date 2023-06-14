package Others.Topics.InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class IntQ12 {

    public static void main(String[] args) {

        //find the sum of ages in given Map.

        HashMap<String, Integer> list = new HashMap<>();
        list.put("Ali", 10);
        list.put("Veli", 20);
        list.put("Selin", 15);
        list.put("Can", 12);
        list.put("Hakan", 18);
        list.put("Selma", 25);


        int sum = 0;
        for(Map.Entry<String, Integer> w: list.entrySet()) {

            System.out.println(w.getKey() + " = " + w.getValue());
            sum += w.getValue();
        }

        System.out.println(sum);

        //https://github.com/salptekin/java_interview_code_questions_updated/blob/main/src/javainterviewcodequestions/InterviewQuestion12.java
    }
}

