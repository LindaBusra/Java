package Others.Topics.Constructor;

class Student3{
    int id;
    String name;
    int age;
    //creating two arg constructor
    Student3(int i,String n){
        id = i;
        name = n;
    }
    //creating three arg constructor
    Student3(int i,String n,int a){
        id = i;
        name = n;
        age=a;
    }
    void display(){System.out.println(id+" "+name+" "+age);}

    public static void main(String args[]){
        Student3 s1 = new Student3(111,"Karan");
        Student3 s2 = new Student3(222,"Aryan",25);
        s1.display();
        s2.display();
    }
}