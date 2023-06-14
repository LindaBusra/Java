package JavaLessons.day10_dowhileloop;

public class DoWhile10 {

    public static void main(String[] args) {


        //Print the positive numbers which are less then 10 on the console except 3.
        int i=1;

        do{
            if(i != 3) {
                System.out.print(i+ " ");
                i++;
            } else {
                i++;
                continue;
            }

        } while(i<10);



//--------------------------------------------------------------------------------------



        //Print sum of the numbers between 11 and 21 on the console

        int x = 15, sum = 0;

        // Do-while loop
        do {

            // Execution statements(Body of loop)
            // Here, the line will be printed even if the condition is false

            sum += x;
            x--;
        }

        // Now checking condition
        while (x >= 10);

        // Summing up
        System.out.println("Summation: " + sum);






    }
}
