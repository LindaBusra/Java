package Batch159.day27_encapsulation_abstraction;

public class StudentRunner {

    public static final int pi = 3;  //You have to initialize(Assign value) the variable if it is final

    public static void main(String[] args) {


        Student std1 = new Student();
        System.out.println(std1.getStdId());    //TH2023FL

        std1.setStdId("AB2023VA");      //with set method we changed the value
        System.out.println(std1.getStdId());        //AB2023VA,  we are reading the value from object.

        //set() method makes the changes on the object.  Not on the class. We are working on the object
        //if I create a new object, the new object will have the original value again. Object is the instance of the class

        Student std2 = new Student();
        System.out.println(std2.getStdId());        //TH2023FL
        //every object will be created from class

//        pi = 12;     //can not assign value to a final variable
//        pi++;     //can not assign value to a final variable

    }
}
