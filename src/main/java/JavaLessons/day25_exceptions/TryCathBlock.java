package JavaLessons.day25_exceptions;

public class TryCathBlock {
    public static void main(String[] args) {



//Syntax of try block with catch block

    try{
       //statements that may cause an exception
    }catch(Exception e){
      //statements that will execute when exception occurs
      ///This catch block catches all the exceptions
    }




//Syntax of try block with finally block

    try{
       //statements that may cause an exception
    }finally{
      //statements that execute whether the exception occurs or not
    }



//Syntax of try-catch-finally in Java


    try{
       //statements that may cause an exception
    }catch(Exception e){
      //statements that will execute if exception occurs
    }finally{
      //statements that execute whether the exception occurs or not
    }




//        public void myMethod() {
//            try {
//                // Statements that might throw an exception
//            }
//            catch (ArithmeticException e) {
//                // Exception handling statements
//            }
//            catch (NullPointerException e) {
//                // Exception handling statements
//            }
//        }



//        public void myMethod() throws ArithmeticException, NullPointerException
//        {
//            // Statements that might throw an exception
//        }
//
//        public static void main(String args[]) {
//            try {
//                myMethod();
//            }
//            catch (ArithmeticException e) {
//                // Exception handling statements
//            }
//            catch (NullPointerException e) {
//                // Exception handling statements
//            }
//        }
    }
}
