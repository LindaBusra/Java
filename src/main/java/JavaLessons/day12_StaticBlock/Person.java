package JavaLessons.day12_StaticBlock;

public class Person {

    String name;
    int age;
    int weight;
    double height;


    public Person() {                    //default constructor
        System.out.println("There is a new person");
        age = 1;
    }


    public Person(String isim, int yas, int kilo, double height) {  //polymorphism
        this();
        this.name = isim;
        this.age = yas;
        this.weight= kilo;
        this.height = this.height;

    }

    public static void main(String[] args) {

    //When an object created, constructor start to work
    Person i1 = new Person();
    Person i2 = new Person("Saly", 32, 76, 1.83);

    i1.height =1.75;
    i1.weight=60;
    i1.age = 30;
    i1.name = "Mary";

        System.out.println("1.person: " + "name:" + i1.name + ", age:" + i1.age +
                ", height:" + i1.height + ", weight: " + i1.weight);

        System.out.println("2.person: " + "name:" + i2.name + ", age:" + i2.age +
                ", height:" + i2.height + ", weight: " + i2.weight);




    }


}
