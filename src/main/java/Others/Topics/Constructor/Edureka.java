package Others.Topics.Constructor;

public class Edureka {
    String studentName;
    int studentAge;
    String member;
    Edureka(){
        member = "YES";
    }
    Edureka(String name , int age){
        this();
        /* this is used for calling the default constructor
         *from parameterized constructor
         */
        studentName = name;
        studentAge = age;
    }
    void display(){
        System.out.println(studentName + " -" + studentAge+ "-"+ "Member" + member);
    }
    public static void main(String args[])
    {
        Edureka obj = new Edureka("Manan" , 21);
        obj.display();
    }
}