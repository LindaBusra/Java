package Batch159.practice.practice03;

import java.util.Scanner;

public class Test {

    String studentName;
    String year =  "2020";
    static int counter = 1000;
    String studentId;


    public Test(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        studentName = scan.next();
        setStudentId();

    }


    public static void main(String[] args) {

        //If user enters "Ali Can" for the first student's name, and "Veli Han" for the second students name, what is the output?
        Test student1 = new Test();
        System.out.println(student1.studentName + student1.studentId);      //Ali20201001

        Test student2 = new Test();
        System.out.println(student2.studentName + student2.studentId);      //Veli20201002
    }


    public void setStudentId(){
        counter++;
        this.studentId = year + "" + counter;
    }

}
