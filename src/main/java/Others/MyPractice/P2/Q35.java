package Others.MyPractice.P2;

import java.util.Scanner;

public class Q35 {

    public static void main(String[] args) {


 //Question 4) A four-digit number ABCD is called  Lucky if A+B = C+D
//   Write a program that asks the user to enter a four-digit number and
//   tell if the number is a lucky number or not
//    Example: 3719 ==> 3+7 = 1+9  This is a Lucky number




 //ikbal beyin cozumu....



        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a  number");
        String x = scan.next();
        int sum1 = 0;
        int sum2 = 0;/////     12345 2.5 2 0,1,2             1234 4 || 2   0,1  <
        int sum3 = 0;
        int sum4 = 0;
        if (x.length()%2==0) {
            for (int i = 0; i < x.length() / 2; i++) {
                sum1 = sum1 + Integer.valueOf(x.substring(i,i+1));

            }
            for (int k = x.length()/2; k< x.length();k++){
                sum2=sum2 + Integer.valueOf(x.substring(k,k+1));
            }
            if (sum1 == sum2){
                System.out.println("lucky");
            }
        }

        if (x.length()%2==1){
            for (int i = 0; i < x.length() / 2; i++) {
                sum3 = sum3 + Integer.valueOf(x.substring(i,i+1));

            }
            for (int k = x.length()/2+1; k< x.length();k++){
                sum4=sum4 + Integer.valueOf(x.substring(k,k+1));
            }
            if (sum3 == sum4){
                System.out.println("Lucky B");
            }
        }
    }
}
