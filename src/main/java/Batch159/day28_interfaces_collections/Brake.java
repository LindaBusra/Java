package Batch159.day28_interfaces_collections;

public interface Brake extends Details {    //make an interface child of another interface

    int price();
    int volume = 7;
    int weight();

    static void secure(){   //if a method is static it is not mandatory to override it
        System.out.println("Brakes work securely");
    }
}
