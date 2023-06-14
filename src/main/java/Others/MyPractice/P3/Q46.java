package Others.MyPractice.P3;

public class Q46 {

    public static void main(String[] args) {

        //Find if the number is perfect.  (6, 28, 496, 8128) (except itself the sum of all numbers which divider given number,
        //   must be equal to given number    //  INPUT      : 6           //   OUTPUT     :  1,2,3  -->1+2+3=6


        isPerfect(496);

        isPerfect(8128);


    }

    public static void isPerfect(int num) {

        int sum = 0;
        for (int i = 1; i<num;  i++){

            if(num%i == 0) {
                sum += i;
            }

        }

        if(sum==num) {

            System.out.println(num + " is perfect number");
        } else {
            System.out.println(num + " is not perfect number");
        }
    }
}