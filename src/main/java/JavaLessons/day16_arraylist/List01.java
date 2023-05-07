package JavaLessons.day16_arraylist;

import java.util.ArrayList;
import java.util.List;

public class List01 {

    public static <Char> void main(String[] args) {

    //When you create an Array, you have to declare the length of the Array.
    //But when you use "Lists" no need to declare the number of elements at the beginning
    //"Lists" are flexible for length but arrays are not

    //Lists are for storing multiple data in the same data type
    //Lists store non-primitive data types, Arrays can not.
    //List can not store primitive data types.
    //List have many useful methods.  Arrays do not.

   //Arrays are so fast.  //Arrays uses memory so less.

    //How to create a List (Array List)

        //1.way;

        ArrayList<Integer> myList1 = new ArrayList<Integer>();

        //2.way
        ArrayList<Integer> myList2 = new ArrayList<>();

        //3.way
        List<Integer> myList3 = new ArrayList<Integer>();

        //How to print a list on the console;

        System.out.println(myList3);    // []   it means I have en list, but it is empty


        //How to add elements into a list
        //Note: add() methods puts the elements in insertion order
        myList3.add(12);
        myList3.add(7);
        myList3.add(23);


        System.out.println(myList3);        // [12, 7, 23]

        //How to add an element into a spesific index
        myList3.add(1,50);
        System.out.println(myList3);
        myList3.add(3,99);
        System.out.println(myList3);        //[12, 50, 7, 99, 23]



        //How to join two lists
        ArrayList<String> a = new ArrayList<>();
        a.add("A");
        a.add("B");

        ArrayList<String> b = new ArrayList<>();
        b.add("X");
        b.add("Y");
        b.add("Z");


        a.addAll(b);
        System.out.println(a);      //[A, B, X, Y, Z]
        System.out.println(b);      //[X, Y, Z]


        //I will put b  a specific sted
        a.addAll(1,b);
        System.out.println(a);      // [A, X, Y, Z, B, X, Y, Z]

        //How to get the number of elements in a List
        int sizeOfA =  a.size();
        System.out.println(sizeOfA);        // 8

        int sizeOfB =  b.size();
        System.out.println(sizeOfB);        //3

        //Not:When you talk about the number of elements in an array use "length of the array."
        //For the list we are using "size of the list"


//--------------------------------------------------------------------------------------


        //Example 1-Type code to check if the given list is emty or not

        ArrayList<Character> c = new ArrayList<>();
        c.add('X');
        c.add('X');


        //1.way
        if (a.size() == 0 ) {
            System.out.println("it is empty");
        } else {
            System.out.println("it is not empty");
        }



        //2.way- Java created a method to check if a list is empty or not
        //isEmpty() methods return "true", if the list has no ant elements
        //isEmpty() methods return "false", if the list has at least one element

        if(c.isEmpty()) {
            System.out.println("it is empty");
        } else {
            System.out.println("it is not empty");
        }
        //If java has a method specific functionality using the method is preferable


//--------------------------------------------------------------------------

//Type code to check if the list doesnt have any element different from
// space or the list has no any element?  []-->acceptable




        //How to check if an ArrayList has just space in it?

        //Java created a method to check if a list is empty or the list has just space in it.
        //It is "isBlank()" method

        ArrayList<String> d = new ArrayList<>();
        d.add(" ");
        d.add(" ");
        d.add(" ");
        d.add("a");
        System.out.println(d);      //[ , a]

        //to be able to use removeAll() method you need List, therefore we created a list contains space character

        ArrayList<String> e = new ArrayList<>();
        e.add(" ");


        //removeAll() method is used to remove multiple elements from a list
        //When you use removeAll() method, you will need a list stores the elements you want to remove
        d.removeAll(e);
        System.out.println(d);      //[a]

        if(d.isEmpty()) {
            System.out.println("The list is empty or has just space character");
        } else {
            System.out.println("The list has character/s different from space");
        }




//To remove first occurrence Java created a method which is remove();

        ArrayList<String> f = new ArrayList<>();
        f.add("Shoes");
        f.add("TV");
        f.add("Radio");
        f.add("Laptop");
        f.add("Shoes");
        f.add("Book");
        f.add("Shoes");
        System.out.println(f);

        f.remove("Shoes");      //remove(object) olani sectim
        System.out.println(f);





    }
}
