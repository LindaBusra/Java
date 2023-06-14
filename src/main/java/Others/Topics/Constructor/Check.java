package Others.Topics.Constructor;

public class Check {

    int a = 10;         //instance variable, there is not static keyword
                        //I don't atatch anything to Class. I have to attach it to every object
    public static void main(String[] args) {

        Check c1 = new Check();
        Check c2 = new Check();

        c1.a = 12;
        c2.a = 13;

        System.out.println(c1.a);       //12
        System.out.println(c2.a);       //13


/*
    - static variables are shared by all objects but instance variables are not

    - Static variables or methods can be accessed by using just class name

    - We have to create object to access non-static variables or non-static methods.
    OR we can say:
    - We have to create object to access Class members (variables + methods)

    -Other name of static variables is class variable and other name of instance variables is object variable





 */


    }

}
