package Others.MyPractice.P3;

public class Q66 {
    public static void main(String[] args) {
        /*
        /*
             Problem definition :
             Create a method called getSum.
             Its parameter is ArrayList.
             Remove all $s in array and sum all numbers
             The data type we return must be 'int'.
             if the result is less than 0, print -1.
             Example1:
             ArrayList = $13, $15, $20
             Answer = 48
             Example 2:
             ArrayList= $-13, $0, $0
             Answer = -1.
              */



        String arr[] = {"$13", "$15", "$20"};

        String srr[] = {"$-13", "$0", "$0"};

        getSum(arr);
        getSum(srr);


    }
    public static void getSum(String arr[]) {
        int sum=0;
        for(int i =0; i<arr.length; i++) {

            sum += Integer.valueOf(arr[i].replace("$", ""));
        }

        if(sum<0) {
            System.out.println("Result is: " + -1);
        } else {
            System.out.println("The sum is:" + sum);
        }
    }


}
