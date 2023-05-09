package JavaLessons.day15_multidimensionalarray;

public class MultiDimensionalArrays11 {
    public static void main(String[] args) {


 /*

    Write the Java code that evaluates the test results of the students using the method
     // students' answers
    char[][] answers = {
    {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
    *
    * // answer key
    char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
    output:
Student 1 has 8 correct answers
Student 2 has 4 correct answers
Student 3 has 7 correct answers
Student 4 has 5 correct answers
*/



        char[][] answers = {
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'A', 'C', 'A', 'E', 'A', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'C', 'C', 'C', 'D', 'C', 'E', 'E', 'E'}};


        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        answer(answers, keys);


    }

    public static void answer(char answers[][], char keys[]) {

        for(int i=0; i<answers.length; i++) {
            int count = 0;

            for(int j=0; j<keys.length; j++) {

                if(answers[i][j]==keys[j]) {
                    count++;
                }
            }
            System.out.println("Student " + (i+1) +  " has " + count+ " correct answers") ;


        }

    }
}
