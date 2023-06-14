package Others.Topics.Constructor;

public class Student {

    String name;               //There is no static keyword.So it is instance variable. If it is instence I will attach den to the objects
                                //There is no any assignment, java put values : null
    static String college = "UNF";      //it is static, I will attach it to the calss

    Student(String name,String college ){
        this.name=name;
        this.college =college;
    }


    public static void main(String[] args) {

        //Constructor works for objects
        Student s1 = new Student("Mark" , "UCF");     //Constructor'a gider.
        Student s2 = new Student("Kevin", "FIU");

        System.out.println(s1.name);
        System.out.println(s2.name);

        System.out.println(s1.college);
        System.out.println(s2.college);

/*
Mark
Kevin
FIU
FIU
*/

    }
}
