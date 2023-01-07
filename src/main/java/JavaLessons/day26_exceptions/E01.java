package JavaLessons.day26_exceptions;

public class E01 {
    public static void main(String[] args) {        //args: arguments




        printAge(25);   //When you call a method, you  use actual values inside the method parenthesis, they are called "arguments"

        try {
            printAge(-25);
        } catch (IllegalArgumentException e) {
            System.out.println("Age is not valid");             //--->first we declared problem in method. and say do that one
        }



        try {
            printWorkerAge(14);
        } catch (IllegalArgumentException e) {
            System.out.println("Age is not valid to be worker");        //--->first we declared problem in method. and say do that one
        }

    }


         //Create a method to print the given age.
        //for your daily live rules we can use that syntax because java don't know age.
        public static void printAge(int age) {              //if a method print just something, we made return type void

          if(age<0) {
              throw new IllegalArgumentException("Age can not be negative");         //if age<0, throw exception, dont excecute next code.  (throw, new, constructor)
          }
            System.out.println(age);

        }


        //Create a method to print workers age.
        public static void printWorkerAge(int age) {        //When you create method, you  use actual "variables" inside the method parenthesis, they are called "parameters"

            if(age<16) {                                //this is a rule from daily life. When you use throw you have to use object creation
                throw new IllegalArgumentException("A worker's age can not be less than 16");   //for that problem  --->go above
            }
            System.out.println(age);

        }







}
