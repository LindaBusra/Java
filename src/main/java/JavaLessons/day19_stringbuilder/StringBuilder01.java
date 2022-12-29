package JavaLessons.day19_stringbuilder;



public class StringBuilder01 {

    public static void main(String[] args) {

    //What is "StringBuilder Class"? It is for creating "Mutable Strings"

    /*We use "String Class" to create a String, why or when we will need "StringBuilder Class".
    String Class is "immutable", "StringBuilder Class" is mutable.

    String Class is "immutable", because of that id does not change existing value.
    If you want to assign a ny value to a variable, java create a new container inside the String Pool(contains all String inside it)
    then will put new value in it, then changes the address pointer the new container.

    Java has a garbage container.
    If any container does not any address pointer "garbage collector" removes the container from memory.

    Before removing things from memory Java "finalize" them. Without finalizing Java does not remove anything from memory.


    */


String name = "Tom";
name = "Mark";      //Java does not change that one.  Java will create another string in String Pool.



String s = "Jhon";      //java created an address for this one in stack. then has en adres
String r = "Jhon";      //it is same, java does not create a new container. then has another adres. To adress for same single container
                        // it is benefit of String.

        r = "Sam";      //java create a new container and put "Sam" in it. and give an adress. just r was updated.


//I want a separate container whose value is Jhon.
String u = new String("Jhon");   // it means, I need a new container, dont use any existing container.


//If you want to change the value directly, without creating new container in memory you can use "StringBuilder" class


        StringBuilder sb = new StringBuilder("Clara");

        sb = new StringBuilder("Jim");



    //How to create a StringBuilder Object.
    //1.way

    StringBuilder sb1 = new StringBuilder("Mary");
    System.out.println(sb1);        //Mary


    //2.way
    StringBuilder sb2 = new StringBuilder();
    System.out.println(sb2);        //Empty

    sb2.append("Clara");
    System.out.println(sb2);        //Clara

    sb2.append("Ocean");
    System.out.println(sb2);        //ClaraOcean

    // Method Chaining
    sb2.append("Miami").append("FL ").append("USA");
    System.out.println(sb2);  //ClaraOceanMiamiFL USA




    }
}
