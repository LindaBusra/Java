package JavaLessons.day23_encapsulation_abstraction;

public class StudentRunner {


   /*  Encapsulation

   Encapsulation is "data hiding"
   To hide the data we make the access modifier "private"
   After "hiding data", you may need to "read" or "update" the data.
   To "read" or "update" the data we will create som methods.
   To "read" "encapsulation data" you should create "get()" methods, we name it "getters"
   To "update" "encapsulation data" you should create "set()" methods, we name it "setters"

    By using set() method we prevent confusion and save memory by creating just 1 object.

    "get()" and set()" methods are called "Java Beans"

    If a class is "immutable", it is impossible to change the value of the existing variable.
    If you want to make a class immutable do not create any "setter" methods.
   */


    public static void main(String[] args) {

      Student std1 = new Student();

      System.out.println(std1.name);

      System.out.println(std1.getStdId());


      std1.setDisease(null);                //or "Cancer"
      System.out.println(std1.getDisease());

      std1.setStdGpa(4.0);                  //the value on the object happend 0
      System.out.println(std1.getStdGpa());



    }

}
