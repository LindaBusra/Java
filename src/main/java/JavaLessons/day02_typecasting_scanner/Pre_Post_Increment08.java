package JavaLessons.day02_typecasting_scanner;

import java.util.ArrayList;
import java.util.List;

public class Pre_Post_Increment08 {

    public static void main(String[] args) {


        //Question 1
        boolean flag = true;

        int result =15, i=10;

        do{
            i--;

            if(i==8) flag = false;
            result -= 2;

        } while(flag);

        System.out.println(result);



        //Question 2
        int x, y, z;
        x = 9;    y = 10;
        z = ++x + y++;

        System.out.println("X:" + x + " y:" + y + " z:" + z);








    }
}
