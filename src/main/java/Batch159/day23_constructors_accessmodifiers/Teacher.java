package Batch159.day23_constructors_accessmodifiers;

public class Teacher {

    public static int counter = 0;
    public int age = 45;


    public Teacher(int age) {           //it did not the take counter value automatically when I generate the constructor, because of it is static
        this.age = age;                 //after the assign the value, you should increase the value in the conteynir
        this.age++;                     //If I write just age++; it will not be increased!!!
        counter++;
    }
}
