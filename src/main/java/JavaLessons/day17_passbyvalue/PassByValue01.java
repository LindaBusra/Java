package JavaLessons.day17_passbyvalue;

public class PassByValue01 {

    public static void main(String[] args) {


    int price = 20;         //original value, by using method we just use copy value
        System.out.println(price);          //20
    change(price);

    //price= change(price);    bu sekilde veriyi degistirebilirsin
        System.out.println(change(price));  //40
        System.out.println(price);          //20->java protect original value


 /*
1)When you use a variable inside a method, Java creates the copy of the variable and uses it inside the method.
Java does that for to protect the original value of the variables. This process is called "Pass by Value" in Java.
If in every method usage, the value changes, it creates very big problems.

2)Java uses "Pass by Value" everytime.
3)The opposite of "Pass by Value" is "Pass by Reference", Java does not use "Pass by Reference"
Some programming languages don't use "Pass by value" they use "pass by reference". Original will change
in every method usage. It does not protect the original value.

3-If you insist on changing original value in java you can do it as well.
Assign the updated value to the original variable the original value will be updated.
 */


    }
    public static int change(int a) {

        return a*2;
    }

}
