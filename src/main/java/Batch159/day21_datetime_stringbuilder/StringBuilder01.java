package Batch159.day21_datetime_stringbuilder;

public class StringBuilder01 {

    public static void main(String[] args) {

/*
        1)StringBuilder is a Class creates Strings for you.
        2)Normally we create Strings by using String Class, but Java gave us another class to create String because
        String Class gives you "immutable Strings" sometimes we need "mutable Strings" which StringBuilder gives.
        Immutable: Java will create a new container for every update. It is god for protecting original value.
        Mutable: New container will not be created. All updates will be on the same container. It is god for using memory


              */

        String str = "Java";                //Java creates a container in Heap memory, a reference in Stack memory. all Strings are in the same String pool
        System.out.println(str + "?");      //Java creates another container in Heap memory, does not touch the first one, it is immutability
        System.out.println(str + "!");      //Java creates another container in Heap memory, does not touch the first one, it is immutability
                                            //For every update you have new container

        //When we create Strings in java like that, Java does not create another container, just pointer is different
        String a = "Apex";      //with ref1
        String b = "Apex";      //with ref2
        String c = "Apex";      //with ref3


        StringBuilder sb = new StringBuilder("Java");   //Java creates a container in Heap memory, a reference in Stack memory

        sb.append("!");     //to update an existing String,  we use append() method.
        //Java does not create a new container, Java goes to Heap memory, and change the existing value with "Java!", the reference is the same with the old one


        //To be able to use "updated String" you have to do assignment in String Classes
        String ab = "Apple";
        System.out.println(ab);         //from pointer 1--->"Apple"
        ab = ab.concat("!");        //after this one, java breaks the pointer, and pointer goes to new container
        System.out.println(ab);
        //In java we have garbage collector, it scans the memory constantly, if java sees a container does not pointer, java deletes it automatically



        //The same question, with StringBuilder, we dont need to make assignment
        //To be able to use "updated String" no need to do assignment in StringBuilder Classes
        StringBuilder mm = new StringBuilder("Apple");  //Java creates a container in string pool, and creates a reference in stack memory
        System.out.println(mm);

        mm.append("!"); //when I update it, java goes the same container end update it.
        System.out.println(mm);


        //append() method is for joining StringBuilders like concat() method in String Class
        StringBuilder sb1 =  new StringBuilder("Mark");
        sb1.append(" Twain").append("!...");
        System.out.println(sb1);        //Mark Twain!...

        //length() and capacity() methods
        StringBuilder sb2 =  new StringBuilder("Mark");
        System.out.println(sb2.length());       //4
        System.out.println(sb2.capacity());     //20  (Java gives default 16 boxes automatically, by putting 4 characters we say give me 4 more boxes.


        StringBuilder sb3 =  new StringBuilder("Mark");
        System.out.println(sb3.length());       //0
        System.out.println(sb3.capacity());     //16


        StringBuilder sb4 =  new StringBuilder();       //it has 16 boxes
        sb4.append("Java");
        System.out.println(sb4.length());       //4   It puts characters in to empty boxes
        System.out.println(sb3.capacity());     //16  Number of boxes is not changed.


        StringBuilder sb5 =  new StringBuilder();       //it has 16 boxes
        sb5.append("Java").append("Python").append("Programming Language");
        System.out.println(sb5.length());  //The number of characters
        System.out.println(sb5.capacity()); //16+16 (like existing one)+2 =34
        //If you exceed the capacity, java gives you 16  + 2 more boxes


        StringBuilder sb6 =  new StringBuilder();       //it has 16 boxes
        sb6.append("Java").append("Python").append("Programming Language").append("!!!!!");  //34 + 34(existing characters) +2 =70
        System.out.println(sb6.length());       //35
        System.out.println(sb6.capacity());     //70


        StringBuilder sb7 =  new StringBuilder("Python");
        sb7.deleteCharAt(3);
        System.out.println(sb7);    //Pyton

        sb7.delete(1,3);  //first is inclusive, second is exclusive
        System.out.println(sb7);    //Pon


    }
}
