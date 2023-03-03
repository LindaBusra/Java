package JavaLessons.day13_arrays;

public class Array21 {

    public static void main(String[] args) {



//Find the max number is an array


    double[] myList = { 223.4, -324.5, 150.0, 433.5, 551.5, 463.7, 59.7, -16.5 };

    double maxNum = 0.0;

    for(double w: myList) {

        if(w>maxNum) {

            maxNum = w;
        }
    }

        System.out.println("the max number in this array: " + maxNum);          //551.5



//------------------------------------------------------------------------------------------------------------


        //To find the average of an array

        double[] List = { 16.3, 7.5, 78.6, -20.4, 43.05, 45 };
        double sum = 0;

        for(double w:List) {

            sum+=w;
        }

        double average = sum/List.length;

        System.out.println("the average of this array: " + average);        //28.34166666666667





    }
}
