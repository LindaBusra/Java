package Others.Topics.Constructor;

public class Student02 {
    int number;
    String name;
    static String college ="ITS";

    Student02(int r, String n, String college){
        this.number = r;
        this.name = n;
        this.college = college;
    }
    public static void main(String args[]){

        Student02 s1 = new Student02(111,"Karan", "MIT");
        Student02 s2 = new Student02(222, "Aryan", "Harvard");
        Student02 s3 = new Student02(113,"Ayse", "UUU");

        System.out.println(s1.number);
        System.out.println(s2.number);

        System.out.println(s1.name);
        System.out.println(s2.name);

        System.out.println(s1.college);
        System.out.println(s2.college);
    }
}