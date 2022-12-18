package JavaLessons.day11_constructors_methodcall_statickeyword;

public class Main {

        String language;

        // constructor with no parameter
         Main()  {
             this.language = "Java";
         }

         // constructor with a single parameter

        Main(String language) {
             this.language = language;
         }

         public void getName() {
             System.out.println("Programming Langauage: " + this.language);
         }

         public static void main(String[] args) {

             Main obj1 = new Main();    // call constructor with no parameter

             Main obj2 = new Main("Python");    // call constructor with a single parameter

             obj1.getName();
             obj2.getName();

         }

}

