package Others.Topics.Class;

public class Car {

//I defined fields, properties.
    private String color;
    public String model;
    public double engine;
    private int doors;

    private String owner;



    public void setColor(String color) {            //for to do private String color -->public
        this.color=color;
    }

    public String getColor() {            //for to use original String color
        return this.color;
    }

    //for to put set-get  click right bottom, generate-->select:Getter Setter, choose private properties.

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }


    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        if(doors==2 || doors ==4) {
            this.doors = doors;                 //just this values can be entered.
        } else {
            System.out.println("The dor number can just be 2 or 4!!!");
        }
    }



    public void start() {

        System.out.println("the car is running..");
    }

    public void stop() {

        System.out.println("the car stopped");
    }


}
