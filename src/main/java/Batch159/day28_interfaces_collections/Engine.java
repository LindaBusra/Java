package Batch159.day28_interfaces_collections;

public interface Engine extends Details {

    //in interface methods has not body. every method is abstract, so it is optional do write abstract.
    //all methods are public in interface. So we dont need to write public and abstract
    void run();

    //in interface all variables are final,  so we have to initialize them.
    //in interface all variables are public and static,
    int volume = 6;
    int weight();

    default void eco(){         //if a method is default it is not mandatory to override concrete method

        hybridEco();
        System.out.println("Honda engines are economic");
    }

    private void hybridEco(){
        System.out.println("Honda uses hybrid eco engines");
    }
}
