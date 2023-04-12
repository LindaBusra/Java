package JavaLessons.day08_forloop;

public class ForLoop09 {
    public static void main(String[] args) {



//Example 1- Type code to reverse a String, For example Tom-->moT

        String name = "radar";
        String temp = "";


        for(int i=name.length()-1; i>=0; i--) {

            temp =temp + name.charAt(i);

        }


        if (temp.equals(name)) {
            System.out.println("It is reverse");
        } else {
            System.out.println("It is not reverse");
        }


//----------------------------------------------------------------------------------------


//Example 2-Find the multiplication  of the integers from 3 to 6


        int mltp = 1;

        for(int i=3; i<7; i++) {
            mltp = mltp * i;

        }
        System.out.println("The multiplication  of the integers: " + mltp);



//----------------------------------------------------------------------------------------



//Example 3- Find the sum of the integers from 3 to 6

        int sum = 0;

        for(int i=3; i<7; i++) {

            sum += i;
        }

        System.out.println("The sum of the integers: " + sum);







    }
}