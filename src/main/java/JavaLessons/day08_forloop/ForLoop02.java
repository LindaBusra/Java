package JavaLessons.day08_forloop;

import java.sql.SQLOutput;

public class ForLoop02 {
    public static void main(String[] args) {



//Example 1- Put "*" between 2 consecutive characters and to
// the end in a String. For example; Java ==> J*a*v*a*


        String st = "Java";

        for(int i=0; i<=st.length()-1; i++) {

            System.out.print(st.charAt(i) + "*");
        }




//------------------------------------------------------------------------------------------------



//Example 2 - Find sum of digits  in given number.


//1.way

      String str = "3456";
        int sum=0;

for(int i=0; i<str.length(); i++){

    String digit = str.substring(i,i+1);
    sum = sum + Integer.valueOf(digit);
}

        System.out.println("The sum of digit: " + sum);

//2.way

    int num = Integer.valueOf(str);
    int sumDigit = 0;

    for(int i=num; i>=0; i--) {

        sumDigit = sumDigit + num%10;
        num=num/10;


    }

       System.out.println("The sum of digit: "+ sumDigit);


















    }
}
