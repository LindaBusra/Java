package Others.Topics.Constructor;

import java.util.Scanner;

public class Scole {
    String studentName;
    String year = "2020";
    static int counter = 1000;
    String studentId;

    public Scole (){            //No return type, so it is constructor
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        studentName = scan.next();
        setStudentId();         //I call this method
     }

    public static void main(String[] args) {

        Scole student1 = new Scole();
        System.out.println(student1.studentName + student1.studentId);

        Scole student2 = new Scole();
        System.out.println(student2.studentName + student2.studentId);

        //If user enters "Ali Can" for the first students name, and "Veli Hasan" for the second student.
    }

    public void setStudentId() {
        counter++;
        this.studentId =  year + "" + counter;
    }

}
