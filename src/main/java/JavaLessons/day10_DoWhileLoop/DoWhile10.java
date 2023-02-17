package JavaLessons.day10_DoWhileLoop;

public class DoWhile10 {

    public static void main(String[] args) {



        int i=1;

        do{
            if(i != 3) {
                System.out.print(i+ " ");
            } else {
                continue;
            }
            i++;

        } while(i<5);


//--------------------------------------------------------------------------------------


        int x = 21, sum = 0;

        // Do-while loop
        do {

            // Execution statements(Body of loop)

            // Here, the line will be printed even
            // if the condition is false
            sum += x;
            x--;
        }

        // Now checking condition
        while (x > 10);

        // Summing up
        System.out.println("Summation: " + sum);

    }
}
