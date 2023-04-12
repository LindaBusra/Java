package JavaLessons.day06_methods_recursion;

public class Recursion02 {

    public static void main(String[] args) {


//Recursion is the technique of making a function call itself.
// This technique provides a way to break complicated problems down into simple problems which are easier to solve.


//Use recursion to add all of the numbers between 5 to 10.


        int result = sum(5, 10);

        System.out.println(result);


        System.out.println(sum1(5,10));
    }


    public static int sum(int start, int end) {

        if (end > start) {

            return end + sum(start, end - 1);

        } else {

            return end;

        }
    }


    //or

        public static int sum1(int start, int end) {

            if(end>start) {

                return start + sum(start+1, end);
            } else {

                return start;
            }
        }

    /*

    10+sum(5,9)
    9+sum(5,8)
    8+sum(5,7)
    7+sum(5,6)
    6+sum(5,5)
    5
  */

  }
