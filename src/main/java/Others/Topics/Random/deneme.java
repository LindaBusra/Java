package Others.Topics.Random;

import java.util.Random;

public class deneme {

    public static void main(String[] args) {

        Random r = new Random(); //ssn
        int min1 = 200, max1 = 500;
        int randInt1 = r.nextInt(max1 - min1) + min1;

        int min2 = 10, max2 = 50;
        int randInt2 = r.nextInt(max2 - min2) + min2;


        int min3 = 2000, max3 = 5000;
        int randInt3 = r.nextInt(max3 - min3) + min3;


        String ssn = "" + randInt1 + "-" + randInt2 + "-" + randInt3;
        System.out.println(ssn);


        String str = "abcdefg";
        str.toUpperCase(); str.substring(3, 5);
        System.out.println(str);



    }
}
