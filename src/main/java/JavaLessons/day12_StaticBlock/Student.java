package JavaLessons.day12_staticblock;

public class Student {


        String name;
        int age;

        String phone;
        public static int numberOfStudent = 0;

        Student(){
            System.out.println("New student");
            numberOfStudent++;

        }

        Student (String name, int age) {
          this();
          this.name = name;
          this.age = age;

        }

    Student (String name, int age, String phone) {
        this();
        this.name = name;
        this.age = age;
        this.phone = phone;

    }

    public static void main(String[] args) {

            //1.way
            Student s1 = new Student();
            s1.age = 35;
            s1.name = "Ole";
        System.out.println( numberOfStudent + " " +s1.name + " " + s1.age);

            Student s2 = new Student();
            s2.name = "Mary";
            s2.age =  23;
        System.out.println( numberOfStudent + " " +s2.name + " " + s2.age);


        //2.way
        Student s3 = new Student("Ahmet",41);
        System.out.println( numberOfStudent + " " +s3.name + " " + s3.age);


        System.out.println(s1.age);

        System.out.println(add(3,4));

        Selamlama();


        Student s4 = new Student();
        Student s5 = new Student("John",25, "029-998877");
        System.out.println(s5.name + ", " + s5.age + ", " + s5.phone);


    }




public static int add(int a, int b) {

            return a+b;
}

public static void Selamlama() {
    System.out.println("merhabalar");
}



}














//
//    String name = "Emily";
//    int age = 20;
//    public static int student_Number = 0;
//
//    Student() {
//
//        System.out.println("A new student :");
//        student_Number++;
//    }
//    Student(String name, int age) {
//        this();
//        this.name = name;
//        this.age = age;
//    }
//
//
//    public static void main(String[] args) {
//        Student st1 = new Student("Oliver", 21);
//        System.out.println("Student number:" + student_Number + ", Name: " + st1.name + ", Age" + st1.age);
//        Student st2 = new Student("Ole", 32);
//        System.out.println("Student number:" + student_Number + ", Name: " + st2.name + ", Age" + st2.age);
