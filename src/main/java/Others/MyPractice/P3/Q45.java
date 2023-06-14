package Others.MyPractice.P3;

public class Q45 {

    public static void main(String[] args) {



        calculateAverage("Ali", 55, 65, 40, 87);
        calculateAverage("Tom Hanks", 67, 90, 100, 45, 69, 90);
        calculateAverage("John Travolta", 45, 50, 65);

    }

    public static void calculateAverage(String name, double...m) {

        double sum =0;

        for(double w:m) {

            sum += w;
        }

 //     System.out.println(name + "'s Average of Exams: " + String.format("%.2f", sum/m.length));

        System.out.println("The average for " + name + " is:" + (sum/m.length));

    }
}
